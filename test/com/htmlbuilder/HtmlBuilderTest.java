package com.htmlbuilder;

import junit.framework.Assert;

import org.junit.Test;

import com.htmlbuilder.elements.Element;

public class HtmlBuilderTest {

	@Test
	public void test1() {
		HtmlBuilder builder = new HtmlBuilder();
		Element first = builder.html(
				builder.head(
						builder.script().set("src", "script.js")
				),
				builder.body(
						builder.div(
								builder.table(
										builder.tr(
												builder.td(),
												builder.td(),
												builder.td()
										),
										builder.tr(
												builder.td(),
												builder.td(),
												builder.td()
										),
										builder.tr(
												builder.td(),
												builder.td(),
												builder.td()
										)
								)
						).set("id", "content").set("class", "maincontent"),
						builder.br(),
						builder.div()
				)
		);
		
		Assert.assertEquals(first.toHtml(), "<html><head><script src=\"script.js\"></script></head><body><div id=\"content\" class=\"maincontent\"><table><tr><td></td><td></td><td></td></tr><tr><td></td><td></td><td></td></tr><tr><td></td><td></td><td></td></tr></table></div><br/><div></div></body></html>");
	}
}
