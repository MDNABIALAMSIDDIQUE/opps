package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	user := "Wel Come User Name"
	fmt.Print(user)

	//================ User Input by Consal

	reder := bufio.NewReader(os.Stdin)
	fmt.Println("Enter the Ratting this Work....")
	input, _ := reder.ReadString('\n')
	fmt.Println("Thanks, ", input)
}
