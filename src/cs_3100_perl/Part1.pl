while (<STDIN>){
	$text .= $_;
}

$text =~ s/\b\d\d\d-\d\d-\d\d\d\d\b/###-##-####/g;
print $text;