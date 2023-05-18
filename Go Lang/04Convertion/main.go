package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func main() {
	fmt.Println("Wel Come Go Lang")
	fmt.Println("Rating 1 to 5")

	rating := bufio.NewReader(os.Stdin)
	fmt.Println(rating)
	input, _ := rating.ReadString('\n')
	fmt.Println("thank for Rating", input)

	numrating, err := strconv.ParseFloat(strings.TrimSpace(input), 64)

	if err != nil {
		fmt.Println(err)
	} else {
		fmt.Println(numrating + 1)
	}

}
