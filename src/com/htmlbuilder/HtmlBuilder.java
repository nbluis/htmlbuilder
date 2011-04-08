package com.htmlbuilder;

import com.htmlbuilder.elements.ComposedElement;
import com.htmlbuilder.elements.Element;
import com.htmlbuilder.elements.ElementType;
import com.htmlbuilder.elements.EmptyElement;
import com.htmlbuilder.elements.TextElement;

public class HtmlBuilder {

	public ComposedElement a(Element... innerElements) {
		return new ComposedElement(ElementType.a, innerElements);
	}

	public ComposedElement abbr(Element... innerElements) {
		return new ComposedElement(ElementType.abbr, innerElements);
	}

	public ComposedElement acronym(Element... innerElements) {
		return new ComposedElement(ElementType.acronym, innerElements);
	}

	public ComposedElement address(Element... innerElements) {
		return new ComposedElement(ElementType.address, innerElements);
	}

	@Deprecated
	public ComposedElement applet(Element... innerElements) {
		return new ComposedElement(ElementType.applet, innerElements);
	}

	public EmptyElement area() {
		return new EmptyElement(ElementType.area);
	}

	public ComposedElement b(Element... innerElements) {
		return new ComposedElement(ElementType.b, innerElements);
	}

	public EmptyElement base() {
		return new EmptyElement(ElementType.base);
	}

	@Deprecated
	public EmptyElement basefont() {
		return new EmptyElement(ElementType.basefont);
	}

	public ComposedElement bdo(Element... innerElements) {
		return new ComposedElement(ElementType.bdo, innerElements);
	}

	public ComposedElement big(Element... innerElements) {
		return new ComposedElement(ElementType.big, innerElements);
	}

	public ComposedElement blockquote(Element... innerElements) {
		return new ComposedElement(ElementType.blockquote, innerElements);
	}

	public ComposedElement body(Element... innerElements) {
		return new ComposedElement(ElementType.body, innerElements);
	}

	public EmptyElement br() {
		return new EmptyElement(ElementType.br);
	}

	public ComposedElement button(Element... innerElements) {
		return new ComposedElement(ElementType.button, innerElements);
	}

	public ComposedElement caption(Element... innerElements) {
		return new ComposedElement(ElementType.caption, innerElements);
	}

	@Deprecated
	public ComposedElement center(Element... innerElements) {
		return new ComposedElement(ElementType.center, innerElements);
	}

	public ComposedElement cite(Element... innerElements) {
		return new ComposedElement(ElementType.cite, innerElements);
	}

	public ComposedElement code(Element... innerElements) {
		return new ComposedElement(ElementType.code, innerElements);
	}

	public EmptyElement col() {
		return new EmptyElement(ElementType.col);
	}

	public ComposedElement colgroup(Element... innerElements) {
		return new ComposedElement(ElementType.colgroup, innerElements);
	}

	public ComposedElement dd(Element... innerElements) {
		return new ComposedElement(ElementType.dd, innerElements);
	}

	public ComposedElement del(Element... innerElements) {
		return new ComposedElement(ElementType.del, innerElements);
	}

	public ComposedElement dfn(Element... innerElements) {
		return new ComposedElement(ElementType.dfn, innerElements);
	}

	@Deprecated
	public ComposedElement dir(Element... innerElements) {
		return new ComposedElement(ElementType.dir, innerElements);
	}

	public ComposedElement div(Element... innerElements) {
		return new ComposedElement(ElementType.div, innerElements);
	}

	public ComposedElement dl(Element... innerElements) {
		return new ComposedElement(ElementType.dl, innerElements);
	}

	public ComposedElement dt(Element... innerElements) {
		return new ComposedElement(ElementType.dt, innerElements);
	}

	public ComposedElement em(Element... innerElements) {
		return new ComposedElement(ElementType.em, innerElements);
	}

	public ComposedElement fieldset(Element... innerElements) {
		return new ComposedElement(ElementType.fieldset, innerElements);
	}

	@Deprecated
	public ComposedElement font(Element... innerElements) {
		return new ComposedElement(ElementType.font, innerElements);
	}

	public ComposedElement form(Element... innerElements) {
		return new ComposedElement(ElementType.form, innerElements);
	}

	public EmptyElement frame() {
		return new EmptyElement(ElementType.frame);
	}

	public ComposedElement frameset(Element... innerElements) {
		return new ComposedElement(ElementType.frameset, innerElements);
	}

	public ComposedElement h1(Element... innerElements) {
		return new ComposedElement(ElementType.h1, innerElements);
	}

	public ComposedElement h2(Element... innerElements) {
		return new ComposedElement(ElementType.h2, innerElements);
	}

	public ComposedElement h3(Element... innerElements) {
		return new ComposedElement(ElementType.h3, innerElements);
	}

	public ComposedElement h4(Element... innerElements) {
		return new ComposedElement(ElementType.h4, innerElements);
	}

	public ComposedElement h5(Element... innerElements) {
		return new ComposedElement(ElementType.h5, innerElements);
	}

	public ComposedElement h6(Element... innerElements) {
		return new ComposedElement(ElementType.h6, innerElements);
	}

	public ComposedElement head(Element... innerElements) {
		return new ComposedElement(ElementType.head, innerElements);
	}

	public EmptyElement hr() {
		return new EmptyElement(ElementType.hr);
	}

	public ComposedElement html(Element... innerElements) {
		return new ComposedElement(ElementType.html, innerElements);
	}

	public ComposedElement i(Element... innerElements) {
		return new ComposedElement(ElementType.i, innerElements);
	}

