package com.htmlbuilder.elements;

public class TextElement implements Element {

	private String content;

	public TextElement(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	@Override
	public String toHtml() {
		return getContent();
	}

}
