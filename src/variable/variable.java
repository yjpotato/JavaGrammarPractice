package variable;

import java.util.Scanner;

public class variable {
    public static <PI> void main(String[] args) {
        System.out.println("---------------1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.-------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String str = sc.next();
        System.out.println("나이을 입력하세요 : ");
        String str2 = sc.next();
        System.out.println("성별을 입력하세요 : ");
        String str3 = sc.next();
        System.out.println("----------- 2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.");
        System.out.println("첫번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();
        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("잘못된 연산자입니다.");
                System.exit(0);
        }
        System.out.println("결과: " + result);
        System.out.println("-----------3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)\n" +
                "//        단, 원주율 3.14는 상수로 선언하세요.-----------------------------");

        int radius = 20;        // 반지름
        double area, perimeter;    // 넓이, 둘레
        final double PI = 3.14; //원주율

        // 원의 넓이 = 반지름 * 반지름 * 3.141592
        area = radius * radius * PI;
        // ② 둘레 연산
        perimeter = radius * 2 * PI;

        System.out.println("원의 넓이는 : " + area);
        System.out.println("원의 둘레는 : " + perimeter);
        System.out.println("---------------------  4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.-------------------");

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 정수를 입력하세요: ");
            int num = sc.nextInt();
            sum += num;
        }

        double average = (double) sum / 5;

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        System.out.println("----------------------5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.--------------------------");

        System.out.print("첫 번째 정수를 입력하세요: ");
        int num3 = sc.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num4 = sc.nextInt();

        System.out.print("세 번째 정수를 입력하세요: ");
        int num5 = sc.nextInt();

        int min = Math.min(Math.min(num3, num4), num5);
        int max = Math.max(Math.max(num3, num4), num5);
        int middle = num3 + num4 + num5 - min - max;

        System.out.println("최소값: " + min);
        System.out.println("중간값: " + middle);
        System.out.println("최대값: " + max);
        System.out.println("---------------- 6. 사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2----------------------");

        System.out.print("숫자를 입력하세요: ");
        int mulnum = sc.nextInt();

        System.out.println(mulnum + "단을 출력합니다.");
        for (int i = 1; i <= 9; i++) {
            System.out.println(mulnum + " x " + i + " = " + mulnum * i);
        }

        System.out.println("---------------- 7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)------------------------------");
        System.out.print("숫자를 입력하세요: ");
        int facnum = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <= facnum; i++) {
            fact *= i;
        }

        System.out.println(facnum + "의 팩토리얼은 " + fact + "입니다.");
        System.out.println("-----8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)--------");

        System.out.println("10개의 정수를 입력하세요: ");

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {    //입력 받기
            numbers[i] = sc.nextInt();
        }

        System.out.println("입력한 숫자 중 소수는 다음과 같습니다.");
        for (int i = 0; i < 10; i++) {      //출력하기
            boolean isPrime = true;
            if (numbers[i] <= 1) {  // 1은 소수가 아님
                isPrime = false;
            }
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {  // 나누어 떨어지면 소수가 아님
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(numbers[i]);
            }
        }
    }

    }




