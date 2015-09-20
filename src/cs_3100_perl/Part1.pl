while (<STDIN>){
	$text .= $_;
}

$text =~ s/\b\d{3}-\d{2}-\d{4}\b/###-##-####/g;
print $text;