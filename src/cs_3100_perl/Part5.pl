while(<STDIN>){
	$text .= $_;
}
$text =~ s/<[^<]([^"<]|("<")|("([^\"\n]|(\"))*"))*?[^>"]*[^>]>//g;
print $text;