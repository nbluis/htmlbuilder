package com.htmlbuilder;

import com.htmlbuilder.elements.ComposedElement;
import com.htmlbuilder.elements.ElementType;
import com.htmlbuilder.elements.EmptyElement;

public class HtmlBuilder {

	public ComposedElement a(EmptyElement... innerElements) {
		return createComposedElement(ElementType.a, innerElements);
	}

	public ComposedElement abbr(EmptyElement... innerElements) {
		return createComposedElement(ElementType.abbr, innerElements);
	}

	public ComposedElement acronym(EmptyElement... innerElements) {
		return createComposedElement(ElementType.acronym, innerElements);
	}

	public ComposedElement address(EmptyElement... innerElements) {
		return createComposedElement(ElementType.address, innerElements);
	}

	@Deprecated
	public ComposedElement applet(EmptyElement... innerElements) {
		return createComposedElement(ElementType.applet, innerElements);
	}

	public EmptyElement area() {
		return createEmptyElement(ElementType.area);
	}

	public ComposedElement b(EmptyElement... innerElements) {
		return createComposedElement(ElementType.b, innerElements);
	}

	public EmptyElement base() {
		return createEmptyElement(ElementType.base);
	}

	@Deprecated
	public EmptyElement basefont() {
		return createEmptyElement(ElementType.basefont);
	}

	public ComposedElement bdo(EmptyElement... innerElements) {
		return createComposedElement(ElementType.bdo, innerElements);
	}

	public ComposedElement big(EmptyElement... innerElements) {
		return createComposedElement(ElementType.big, innerElements);
	}

	public ComposedElement blockquote(EmptyElement... innerElements) {
		return createComposedElement(ElementType.blockquote, innerElements);
	}

	public ComposedElement body(EmptyElement... innerElements) {
		return createComposedElement(ElementType.body, innerElements);
	}

	public EmptyElement br() {
		return createEmptyElement(ElementType.br);
	}

	public ComposedElement button(EmptyElement... innerElements) {
		return createComposedElement(ElementType.button, innerElements);
	}

	public ComposedElement caption(EmptyElement... innerElements) {
		return createComposedElement(ElementType.caption, innerElements);
	}

	@Deprecated
	public ComposedElement center(EmptyElement... innerElements) {
		return createComposedElement(ElementType.center, innerElements);
	}

	public ComposedElement cite(EmptyElement... innerElements) {
		return createComposedElement(ElementType.cite, innerElements);
	}

	public ComposedElement code(EmptyElement... innerElements) {
		return createComposedElement(ElementType.code, innerElements);
	}

	public EmptyElement col() {
		return createEmptyElement(ElementType.col);
	}

	public ComposedElement colgroup(EmptyElement... innerElements) {
		return createComposedElement(ElementType.colgroup, innerElements);
	}

	public ComposedElement dd(EmptyElement... innerElements) {
		return createComposedElement(ElementType.dd, innerElements);
	}

	public ComposedElement del(EmptyElement... innerElements) {
		return createComposedElement(ElementType.del, innerElements);
	}

	public ComposedElement dfn(EmptyElement... innerElements) {
		return createComposedElement(ElementType.dfn, innerElements);
	}

	@Deprecated
	public ComposedElement dir(EmptyElement... innerElements) {
		return createComposedElement(ElementType.dir, innerElements);
	}

	public ComposedElement div(EmptyElement... innerElements) {
		return createComposedElement(ElementType.div, innerElements);
	}

	public ComposedElement dl(EmptyElement... innerElements) {
		return createComposedElement(ElementType.dl, innerElements);
	}

	public ComposedElement dt(EmptyElement... innerElements) {
		return createComposedElement(ElementType.dt, innerElements);
	}

	public ComposedElement em(EmptyElement... innerElements) {
		return createComposedElement(ElementType.em, innerElements);
	}

	public ComposedElement fieldset(EmptyElement... innerElements) {
		return createComposedElement(ElementType.fieldset, innerElements);
	}

	@Deprecated
	public ComposedElement font(EmptyElement... innerElements) {
		return createComposedElement(ElementType.font, innerElements);
	}

	public ComposedElement form(EmptyElement... innerElements) {
		return createComposedElement(ElementType.form, innerElements);
	}

	public EmptyElement frame() {
		return createEmptyElement(ElementType.frame);
	}

	public ComposedElement frameset(EmptyElement... innerElements) {
		return createComposedElement(ElementType.frameset, innerElements);
	}

