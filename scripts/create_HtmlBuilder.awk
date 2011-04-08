BEGIN {
	FS="\t"
	print "package com.htmlbuilder;\n"
	print "import com.htmlbuilder.elements.ComposedElement;"
	print "import com.htmlbuilder.elements.Element;"
	print "import com.htmlbuilder.elements.ElementType;"
	print "import com.htmlbuilder.elements.EmptyElement;"
	print "import com.htmlbuilder.elements.TextElement;\n"

	print "public class HtmlBuilder {"
}

{
	print ""
	if (isDeprecated()) print "\t@Deprecated";

	if (isEmptyElement()) {
 		print "\tpublic EmptyElement " getName() "() {\n\t\treturn new EmptyElement(ElementType."getName()");\n\t}";
	} else {
 		print "\tpublic ComposedElement "getName()"(Element... innerElements) {\n\t\treturn new ComposedElement(ElementType."getName()", innerElements);\n\t}";
	}
}

END {
	print "\n\tpublic TextElement text(String content) {"
	print "\t\treturn new TextElement(content);"
	print "\t}\n"
	print "}"
}

function getName() {
	return tolower(trim($1));
}

function isDeprecated() {
	return trim($5) == "D";
}

function isEmptyElement() {
	return trim($4) == "E";
}

function trim(value) {
	newValue = value
	gsub(/ |\t/, "", newValue);
	return newValue;
}
