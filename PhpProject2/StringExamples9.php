<?php

/* Assign String with single quotes
 * $language='PHP';
 * $message='Welcome to ' .$language; //Welcome to PHP
 * 
 * Assign Strings with Double Quotes
 *  Using Variable Substitutions
 * $language="PHP"
 * $message="Welcome to $language";
 * 
 * Using braces with variable substitutions
 * $count=12;
 * $item="flower";
 * WRONG:$message="you bought $count $items.";//you bought 12 
 * $message2="You bought $count ${item}s.";//you bought 12 flowers
 * 
 * Assign a String with a heredoc <<<
 * $language='PHP';
 * $message=<<<MESSAGE //can't have any extra spaces after the name for the heredoc
 * The heredoc syntax allows you to build multi-line strings in $language.
 * Inside, it acts like a double-quoted string and performs variable substitution.
 * MESSAGE;
 * 
 * Assign a String with a nowdoc <<<
 * $message=<<<'MESSAGE'
 * THE nowdoc syntax allows you to build multi-line 
 * strings in PHP. However, no variable substitutions takes place inside the 
 * nowdoc string. This is similar to single-quoted strings.
 * MESSAGE;
 * 
 * ESCAPE SEQUENCES
 * \$ Dollar Sign
 * \n New Line
 * \t New tab
 * \r Carriage return
 * \f Form feed
 * \v Vertical tab
 * \ooo character with the specified octal value
 * \xhh characer with the specified hexadecimal value
 * $name='Mike\'s Music Store'; //Mike's Music store
 * $quote='He said, \"It cost \$12"
 * 
 * GETTING LENGTH OF A STRING
 * $name='Ray Harris';
 * $length=strlen($name); //$length is 10
 * $first_name=substr($name,0,3); //first name is ray
 * $last_name=substr($name, 4); //last name is harris
 * $last name=susbstr($name,-6);
 * 
 * CODE THAT DISPLAYS EACH LETTER IN A STRING ON A SEPERATE LINE
 * $input='JAN';
 * for($i=0;$i<strlen($input);$i++) {
 *  $vert_str .=substr($input,$i,1);
 *  $vert_str .='<br />';
 * 
 * CODE THAT SEARCHES A STRING FOR SPACES
 * $name='Martin Van Buren';
 * $i=strpos($name, '');//searches the string for a blank space 
 * //i takes value of 6
 * $i=strpos($name, '', 7)//searches the string for a blank space after the first one
 * //i talkes value of 10
 * 
 * CODE THAT SEARCHES A STRING FOR A SUBSTRING
 * $name='Martin Van Buren';
 * $i=strpos($name, 'Van');//takes seventh position because thats where the V is
 * $i=strpos($name,'van');//takes a false value because 'i' is case-sensitive
 * 
 * CODE THAT SPLITS A STRING INTO TWO SUBSTRINGS
 * $name='Ray Harris';
 * $i=strpos($name, ' ');
 * if($i===false) {
 * $message='No spaces were found in the name.';
 * }else {
 * $first_name=substr($name, 0, $i);//$first_name='ray
 * $last_name=substr($name, $i+1);//$last_name='Harris'
 * 
 * 
 * strpos is case-sensitive
 * stripos is case-insensitive
 * strripos is reverse and case-insensitive
 * 
 * CODE THAT REPLACES PERIODS WITH DASHES IN A PHONE NUMBER
 * $phone='554.555.6624';
 * $phone=str_replace('.','-'.$phone)//replaces the '.' with '-' in the String phone
 * //str_pad function lets you add characters to the start or end of a string
 * 
 * //CONVERTING A STRING INTO AN ARRAY
 * $names='Mike|Anne|Joel|Ray';
 * $names=explode('|',$names);
 * $name1=$names[0];//$name1 is 'Mike'
 * $name2=$names[1];$name2 is 'Anne'
 * 
 * //CONVERTING AN ARRAY INTO A STRING
 * $names=implode('|',$names);//$names is 'Mike|Anne|Joel|Ray
 */

