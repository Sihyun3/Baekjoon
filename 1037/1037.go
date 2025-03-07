package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	var cnt int
	var answer int
	var list []int
	var min int
	var max int
	fmt.Scanln(&cnt)
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()

	input := scanner.Text()
	inputList := strings.Split(input, " ")
	for _, el := range inputList {
		tmp, _ := strconv.Atoi(el)
		if max == 0 || min == 0 {
			min = tmp
			max = tmp
		} else {
			if tmp < min {
				min = tmp
			}
			if tmp > max {
				max = tmp
			}
		}

		list = append(list, tmp)
	}

	answer = min * max
	fmt.Println(answer)
}
