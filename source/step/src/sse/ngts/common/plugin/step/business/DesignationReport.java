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

public class DesignationReport extends Message {
	private static final long serialVersionUID = 20130819;
	public static final String MSGTYPE = "U002";

	public DesignationReport() {
		super();
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public DesignationReport(int[] fieldOrder) {
		super(fieldOrder);
		getHeader().setField(new MsgType(MSGTYPE));
	}

	public void set(ClOrdID value) {
		setField(value);
	}

	public ClOrdID get(ClOrdID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public ClOrdID getClOrdID() throws FieldNotFound {
		ClOrdID value = new ClOrdID();
		getField(value);
		return value;
	}

	public boolean isSet(ClOrdID field) {
		return isSetField(field);
	}

	public boolean isSetClOrdID() {
		return isSetField(ClOrdID.FIELD);
	}

	public void set(OrderID value) {
		setField(value);
	}

	public OrderID get(OrderID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrderID getOrderID() throws FieldNotFound {
		OrderID value = new OrderID();
		getField(value);
		return value;
	}

	public boolean isSet(OrderID field) {
		return isSetField(field);
	}

	public boolean isSetOrderID() {
		return isSetField(OrderID.FIELD);
	}

	public void set(OrdStatus value) {
		setField(value);
	}

	public OrdStatus get(OrdStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrdStatus getOrdStatus() throws FieldNotFound {
		OrdStatus value = new OrdStatus();
		getField(value);
		return value;
	}

	public boolean isSet(OrdStatus field) {
		return isSetField(field);
	}

	public boolean isSetOrdStatus() {
		return isSetField(OrdStatus.FIELD);
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

	public void set(OrdRejReason value) {
		setField(value);
	}

	public OrdRejReason get(OrdRejReason value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public OrdRejReason getOrdRejReason() throws FieldNotFound {
		OrdRejReason value = new OrdRejReason();
		getField(value);
		return value;
	}

	public boolean isSet(OrdRejReason field) {
		return isSetField(field);
	}

	public boolean isSetOrdRejReason() {
		return isSetField(OrdRejReason.FIELD);
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

}
