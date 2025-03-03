<?php

$cardCnt1 = fgets(STDIN);
$card1 = explode(" ",trim(fgets(STDIN)));

$tmp = [];

for($i = 0; $i < $cardCnt1; $i++){
    $tmp[$card1[$i]] = 1;
}

$cardCnt2 = fgets(STDIN);
$card2 = explode(" ",trim(fgets(STDIN)));

$answer = '';

for($i = 0; $i < $cardCnt2; $i ++){
    if(array_key_exists($card2[$i],$tmp)){
        $answer .= "1 ";
    }else{
        $answer .= "0 ";
    }
}
echo trim($answer);
