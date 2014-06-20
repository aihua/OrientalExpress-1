package org.openfast;

import java.util.List;
import java.util.Map;

public interface Node {
	@SuppressWarnings("rawtypes")
	List getNodes();

	@SuppressWarnings("rawtypes")
	List getChildren(QName name);

	String getAttribute(QName name);

	QName getNodeName();

	@SuppressWarnings("rawtypes")
	Map getAttributes();

	boolean hasAttribute(QName name);

	boolean hasChild(QName name);

	void addNode(Node node);

	void setAttribute(QName name, String value);
}
