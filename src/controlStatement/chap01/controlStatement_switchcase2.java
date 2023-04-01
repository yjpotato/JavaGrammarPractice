package controlStatement.chap01;

import java.util.Scanner;

public class controlStatement_switchcase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    }
}
