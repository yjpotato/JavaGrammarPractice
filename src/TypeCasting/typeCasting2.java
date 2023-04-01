package TypeCasting;
import java.util.Scanner;
public class typeCasting2 {
    public static void main(String[] args) {
        System.out.println("1. 사용자가 입력한 수(실수나 정수 모두 가능)를 StringBuilder로 받아서 점(.)이 포함되면 double형으로 포함되지 않으면 int형으로 변경 후 출력하세요.");
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        StringBuilder input = new StringBuilder(sc.nextLine());

        if (input.indexOf(".") != -1) { // 소수점이 포함된 경우
            double num = Double.parseDouble(input.toString());
            System.out.println("입력한 숫자는 double형으로 변환된 결과는 " + num + "입니다.");
        } else { // 소수점이 포함되지 않은 경우
            int num = Integer.parseInt(input.toString());
            System.out.println("입력한 숫자는 int형으로 변환된 결과는 " + num + "입니다.");
        }

        sc.close();
    }


    }

