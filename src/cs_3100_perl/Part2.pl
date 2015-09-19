while(<STDIN>){
	$text .= $_;
}
$text =~ s!\/\/.*!!g;
print $text;