/*########################################################################
 *#                                                                      #
 *#                      Copyright (c) 2012 by                           #
 *#          Shanghai Stock Exchange (SSE), Shanghai, China              #
 *#                       All rights reserved.                           #
 *#                                                                      #
 *########################################################################
 */
package sse.ngts.common.plugin.step.business;

import sse.ngts.common.plugin.step.*;
import sse.ngts.common.plugin.step.field.*;

public class News extends Message {
    private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "B";

    public News() {
        super();
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public News(int[] fieldOrder) {
        super(fieldOrder);
        getHeader().setField(new MsgType(MSGTYPE));
    }

    public void set(NoLinesOfText value) {
        setField(value);
    }

    public NoLinesOfText get(NoLinesOfText value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NoLinesOfText getNoLinesOfText() throws FieldNotFound {
        NoLinesOfText value = new NoLinesOfText();
        getField(value);
        return value;
    }

    public boolean isSet(NoLinesOfText field) {
        return isSetField(field);
    }

    public boolean isSetNoLinesOfText() {
        return isSetField(NoLinesOfText.FIELD);
    }

    public void set(OrigTime value) {
        setField(value);
    }

    public OrigTime get(OrigTime value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public OrigTime getOrigTime() throws FieldNotFound {
        OrigTime value = new OrigTime();
        getField(value);
        return value;
    }

    public boolean isSet(OrigTime field) {
        return isSetField(field);
    }

    public boolean isSetOrigTime() {
        return isSetField(OrigTime.FIELD);
    }

    public void set(Headline value) {
        setField(value);
    }

    public Headline get(Headline value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public Headline getHeadline() throws FieldNotFound {
        Headline value = new Headline();
        getField(value);
        return value;
    }

    public boolean isSet(Headline field) {
        return isSetField(field);
    }

    public boolean isSetHeadline() {
        return isSetField(Headline.FIELD);
    }

    public void set(MDUpdateAction value) {
        setField(value);
    }

    public MDUpdateAction get(MDUpdateAction value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public MDUpdateAction getMDUpdateAction() throws FieldNotFound {
        MDUpdateAction value = new MDUpdateAction();
        getField(value);
        return value;
    }

    public boolean isSet(MDUpdateAction field) {
        return isSetField(field);
    }

    public boolean isSetMDUpdateAction() {
        return isSetField(MDUpdateAction.FIELD);
    }

    public void set(NewsID value) {
        setField(value);
    }

    public NewsID get(NewsID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NewsID getNewsID() throws FieldNotFound {
        NewsID value = new NewsID();
        getField(value);
        return value;
    }

    public boolean isSet(NewsID field) {
        return isSetField(field);
    }

    public boolean isSetNewsID() {
        return isSetField(NewsID.FIELD);
    }

    public void set(NewsCategory value) {
        setField(value);
    }

    public NewsCategory get(NewsCategory value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public NewsCategory getNewsCategory() throws FieldNotFound {
        NewsCategory value = new NewsCategory();
        getField(value);
        return value;
    }

    public boolean isSet(NewsCategory field) {
        return isSetField(field);
    }

    public boolean isSetNewsCategory() {
        return isSetField(NewsCategory.FIELD);
    }

}
