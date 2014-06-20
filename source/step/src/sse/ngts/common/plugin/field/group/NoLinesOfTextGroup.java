package sse.ngts.common.plugin.field.group;

import sse.ngts.common.plugin.step.FieldNotFound;
import sse.ngts.common.plugin.step.Group;
import sse.ngts.common.plugin.step.field.NoLinesOfText;
import sse.ngts.common.plugin.step.field.Text;
import sse.ngts.common.plugin.step.field.TextType;

public class NoLinesOfTextGroup extends Group {
	static final long serialVersionUID = 20130520;

	public NoLinesOfTextGroup() {
		super(NoLinesOfText.FIELD, Text.FIELD, new int[] { Text.FIELD,
				TextType.FIELD });
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

	public void set(TextType value) {
		setField(value);
	}

	public TextType get(TextType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public TextType getTextType() throws FieldNotFound {
		TextType value = new TextType();
		getField(value);
		return value;
	}

	public boolean isSet(TextType field) {
		return isSetField(field);
	}

	public boolean isSetTextType() {
		return isSetField(TextType.FIELD);
	}

}