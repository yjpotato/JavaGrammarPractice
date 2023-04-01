package loop;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        System.out.println("1. 1부터 10까지의 정수의 합을 출력하세요.");
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println("1~10까지의 합은 :" + sum);

        System.out.println("2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력");
        int mul = 1;
        for (long i = 2; i <= 2000; i = i * 2) {
            System.out.println("2 ^ " + mul + " = " + i);
            mul++;
        }

        System.out.println("3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.");
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int inputNum = sc.nextInt();

        System.out.print("입력한 정수까지의 모든 소수들은 " + inputNum + " 입니다 ");

        for (int i = 2; i <= inputNum; i++) {  //1은 소수가 아니기 때문에 2부터 시작
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;   // 소수가 아니기 때문에 break문을 이용하여 내부 루프를 빠져나가줌.
                    break;
                }
            }
            if (isPrime) {     // 남은것들은 소수
                System.out.print(i + " ");
            }
        }

       //두번째 소수 구하는 방법
//        for(int i = 2; i <= inputNum; i++){
//            int cnt = 0;
//            for (int j = 2; j <= i; j++){
        //자기 자신이 아닌 다른 값으로 나눠 떨어짐
//                if(i % j == 0 && i != j){
//                    cnt++;
//                }
//            }
//            if(cnt == 0){
//                System.out.println(i);
//            }
//        }


        System.out.println("4. 사용자가 입력한 정수의 약수를  출력하세요.");
        int inputNum2 = sc.nextInt();
        System.out.print("입력한" + inputNum2 + "의 모든 소수들은 " + inputNum + " 입니다 ");
        for (int i = 1; i <= inputNum2; i++) {
            if (inputNum2 % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("5. 사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)");
        System.out.println("10개의 정수를 입력하세요: ");

        int[] nums = new int[10]; //배열 크기 지정

        for (int i = 0; i < 10; i++) {   // 정수를 입력받아 배열에 저장
            nums[i] = sc.nextInt();
        }

        System.out.print("입력한 정수를 역순으로 출력: ");    // 배열의 마지막 요소부터 처음 요소까지 역순으로 출력
        for (int i = 9; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("6. 사용자가 입력한 문자열을 역순으로 출력하세요.");
        System.out.println("문자열을 입력하세요: ");

        String inputStr = sc.nextLine();

        StringBuilder sb = new StringBuilder(inputStr); // StringBuilder 클래스를 이용하여 입력된 문자열을 뒤집음
        String reversedStr = sb.reverse().toString(); // reverse 뒤집어

        System.out.println("입력한 문자열을 역순으로 출력: " + reversedStr); // 뒤집은 문자열을 출력

        System.out.println("7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.");
        int num1 = 0, num2 = 0;

        while (num1 <= 0 || num2 <= 0) {
            System.out.println("두 개의 양의 정수를 입력하세요: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        int gcd = 0, lcm = 0;

        for (int i = 1; i <= num1 && i <= num2; ++i) { //num1과 num2 중 작은 값까지 반복하면서,
            // num1과 num2가 모두 나누어지는 수를 찾아
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }


        lcm = (num1 * num2) / gcd;   //최소공배수 = (num1 * num2) / 최소공약수


        System.out.println(num1 + "과 " + num2 + "의 최대공약수는 " + gcd + "입니다.");
        System.out.println(num1 + "과 " + num2 + "의 최소공배수는 " + lcm + "입니다.");


        //다른 최소공배수, 최대공약수 구하는 방법
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//
//        int minnum = number1 > number2 ? number2 : number1;
//
//        int gcdn = 1;
//
//        for (int i=1; i <minnum; i++){
//            if (number1 % 1 == 0 && number2 % i == 0){
//                gcdn = i;
//            }
//        }
//        int common = number1 * number2 / gcdn;
//        System.out.println("최대공약수 : "+gcdn);
//        System.out.println("최소공배수 : "+common);


        System.out.println("별찍기 삼각형");

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.print("\n");

        }
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

        System.out.println("9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.");
        int total = 0; // 입력한 정수의 합을 저장할 변수

        while(true) {
            System.out.print("정수를 입력하세요 (종료하려면 q): ");
            String input = sc.next();

            if(input.equals("q")) { // q를 입력하면 반복 종료
                break;
            }
            int num = Integer.parseInt(input); // 입력한 문자열을 정수형으로 변환
            total += num; // 입력한 정수를 합산
        }

        System.out.println("입력한 정수의 총 합: " + total);
        sc.close(); // Scanner 객체 닫기

    }
}







