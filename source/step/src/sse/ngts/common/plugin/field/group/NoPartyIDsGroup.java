package sse.ngts.common.plugin.field.group;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.Group;
import sse.ngts.common.plugin.step.field.NoPartyIDs;
import sse.ngts.common.plugin.step.field.NoPartySubIDs;
import sse.ngts.common.plugin.step.field.NoRiskLimits;
import sse.ngts.common.plugin.step.field.PartyID;
import sse.ngts.common.plugin.step.field.PartyRole;
import sse.ngts.common.plugin.step.field.PartySubID;
import sse.ngts.common.plugin.step.field.PartySubIDType;
import sse.ngts.common.plugin.step.field.RiskLimitAmount;
import sse.ngts.common.plugin.step.field.RiskSecurityID;

public class NoPartyIDsGroup extends Group {
	static final long serialVersionUID = 20130814;

	public NoPartyIDsGroup() {
		super(NoPartyIDs.FIELD, PartyID.FIELD, new int[] { PartyID.FIELD,
				PartyRole.FIELD, NoPartySubIDs.FIELD, NoRiskLimits.FIELD });
	}

	public void set(PartyID value) {
		setField(value);
	}

	public PartyID get(PartyID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public PartyID getPartyID() throws FieldNotFound {
		PartyID value = new PartyID();
		getField(value);
		return value;
	}

	public boolean isSet(PartyID field) {
		return isSetField(field);
	}

	public boolean isSetPartyID() {
		return isSetField(PartyID.FIELD);
	}

	public void set(PartyRole value) {
		setField(value);
	}

	public PartyRole get(PartyRole value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public PartyRole getPartyRole() throws FieldNotFound {
		PartyRole value = new PartyRole();
		getField(value);
		return value;
	}

	public boolean isSet(PartyRole field) {
		return isSetField(field);
	}

	public boolean isSetPartyRole() {
		return isSetField(PartyRole.FIELD);
	}

	public void set(NoPartySubIDs value) {
		setField(value);
	}

	public NoPartySubIDs get(NoPartySubIDs value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public NoPartySubIDs getNoPartySubIDs() throws FieldNotFound {
		NoPartySubIDs value = new NoPartySubIDs();
		getField(value);
		return value;
	}

	public boolean isSet(NoPartySubIDs field) {
		return isSetField(field);
	}

	public boolean isSetNoPartySubIDs() {
		return isSetField(NoPartySubIDs.FIELD);
	}

	public static class NoPartySubIDsGroup extends Group {
		static final long serialVersionUID = 20130814;

		public NoPartySubIDsGroup() {
			super(NoPartySubIDs.FIELD, PartySubID.FIELD, new int[] {
					PartySubID.FIELD, PartySubIDType.FIELD });
		}

		public void set(PartySubID value) {
			setField(value);
		}

		public PartySubID get(PartySubID value) throws FieldNotFound {
			getField(value);
			return value;
		}

		public PartySubID getPartySubID() throws FieldNotFound {
			PartySubID value = new PartySubID();
			getField(value);
			return value;
		}

		public boolean isSet(PartySubID field) {
			return isSetField(field);
		}

		public boolean isSetPartySubID() {
			return isSetField(PartySubID.FIELD);
		}

		public void set(PartySubIDType value) {
			setField(value);
		}

		public PartySubIDType get(PartySubIDType value) throws FieldNotFound {
			getField(value);
			return value;
		}

		public PartySubIDType getPartySubIDType() throws FieldNotFound {
			PartySubIDType value = new PartySubIDType();
			getField(value);
			return value;
		}

		public boolean isSet(PartySubIDType field) {
			return isSetField(field);
		}

		public boolean isSetPartySubIDType() {
			return isSetField(PartySubIDType.FIELD);
		}

	}

	public void set(NoRiskLimits value) {
		setField(value);
	}

	public NoRiskLimits get(NoRiskLimits value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public NoRiskLimits getNoRiskLimits() throws FieldNotFound {
		NoRiskLimits value = new NoRiskLimits();
		getField(value);
		return value;
	}

	public boolean isSet(NoRiskLimits field) {
		return isSetField(field);
	}

	public boolean isSetNoRiskLimits() {
		return isSetField(NoRiskLimits.FIELD);
	}

	public static class NoRiskLimitsGroup extends Group {
		static final long serialVersionUID = 20130814;

		public NoRiskLimitsGroup() {
			super(NoRiskLimits.FIELD, RiskLimitAmount.FIELD, new int[] {
					RiskLimitAmount.FIELD, RiskSecurityID.FIELD });
		}

		public void set(RiskLimitAmount value) {
			setField(value);
		}

		public RiskLimitAmount get(RiskLimitAmount value) throws FieldNotFound {
			getField(value);
			return value;
		}

		public RiskLimitAmount getRiskLimitAmount() throws FieldNotFound {
			RiskLimitAmount value = new RiskLimitAmount();
			getField(value);
			return value;
		}

		public boolean isSet(RiskLimitAmount field) {
			return isSetField(field);
		}

		public boolean isSetRiskLimitAmount() {
			return isSetField(RiskLimitAmount.FIELD);
		}

		public void set(RiskSecurityID value) {
			setField(value);
		}

		public RiskSecurityID get(RiskSecurityID value) throws FieldNotFound {
			getField(value);
			return value;
		}

		public RiskSecurityID getRiskSecurityID() throws FieldNotFound {
			RiskSecurityID value = new RiskSecurityID();
			getField(value);
			return value;
		}

		public boolean isSet(RiskSecurityID field) {
			return isSetField(field);
		}

		public boolean isSetRiskSecurityID() {
			return isSetField(RiskSecurityID.FIELD);
		}

	}
}