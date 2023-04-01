package controlStatement.chap01;

import java.util.Scanner;
public class controlStatement {

    public static void main(String[] args) {
        System.out.println("---------1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.-------");
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 :");
        int num1 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요 :");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1+"가 더 큽니다.");
        }else if(num1 < num2) {
            System.out.println(num2+"가 더 큽니다.");
        }else {
            System.out.println("두 숫자가 똑같습니다.");
        }
        System.out.println("2. 사용자가 입력한 정수가 양수면 양수 음수면 음수라고 출력하세요.");
        System.out.println("숫자를 입력하세요");
        int input = sc.nextInt();
        if (input > 0){
            System.out.println("양수");
        }else if(input < 0){
            System.out.println("음수");
        }else {
            System.out.println("0입니다.");
        }

        System.out.println("3. 사용자가 입력한 문자열이 \"Java\"인 경우 \"좋아하는 언어입니다.\"를 출력하고," +
                " \"Python\"인 경우 \"공부중인 언어입니다.\"를 출력하고, " +
                "그렇지 않은 경우 \"다른 언어를 공부해보세\n" +
                "  요.\"를 출력하세요.(switch~case~default 사용)");

        System.out.println("글을 입력하세요 : ");
        String str = sc.nextLine().trim(); // 입력받은 문자열에서 엔터(\n)를 제거해주는 작업이 필요

        switch (str){
            case "Java" :
                System.out.println("좋아하는 언어입니다.");
                break;

            case "Python" :
                System.out.println("공부중인 언어입니다.");
                break;

            default :
                System.out.println("다른 언어를 공부해보세요");
            break;
        }

        System.out.println("4. 사용자가 입력한 숫자가 3의 배수면 \"3의 배수입니다.\"라고 출력하고 3의 배수가 아니면 \"3의 배수가 아닙니다.\"를 출력하세요.(switch~case~default 사용)");
        System.out.println("숫자를 입력하세요 : ");
        int num3 = sc.nextInt();

        switch (num3 % 3) {
            case 0 :
                System.out.println("3의 배수입니다.");
                break;
            default:
                System.out.println("3의 배수가 아닙니다.");
                break;

        }
        System.out.println("5. 사용자가 입력한 숫자가 홀수인 경우 \"홀수입니다.\"를 출력하고, 짝수인 경우 \"짝수입니다.\"를 출력하는 프로그램을 작성하세요.");
        System.out.println("숫자를 입력하세요");
        int num4 = sc.nextInt();

        switch (num4 % 2){
            case 0:
                System.out.println("짝수입니다.");
                break;
            default:
                System.out.println("홀수입니다.");
                break;
        }
        System.out.println("6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.");
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 정수를 입력하세요: ");
            int num = sc.nextInt();
            if(num > max){
                max = num;
            }
        }
        System.out.println(max + "가 가장 큰 수 입니다.");

        System.out.println("7. 사용자가 입력한 문자열이 \"Yes\"인 경우 \"예\"를 출력하고, \"No\"인 경우 \"아니오\"를 출력하고, 그 외의 경우에는 \"잘못 입력하셨습니다.\"를 출력하세요.");
        System.out.println("문자열을 입력하세요: ");
        String input2 = sc.nextLine();

        switch (input2){
            case "Yes" :
                System.out.println("예");
                break;
            case "No" :
                System.out.println("아니오");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }
        System.out.println("8. 사용자가 입력한 두 정수를 비교하여 같으면 \"두 수가 같습니다.\" 첫 번째 수가 더 크면 \"첫 번째 수가 더 큽니다.\" 두 번째 수가 더 크면 \"두 번째 수가 더 큽니다.\"를 출력하세요.");
        System.out.println("첫번째 숫자를 입력하세요");
        int num5 = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        int num6 = sc.nextInt();

        if (num5 > num6){
            System.out.println("첫번째 숫자가 더 큽니다.");
        }else if(num5 < num6){
            System.out.println("첫번째 숫자가 더 큽니다.");
        }else {
            System.out.println("두 숫자가 같습니다.");
        }

        System.out.println("9. 사용자가 입력한 세 정수가 모두 짝수인 경우 \"모두 짝수입니다.\" 모두 홀수인 경우 \"모두 홀수입니다.\" 그 외의 경우 \"짝수 : xxx개, 홀수 : xxx개 입니다.\"를 출력하세요.");

        int even = 0; //짝수
        int odd = 0;  //홀수

        for (int i = 1; i <= 3; i++) {   //입력 받은 숫자들 미리 짝수랑 홀수에 담아주기
            System.out.print(i + "번째 정수를 입력하세요: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        if (even == 3) {  // 그다음 조건문으로 비교 해서 출력
            System.out.println("모두 짝수입니다.");
        } else if (odd == 3) {
            System.out.println("모두 홀수입니다.");
        } else {
            System.out.println("짝수 : " + even + "개, 홀수 : " + odd + "개 입니다.");
        }











    }
}
