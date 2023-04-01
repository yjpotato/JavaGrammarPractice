package Variable;
//--------------------변수--------------------
import java.util.Scanner;
public class variable2 {
    public static void main(String[] args) {

        System.out.println("1. 두 개의 정수 a = 10; b = 3;으로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(나눗셈의 결과는 double형으로 나머지는 int형으로 출력)");
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double)a / b);
        System.out.println(a % b);

        System.out.println("두 개의 실수 num1 = 10.01; num2 = 12.25;로 덧셈, 뺄셈, 곱셈, 나눗셈의 결과를 출력하세요.(네 연산 모두 double형 출력)");
        double num1 = 10.01;
        double num2 = 12.25;
        System.out.println((double)num1 + num2);
        System.out.println((double)num1 - num2);
        System.out.println((double)num1 * num2);
        System.out.println((double)num1 / num2);
        System.out.println((double)num1 % num2);

        System.out.println("3. 사용자가 입력한 알파벳을 소문자는 대문자로 대문자는 소문자로 변경해서 출력하세요.");
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳 문자를 입력하세요:");
        char c = sc.next().charAt(0); // 사용자 입력에서 첫 번째 문자를 char 형으로 읽음

        char convertedChar; // 변환된 문자를 저장하기 위한 변수

        // 문자가 소문자인지 검사
        if (c >= 'a' && c <= 'z') {
            // 대문자로 변환하기 위해 대소문자 간 차이를 빼줌
            convertedChar = (char) (c - ('a' - 'A'));
        }
        // 문자가 대문자인지 검사
        else if (c >= 'A' && c <= 'Z') {
            // 소문자로 변환하기 위해 대소문자 간 차이를 더해줌
            convertedChar = (char) (c + ('a' - 'A'));
        }
        // 문자가 알파벳이 아닌 경우, 변환하지 않음
        else {
            convertedChar = c;
        }

        System.out.println("변환된 문자: " + convertedChar);
    }
    }