	public ComposedElement iframe(Element... innerElements) {
		return new ComposedElement(ElementType.iframe, innerElements);
	}

	public EmptyElement img() {
		return new EmptyElement(ElementType.img);
	}

	public EmptyElement input() {
		return new EmptyElement(ElementType.input);
	}

	public ComposedElement ins(Element... innerElements) {
		return new ComposedElement(ElementType.ins, innerElements);
	}

	@Deprecated
	public EmptyElement isindex() {
		return new EmptyElement(ElementType.isindex);
	}

	public ComposedElement kbd(Element... innerElements) {
		return new ComposedElement(ElementType.kbd, innerElements);
	}

	public ComposedElement label(Element... innerElements) {
		return new ComposedElement(ElementType.label, innerElements);
	}

	public ComposedElement legend(Element... innerElements) {
		return new ComposedElement(ElementType.legend, innerElements);
	}

	public ComposedElement li(Element... innerElements) {
		return new ComposedElement(ElementType.li, innerElements);
	}

	public EmptyElement link() {
		return new EmptyElement(ElementType.link);
	}

	public ComposedElement map(Element... innerElements) {
		return new ComposedElement(ElementType.map, innerElements);
	}

	@Deprecated
	public ComposedElement menu(Element... innerElements) {
		return new ComposedElement(ElementType.menu, innerElements);
	}

	public EmptyElement meta() {
		return new EmptyElement(ElementType.meta);
	}

	public ComposedElement noframes(Element... innerElements) {
		return new ComposedElement(ElementType.noframes, innerElements);
	}

	public ComposedElement noscript(Element... innerElements) {
		return new ComposedElement(ElementType.noscript, innerElements);
	}

	public ComposedElement object(Element... innerElements) {
		return new ComposedElement(ElementType.object, innerElements);
	}

	public ComposedElement ol(Element... innerElements) {
		return new ComposedElement(ElementType.ol, innerElements);
	}

	public ComposedElement optgroup(Element... innerElements) {
		return new ComposedElement(ElementType.optgroup, innerElements);
	}

	public ComposedElement option(Element... innerElements) {
		return new ComposedElement(ElementType.option, innerElements);
	}

	public ComposedElement p(Element... innerElements) {
		return new ComposedElement(ElementType.p, innerElements);
	}

	public EmptyElement param() {
		return new EmptyElement(ElementType.param);
	}

	public ComposedElement pre(Element... innerElements) {
		return new ComposedElement(ElementType.pre, innerElements);
	}

	public ComposedElement q(Element... innerElements) {
		return new ComposedElement(ElementType.q, innerElements);
	}

	@Deprecated
	public ComposedElement s(Element... innerElements) {
		return new ComposedElement(ElementType.s, innerElements);
	}

	public ComposedElement samp(Element... innerElements) {
		return new ComposedElement(ElementType.samp, innerElements);
	}

	public ComposedElement script(Element... innerElements) {
		return new ComposedElement(ElementType.script, innerElements);
	}

	public ComposedElement select(Element... innerElements) {
		return new ComposedElement(ElementType.select, innerElements);
	}

	public ComposedElement small(Element... innerElements) {
		return new ComposedElement(ElementType.small, innerElements);
	}

	public ComposedElement span(Element... innerElements) {
		return new ComposedElement(ElementType.span, innerElements);
	}

	@Deprecated
	public ComposedElement strike(Element... innerElements) {
		return new ComposedElement(ElementType.strike, innerElements);
	}

	public ComposedElement strong(Element... innerElements) {
		return new ComposedElement(ElementType.strong, innerElements);
	}

	public ComposedElement style(Element... innerElements) {
		return new ComposedElement(ElementType.style, innerElements);
	}

	public ComposedElement sub(Element... innerElements) {
		return new ComposedElement(ElementType.sub, innerElements);
	}

	public ComposedElement sup(Element... innerElements) {
		return new ComposedElement(ElementType.sup, innerElements);
	}

	public ComposedElement table(Element... innerElements) {
		return new ComposedElement(ElementType.table, innerElements);
	}

	public ComposedElement tbody(Element... innerElements) {
		return new ComposedElement(ElementType.tbody, innerElements);
	}

	public ComposedElement td(Element... innerElements) {
		return new ComposedElement(ElementType.td, innerElements);
	}

	public ComposedElement textarea(Element... innerElements) {
		return new ComposedElement(ElementType.textarea, innerElements);
	}

	public ComposedElement tfoot(Element... innerElements) {
		return new ComposedElement(ElementType.tfoot, innerElements);
	}

	public ComposedElement th(Element... innerElements) {
		return new ComposedElement(ElementType.th, innerElements);
	}

	public ComposedElement thead(Element... innerElements) {
		return new ComposedElement(ElementType.thead, innerElements);
	}

	public ComposedElement title(Element... innerElements) {
		return new ComposedElement(ElementType.title, innerElements);
	}

	public ComposedElement tr(Element... innerElements) {
		return new ComposedElement(ElementType.tr, innerElements);
	}

	public ComposedElement tt(Element... innerElements) {
		return new ComposedElement(ElementType.tt, innerElements);
	}

	@Deprecated
	public ComposedElement u(Element... innerElements) {
		return new ComposedElement(ElementType.u, innerElements);
	}

	public ComposedElement ul(Element... innerElements) {
		return new ComposedElement(ElementType.ul, innerElements);
	}

	public ComposedElement var(Element... innerElements) {
		return new ComposedElement(ElementType.var, innerElements);
	}

	public TextElement text(String content) {
		return new TextElement(content);
	}

}
