package com.htmlbuilder.elements;

/**
 * Reference based on html 4 tag reference.
 * For more information http://www.w3.org/TR/html4/index/elements.html.
 */
public enum ElementType {
	/**
	 * anchor
	 */
	a,
	/**
	 * abbreviated form (e.g., WWW, HTTP, etc.)
	 */
	abbr,
	/**
	 * acronym
	 */
	acronym,
	/**
	 * information on author
	 */
	address,
	/**
	 * Java applet
	 */
	@Deprecated
	applet,
	/**
	 * client-side image map area
	 */
	area,
	/**
	 * bold text style
	 */
	b,
	/**
	 * document base URI
	 */
	base,
	/**
	 * base font size
	 */
	@Deprecated
	basefont,
	/**
	 * I18N BiDi over-ride
	 */
	bdo,
	/**
	 * large text style
	 */
	big,
	/**
	 * long quotation
	 */
	blockquote,
	/**
	 * document body
	 */
	body,
	/**
	 * forced line break
	 */
	br,
	/**
	 * push button
	 */
	button,
	/**
	 * table caption
	 */
	caption,
	/**
	 * shorthand for DIV align=center
	 */
	@Deprecated
	center,
	/**
	 * citation
	 */
	cite,
	/**
	 * computer code fragment
	 */
	code,
	/**
	 * table column
	 */
	col,
	/**
	 * table column group
	 */
	colgroup,
	/**
	 * definition description
	 */
	dd,
	/**
	 * deleted text
	 */
	del,
	/**
	 * instance definition
	 */
	dfn,
	/**
	 * directory list
	 */
	@Deprecated
	dir,
	/**
	 * generic language/style container
	 */
	div,
	/**
	 * definition list
	 */
	dl,
	/**
	 * definition term
	 */
	dt,
	/**
	 * emphasis
	 */
	em,
	/**
	 * form control group
	 */
	fieldset,
	/**
	 * local change to font
	 */
	@Deprecated
	font,
	/**
	 * interactive form
	 */
	form,
	/**
	 * subwindow
	 */
	frame,
	/**
	 * window subdivision
	 */
	frameset,
	/**
	 * heading
	 */
	h1,
	/**
	 * heading
	 */
	h2,
	/**
	 * heading
	 */
	h3,
	/**
	 * heading
	 */
	h4,
	/**
	 * heading
	 */
	h5,
	/**
	 * heading
	 */
	h6,
	/**
	 * document head
	 */
	head,
	/**
	 * horizontal rule
	 */
	hr,
	/**
	 * document root element
	 */
	html,
	/**
	 * italic text style
	 */
	i,
	/**
	 * inline subwindow
	 */
	iframe,
	/**
	 * Embedded image
	 */
	img,
	/**
	 * form control
	 */
	input,
	/**
	 * inserted text
	 */
	ins,
	/**
	 * single line prompt
	 */
	@Deprecated
	isindex,
	/**
	 * text to be entered by the user
	 */
	kbd,
	/**
	 * form field label text
	 */
	label,
	/**
	 * fieldset legend
	 */
	legend,
	/**
	 * list item
	 */
	li,
	/**
	 * a media-independent link
	 */
	link,
	/**
	 * client-side image map
	 */
	map,
	/**
	 * menu list
	 */
	@Deprecated
	menu,
	/**
	 * generic metainformation
	 */
	meta,
	/**
	 * alternate content container for non frame-based rendering
	 */
	noframes,
	/**
	 * alternate content container for non script-based rendering
	 */
	noscript,
	/**
	 * generic embedded object
	 */
	object,
	/**
	 * ordered list
	 */
	ol,
	/**
	 * option group
	 */
	optgroup,
	/**
	 * selectable choice
	 */
	option,
	/**
	 * paragraph
	 */
	p,
	/**
	 * named property value
	 */
	param,
	/**
	 * preformatted text
	 */
	pre,
	/**
	 * short inline quotation
	 */
	q,
	/**
	 * strike-through text style
	 */
	s,
	/**
	 * sample program output, scripts, etc.
	 */
	samp,
	/**
	 * script statements
	 */
	script,
	/**
	 * option selector
	 */
	select,
	/**
	 * small text style
	 */
	small,
	/**
	 * generic language/style container
	 */
	span,
	/**
	 * strike-through text
	 */
	strike,
	/**
	 * strong emphasis
	 */
	strong,
	/**
	 * style info
	 */
	style,
	/**
	 * subscript
	 */
	sub,
	/**
	 * superscript
	 */
	sup,
	/**
	 * table
	 */
	table,
	/**
	 * table body
	 */
	tbody,
	/**
	 * table data cell
	 */
	td,
	/**
	 * multi-line text field
	 */
	textarea,
	/**
	 * table footer
	 */
	tfoot,
	/**
	 * table header cell
	 */
	th,
	/**
	 * table header
	 */
	thead,
	/**
	 * document title
	 */
	title,
	/**
	 * table row
	 */
	tr,
	/**
	 * teletype or monospaced text style
	 */
	tt,
	/**
	 * underlined text style
	 */
	@Deprecated
	u,
	/**
	 * unordered list
	 */
	ul,
	/**
	 * instance of a variable or program argument
	 */
	var;

}