	public ComposedElement h1(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h1, innerElements);
	}

	public ComposedElement h2(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h2, innerElements);
	}

	public ComposedElement h3(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h3, innerElements);
	}

	public ComposedElement h4(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h4, innerElements);
	}

	public ComposedElement h5(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h5, innerElements);
	}

	public ComposedElement h6(EmptyElement... innerElements) {
		return createComposedElement(ElementType.h6, innerElements);
	}

	public ComposedElement head(EmptyElement... innerElements) {
		return createComposedElement(ElementType.head, innerElements);
	}

	public EmptyElement hr() {
		return createEmptyElement(ElementType.hr);
	}

	public ComposedElement html(EmptyElement... innerElements) {
		return createComposedElement(ElementType.html, innerElements);
	}

	public ComposedElement i(EmptyElement... innerElements) {
		return createComposedElement(ElementType.i, innerElements);
	}

	public ComposedElement iframe(EmptyElement... innerElements) {
		return createComposedElement(ElementType.iframe, innerElements);
	}

	public EmptyElement img() {
		return createEmptyElement(ElementType.img);
	}

	public EmptyElement input() {
		return createEmptyElement(ElementType.input);
	}

	public ComposedElement ins(EmptyElement... innerElements) {
		return createComposedElement(ElementType.ins, innerElements);
	}

	@Deprecated
	public EmptyElement isindex() {
		return createEmptyElement(ElementType.isindex);
	}

	public ComposedElement kbd(EmptyElement... innerElements) {
		return createComposedElement(ElementType.kbd, innerElements);
	}

	public ComposedElement label(EmptyElement... innerElements) {
		return createComposedElement(ElementType.label, innerElements);
	}

	public ComposedElement legend(EmptyElement... innerElements) {
		return createComposedElement(ElementType.legend, innerElements);
	}

	public ComposedElement li(EmptyElement... innerElements) {
		return createComposedElement(ElementType.li, innerElements);
	}

	public EmptyElement link() {
		return createEmptyElement(ElementType.link);
	}

	public ComposedElement map(EmptyElement... innerElements) {
		return createComposedElement(ElementType.map, innerElements);
	}

	@Deprecated
	public ComposedElement menu(EmptyElement... innerElements) {
		return createComposedElement(ElementType.menu, innerElements);
	}

	public EmptyElement meta() {
		return createEmptyElement(ElementType.meta);
	}

	public ComposedElement noframes(EmptyElement... innerElements) {
		return createComposedElement(ElementType.noframes, innerElements);
	}

	public ComposedElement noscript(EmptyElement... innerElements) {
		return createComposedElement(ElementType.noscript, innerElements);
	}

	public ComposedElement object(EmptyElement... innerElements) {
		return createComposedElement(ElementType.object, innerElements);
	}

	public ComposedElement ol(EmptyElement... innerElements) {
		return createComposedElement(ElementType.ol, innerElements);
	}

	public ComposedElement optgroup(EmptyElement... innerElements) {
		return createComposedElement(ElementType.optgroup, innerElements);
	}

	public ComposedElement option(EmptyElement... innerElements) {
		return createComposedElement(ElementType.option, innerElements);
	}

	public ComposedElement p(EmptyElement... innerElements) {
		return createComposedElement(ElementType.p, innerElements);
	}

	public EmptyElement param() {
		return createEmptyElement(ElementType.param);
	}

	public ComposedElement pre(EmptyElement... innerElements) {
		return createComposedElement(ElementType.pre, innerElements);
	}

	public ComposedElement q(EmptyElement... innerElements) {
		return createComposedElement(ElementType.q, innerElements);
	}

	public ComposedElement s(EmptyElement... innerElements) {
		return createComposedElement(ElementType.s, innerElements);
	}

	public ComposedElement samp(EmptyElement... innerElements) {
		return createComposedElement(ElementType.samp, innerElements);
	}

	public ComposedElement script(EmptyElement... innerElements) {
		return createComposedElement(ElementType.script, innerElements);
	}

	public ComposedElement select(EmptyElement... innerElements) {
		return createComposedElement(ElementType.select, innerElements);
	}

	public ComposedElement small(EmptyElement... innerElements) {
		return createComposedElement(ElementType.small, innerElements);
	}

	public ComposedElement span(EmptyElement... innerElements) {
		return createComposedElement(ElementType.span, innerElements);
	}

	public ComposedElement strike(EmptyElement... innerElements) {
		return createComposedElement(ElementType.strike, innerElements);
	}

	public ComposedElement strong(EmptyElement... innerElements) {
		return createComposedElement(ElementType.strong, innerElements);
	}

	public ComposedElement style(EmptyElement... innerElements) {
		return createComposedElement(ElementType.style, innerElements);
	}

	public ComposedElement sub(EmptyElement... innerElements) {
		return createComposedElement(ElementType.sub, innerElements);
	}

	public ComposedElement sup(EmptyElement... innerElements) {
		return createComposedElement(ElementType.sup, innerElements);
	}

	public ComposedElement table(EmptyElement... innerElements) {
		return createComposedElement(ElementType.table, innerElements);
	}

	public ComposedElement tbody(EmptyElement... innerElements) {
		return createComposedElement(ElementType.tbody, innerElements);
	}

	public ComposedElement td(EmptyElement... innerElements) {
		return createComposedElement(ElementType.td, innerElements);
	}

	public ComposedElement textarea(EmptyElement... innerElements) {
		return createComposedElement(ElementType.textarea, innerElements);
	}

	public ComposedElement tfoot(EmptyElement... innerElements) {
		return createComposedElement(ElementType.tfoot, innerElements);
	}

	public ComposedElement th(EmptyElement... innerElements) {
		return createComposedElement(ElementType.th, innerElements);
	}

	public ComposedElement thead(EmptyElement... innerElements) {
		return createComposedElement(ElementType.thead, innerElements);
	}

	public ComposedElement title(EmptyElement... innerElements) {
		return createComposedElement(ElementType.title, innerElements);
	}

	public ComposedElement tr(EmptyElement... innerElements) {
		return createComposedElement(ElementType.tr, innerElements);
	}

	public ComposedElement tt(EmptyElement... innerElements) {
		return createComposedElement(ElementType.tt, innerElements);
	}

	@Deprecated
	public ComposedElement u(EmptyElement... innerElements) {
		return createComposedElement(ElementType.u, innerElements);
	}

	public ComposedElement ul(EmptyElement... innerElements) {
		return createComposedElement(ElementType.ul, innerElements);
	}

	public ComposedElement var(EmptyElement... innerElements) {
		return createComposedElement(ElementType.var, innerElements);
	}

	private ComposedElement createComposedElement(ElementType tag, EmptyElement... innerElements) {
		return new ComposedElement(tag, innerElements);
	}

	private EmptyElement createEmptyElement(ElementType tag) {
		return new EmptyElement(tag);
	}
}
