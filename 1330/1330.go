package main

import (
	"fmt"
)

func main() {
	var input1, input2 int
	fmt.Scanln(&input1, &input2)
	if input1 > input2 {
		fmt.Print(">")
	} else if input1 < input2 {
		fmt.Print("<")
	} else {
		fmt.Print("==")
	}
}
