while(<STDIN>){
	$text .= $_;
}
while($text =~  m/(\n|\s)\(\d{3}\)\s?\d{3}-\d{4}/g){
	$count++;
}
print $count;