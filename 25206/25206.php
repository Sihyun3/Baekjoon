<?php
$grade = ["A+" => 4.5, "A0" => 4.0, "B+" => 3.5, "B0" => 3.0, "C+" => 2.5, "C0" => 2.0, "D+" => 1.5, "D0" => 1.0, "F" => 0.0];

$answer = 0.0;

$totalScore = 0.0;
for($i = 0; $i < 20; $i ++){
    $line = explode(" ", fgets(STDIN));
    $tmp = trim($line[2]);
    if($tmp == "P"){
        continue;
    }

    $score = $grade[$tmp] * (float) $line[1];
    $answer +=  $score;
    $totalScore += (float) $line[1];
}
echo $answer / $totalScore;