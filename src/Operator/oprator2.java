package Operator;

public class oprator2 {
    public static void main(String[] args) {
        //1. public static void main(String[] args) {
//    	for(int i = 1; i <= 10; i++) {
//		if() {
//			// 3, 6 ,9
//		} else if() {
//			// 1, 4, 7, 10
//		} else if() {
//			// 2, 5, 8
//		}
//	}
//   }
//   위 코드처럼 1 ~ 10까지의 숫자를 3가지 조건으로 나눌 때 가장 적합한 조건으로 채워주세요.
//

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                // 3의 배수인 경우 (3, 6, 9)
            } else if (i % 2 == 1) {
                // 3의 배수가 아니지만 홀수인 경우 (1, 4, 7, 10)
                // 2로 나눴을 때 나머지가 1인 경우
            } else {
                // 3의 배수가 아니면서 짝수인 경우 (2, 5, 8)
            }
        }
        ////2. 중첩 삼항 연산자를 이용해서 1 ~ 20까지의 숫자중 소수를 판별하여 소수면 "xx는 소수입니다."라고 출력하고 소수가 아니면 4의 배수인지 판별하여
        ////     "xx는 4의 배수입니다."라고 출력하고 4의 배수가 아니면 "xx는 4의 배수가 아닙니다."라고 출력하세요.
        for (int i = 1; i <= 20; i++) { //1~20까지 반복
            String message = (i == 1 || i == 2) ? i + "는 소수입니다." :
                    (i % 2 == 0) ? i + "는 4의 배수입니다." :
                            (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) ? i + "는 소수가 아닙니다." :
                                    i + "는 소수입니다.";
            System.out.println(message);
        }


    }
}
