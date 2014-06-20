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

public class QuoteStatusReport extends Message {
	private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "AI";

	public QuoteStatusReport() {
		super();
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public QuoteStatusReport(int[] fieldOrder) {
		super(fieldOrder);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public void set(OrigClOrdID value) {
		setField(value);
	}

	public OrigClOrdID get(OrigClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrigClOrdID getOrigClOrdID() throws FieldNotFound {
		OrigClOrdID value = new OrigClOrdID();
		getField(value);
		return value;
	}

	public boolean isSet(OrigClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetOrigClOrdID() {
		return isSetField(OrigClOrdID.FIELD);
	}

	public void set(SecurityID value) {
		setField(value);
	}

	public SecurityID get(SecurityID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public SecurityID getSecurityID() throws FieldNotFound {
		SecurityID value = new SecurityID();
		getField(value);
		return value;
	}

	public boolean isSet(SecurityID field) {
		return isSetField(field);
	}

	public boolean isSetSecurityID() {
		return isSetField(SecurityID.FIELD);
	}

	public void set(Text value) {
		setField(value);
	}

	public Text get(Text value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public Text getText() throws FieldNotFound {
		Text value = new Text();
		getField(value);
		return value;
	}

	public boolean isSet(Text field) {
		return isSetField(field);
	}

	public boolean isSetText() {
		return isSetField(Text.FIELD);
	}

	public void set(TransactTime value) {
		setField(value);
	}

	public TransactTime get(TransactTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TransactTime getTransactTime() throws FieldNotFound {
		TransactTime value = new TransactTime();
		getField(value);
		return value;
	}

	public boolean isSet(TransactTime field) {
		return isSetField(field);
	}

	public boolean isSetTransactTime() {
		return isSetField(TransactTime.FIELD);
	}

	public void set(CxlRejReason value) {
		setField(value);
	}

	public CxlRejReason get(CxlRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public CxlRejReason getCxlRejReason() throws FieldNotFound {
		CxlRejReason value = new CxlRejReason();
		getField(value);
		return value;
	}

	public boolean isSet(CxlRejReason field) {
		return isSetField(field);
	}

	public boolean isSetCxlRejReason() {
		return isSetField(CxlRejReason.FIELD);
	}

	public void set(QuoteID value) {
		setField(value);
	}

	public QuoteID get(QuoteID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public QuoteID getQuoteID() throws FieldNotFound {
		QuoteID value = new QuoteID();
		getField(value);
		return value;
	}

	public boolean isSet(QuoteID field) {
		return isSetField(field);
	}

	public boolean isSetQuoteID() {
		return isSetField(QuoteID.FIELD);
	}

	public void set(QuoteStatus value) {
		setField(value);
	}

	public QuoteStatus get(QuoteStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public QuoteStatus getQuoteStatus() throws FieldNotFound {
		QuoteStatus value = new QuoteStatus();
		getField(value);
		return value;
	}

	public boolean isSet(QuoteStatus field) {
		return isSetField(field);
	}

	public boolean isSetQuoteStatus() {
		return isSetField(QuoteStatus.FIELD);
	}

	public void set(QuoteRespType value) {
		setField(value);
	}

	public QuoteRespType get(QuoteRespType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public QuoteRespType getQuoteRespType() throws FieldNotFound {
		QuoteRespType value = new QuoteRespType();
		getField(value);
		return value;
	}

	public boolean isSet(QuoteRespType field) {
		return isSetField(field);
	}

	public boolean isSetQuoteRespType() {
		return isSetField(QuoteRespType.FIELD);
	}

}
