package main

import (
	"fmt"
)

/*
var number int = 5

func multiply(a, b int) int { //함수 이용방법
	return a * b
}

func lenAndUpper(Name string) (int, string) { //여러 return값 지정 함수
	return len(Name), strings.ToUpper(Name)
}

func repeatMe(words ...string) { //argument이용 함수. / ...붙이면 무제한 반복
	fmt.Println(words)
}

func main() {
	name := "jiwon" // 데이터 타입 값을 찾아준다. 값 변경 불가능.

	fmt.Println("Hellow World")

	fmt.Println(name)
	fmt.Println(number)

	fmt.Println(multiply(2, 2)) //multiply 함수 출력

	totalLenght, upperName := lenAndUpper("nico") //lendAndUpper함수 값 지정
	//한개만 출력할 시 value값 무시하는 코딩 작성.
	//ex) totalLenght, _ := lenAndUpper("nico")
	// 	  fmt.Println(totalLenght)
	fmt.Println(totalLenght, upperName) // nico가 몇글자인지 int출력, 이름 출력

	repeatMe("nico", "lynn", "dal", "marl", "flynn") //repeatme함수 이용


}

*/

/*
//func 이용방법2
//naked return 방법
func lenAndUpper(name string) (length int, uppercase string) {
	defer fmt.Println("I'm done") // defer은 func끝난 후 실행되는 동작. 아주 큰 영향을 줄 수 있다.
	length = len(name)
	uppercase = strings.ToUpper(name)
	return // return length, uppercase로 정의해도 상관없다. func에 무엇을 retrun 할지 명시해 두었기 때문에.
}

func main() {
	totalLenght, up := lenAndUpper("nico")
	fmt.Println(totalLenght, up)
}
*/

//loop 생성
func supperAdd(numbers ...int) int {
	fmt.Println(numbers)
	//return 1
	for number, index := range numbers {
		fmt.Println(number, index)
	}
	//다른방법
	for i := 0; i < len(numbers); i++ {
		fmt.Println(numbers[i])
	}
	//return 1
	//덧셈
	total := 0
	for _, number := range numbers {
		total += number
	}
	return total
}

func main() {
	//supperAdd(1, 2, 3, 4, 5, 6)
	result := supperAdd(1, 2, 3, 4, 5, 6)
	fmt.Println(result)
}
