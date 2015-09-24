while(<STDIN>){
	while($_ =~ m/(\"(\\.)*.*?(\\.)*(\\\\|(?<!\\)\"))/g){
		$text .= $1."\n";
	}
}
print $text;
