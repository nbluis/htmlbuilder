package com.htmlbuilder.elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.htmlbuilder.util.Constants;

public class EmptyElement implements Element {

	protected ElementType type;
	protected Map<String, String> attributes;

	public EmptyElement(ElementType type) {
		this.type = type;
		this.attributes = new HashMap<String, String>();
	}

	public ElementType getType() {
		return this.type;
	}

	public EmptyElement set(String attribute, String value) {
		this.attributes.put(attribute, value);
		return this;
	}

	public String get(String attribute) {
		return this.attributes.get(attribute);
	}

	@Override
	public String toHtml() {
		StringBuilder html = new StringBuilder(512);

		html.append(Constants.LT).append(this.type.toString());
		for (Entry<String, String> attr : this.attributes.entrySet()) {
			html.append(Constants.SPACE).append(attr.getKey()).append(Constants.EQUAL).append(Constants.QUOTE).append(attr.getValue()).append(Constants.QUOTE);
		}
		html.append(Constants.SLASH).append(Constants.GT);

		return html.toString();
	}
}
