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
 	print "\t" getName() ","
}

END {
	print "\n}"
}

function getName() {
	name = $1;
	gsub(/ /, "", name);
	return tolower(name); 
}

function getDescription() {
	description = $7;
	gsub(/ /, "", description);
	return (length(text)) ? $7 : getName();
}