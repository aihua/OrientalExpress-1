/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileUtil {
	public static String fileAppendPath(String pathPrefix, String pathSuffix) {
		return pathPrefix + (pathPrefix.endsWith(File.separator) ? "" : File.separator) + pathSuffix;
	}

	public enum Location {
		/**
		 * Load from the filesystem.
		 */
		FILESYSTEM,

		/*
		 * Load from the thread's context class loader
		 */
		CONTEXT_RESOURCE,

		/**
		 * Load a class resource
		 */
		CLASS_RESOURCE,

		/**
		 * Load a resource from the classpath
		 */
		CLASSLOADER_RESOURCE,

		/**
		 * Load a resource identified by an URI
		 */
		URL
	};

	/**
	 * Attempt to open a file/resource from a series of locations. This method is
	 * convenient but may not provide enough feedback (e.g., malformed URL) for some
	 * uses. The series of locations tried is the filesystem, thread context
	 * class loader, class resource, classloader (system classpath resource), and URL.
	 * @param clazz
	 * @param name
	 * @return input stream if found, or null otherwise.
	 */
	public static InputStream open(Class<?> clazz, String name) {
		return open(clazz, name, Location.FILESYSTEM, Location.CONTEXT_RESOURCE, Location.CLASS_RESOURCE,
				Location.CLASSLOADER_RESOURCE, Location.URL);
	}

	/**
	 * Attempt to open a file/resource from a series of locations. This method is
	 * convenient but may not provide enough feedback (e.g., malformed URL) for some
	 * uses.
	 * 
	 * @param clazz a class (can be null) for resource searches
	 * @param name the name of the file/resource
	 * @param locations a series of locations that will be searched.
	 * @return an input stream or null if the file/resource could not be found.
	 */
	@SuppressWarnings("resource")
	public static InputStream open(Class<?> clazz, String name, Location... locations) {
		InputStream in = null;
		for (int i = 0; i < locations.length; i++) {
			switch (locations[i]) {
				case FILESYSTEM:
					try {
						in = new FileInputStream(name);
					} catch (FileNotFoundException e) {
						// ignore
					}
					break;
				case CONTEXT_RESOURCE:
					ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
					if (contextClassLoader != null) {
						in = contextClassLoader.getResourceAsStream(name);
					}
					break;
				case CLASS_RESOURCE:
					if (clazz != null) {
						in = clazz.getResourceAsStream(name);
					}
					break;
				case CLASSLOADER_RESOURCE:
					if (clazz != null) {
						in = clazz.getClassLoader().getResourceAsStream(name);
					}
					break;
				case URL:
					try {
						in = new URL(name).openStream();
					} catch (MalformedURLException e) {
						// ignore
					} catch (IOException e) {
						// ignore
					}
					break;
			}
			if (in != null) {
				break;
			}
		}

		return in;
	}
}