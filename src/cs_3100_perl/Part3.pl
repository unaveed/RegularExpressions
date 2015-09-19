while(<STDIN>){
	if (m/\(\d\d\d\)(\s|)\d\d\d-\d\d\d\d/g){
		$count++;
	}
}

print $count;