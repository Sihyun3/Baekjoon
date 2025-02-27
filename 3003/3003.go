package main

import (
	"fmt"
)

func main() {
	var k = 1
	var q = 1
	var l = 2
	var b = 2
	var n = 2
	var p = 8

	var input1, input2, input3, input4, input5, input6 int
	fmt.Scanln(&input1, &input2, &input3, &input4, &input5, &input6)
	fmt.Printf("%d %d %d %d %d %d", k-input1, q-input2, l-input3, b-input4, n-input5, p-input6)
}
