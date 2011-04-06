package com.htmlbuilder.elements;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.htmlbuilder.util.Constants;

public class ComposedElement extends EmptyElement {

	protected List<Element> innerElements;

	public ComposedElement(ElementType type, Element... innerElements) {
		super(type);
		this.innerElements = new LinkedList<Element>(Arrays.asList(innerElements));
	}

	public List<Element> getChildren() {
		return Collections.unmodifiableList(this.innerElements);
	}

	public ComposedElement appendChild(Element element) {
		this.innerElements.add(element);
		return this;
	}

	@Override
	public String toHtml() {
		StringBuilder html = new StringBuilder(512);

		html.append(Constants.LT).append(this.type.toString());
		for (Entry<String, String> attr : this.attributes.entrySet()) {
			html.append(Constants.SPACE).append(attr.getKey()).append(Constants.EQUAL).append(Constants.QUOTE).append(attr.getValue()).append(Constants.QUOTE);
		}
		html.append(Constants.GT);

		for (Element el : this.innerElements) {
			if (el == this) throw new RuntimeException("cyclic reference found");
			html.append(el.toHtml());
		}
		html.append(Constants.LT).append(Constants.SLASH).append(this.type).append(Constants.GT);

		return html.toString();
	}
}
