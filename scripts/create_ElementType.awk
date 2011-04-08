BEGIN {
	FS="\t"
	print "package com.htmlbuilder.elements;\n";
	print "/**"
	print "  * Reference based on html 4 tag reference."
 	print "  * For more information http://www.w3.org/TR/html4/index/elements.html. "
 	print "  */"
 	print "public enum ElementType {"
}

{
	print "\t/**"
	print "\t * " getDescription()
 	print "\t */"
 	if (isDeprecated()) print "\t@Deprecated"
 	print "\t" getName() ","
}

END {
	print "\n}"
}

function getName() {
	return tolower(trim($1)s); 
}

function getDescription() {
	return (length(trim($7))) ? $7 : getName();
}

function isDeprecated() {
	return trim($5) == "D";
}

function trim(value) {
	newValue = value;
	gsub(/ |\t/, "", newValue);
	return newValue;
}