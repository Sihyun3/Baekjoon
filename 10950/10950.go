package main

import (
	"fmt"
)

func main() {
	var line int
	fmt.Scanln(&line)

	for i := 0; i < line; i++ {
		var A, B int
		fmt.Scanln(&A, &B)
		fmt.Println(A + B)
	}
}
