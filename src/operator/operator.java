package operator;

import java.util.Scanner;

public class operator {
    //
//--------------------연산자--------------------
    public static void main(String[] args) {
        System.out.println("-------1. 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요." +
                "  (메소드로 따로 만들지 말고 메인메소드에서 구현)--------");
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num2 = sc.nextInt();

        int sum;
        sum = num1 + num2;
        int min;
        min = num1 - num2;
        int mul;
        mul = num1 * num2;
        int div;
        div = num1 / num2;
        int rem;
        rem = num1 % num2;

        System.out.println("두 정수의 덧셈 : " + sum + ", 두 정수의 뺄셈 : " + min + ", 두 정수의 곱셈" + mul + ", 두 정수의 나눗셈" + div +
                ", 두 정수의 나눗셈 나머지 : " + rem);
        System.out.println("--------- int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요. 21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20---");
        int num = 20;

        System.out.println(++num); // 21
        System.out.println(++num); // 22
        System.out.println(num); // 22
        System.out.println(num--); // 21
        System.out.println(--num); // 20
        System.out.println(num--);//20
        System.out.println(num);   // 19
        //수정해야함
        System.out.println("-------------3. 사용자가 입력한 정수가 2와 7의 공배수면 2와 7의 공배수라고 출력하고 아니면 2와 7의 공배수가 아님이라고 출력하세요.---------");

        System.out.print("정수를 입력하세요: ");
        int input = sc.nextInt();

        if (input % 2 == 0 && input % 7 == 0) {
            System.out.println("2와 7의 공배수입니다.");
        } else {
            System.out.println("2와 7의 공배수가 아닙니다.");
        }
        System.out.println("----------4. 사용자로부터 입력받은 문자열이 Hello 인지 아닌지 판별하는 프로그램을 작성하세요.---------");

        System.out.print("문자열을 입력하세요: ");
        String input2 = sc.nextLine();

        if (input2.equals("Hello")) {
            System.out.println("입력한 문자열은 Hello입니다.");
        } else {
            System.out.println("입력한 문자열은 Hello가 아닙니다.");
        }
        System.out.println("---------5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면,짝수라고 출력하세요.------");
        System.out.println("숫자를 입력하세요.");
        int input3 = sc.nextInt();

        String result = (input3 % 2 == 0) ? "짝수" : "홀수";
        System.out.println("입력한 정수는 " + result + "입니다.");

        System.out.println("6. 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 100보다 큼 작으면 100보다 작음 같으면 100을 출력하세요.");
        int input4 = sc.nextInt();
        //(조건문1) ? (조건문 1이 참일때) : (거짓일때 수행할 조건문2) ? (조건문 2 참일때) : (모두 거짓일 때)
        String result2 = (input4 > 100) ? "100보다 큼" : (input4 < 100) ? "100보다 작음" : "100";
        System.out.println(input4 + " 는" + result2);

        System.out.println("-----------7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.-------------");
        System.out.println("첫번째 숫자를 입력하세요.");
        double num3 = sc.nextDouble();
        System.out.println("두번째 숫자를입력하세요.");
        double num4 = sc.nextDouble();

        System.out.println(num3 + num4);
        System.out.println(num3 - num4);
        System.out.println(num3 * num4);
        System.out.println(num3 / num4);
        System.out.println(num3 % num4);

        System.out.println("8. 사용자가 입력한 하나의 문자열과 하나의 정수로 \"입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다.\" 라고 출력하세요.");

        System.out.println("글을 입력하세요 : ");
        String input5 = sc.nextLine();
        sc.nextLine(); // 개행문자를 제거해주는 작업
        System.out.println("숫자를 입력하세요 : ");
        int input6 = sc.nextInt();
        sc.nextLine(); // 개행문자를 제거해주는 작업

        System.out.println("입력한 문자열 "+ input5+"이고, 입력한 숫자는 "+input6+"입니다.");

    }
}


