package ControlStatement.chap01;
import java.util.Scanner;
public class controlstatement_if {
    public static void main(String[] args) {
        System.out.println("사용자가 입력한 문자열의 길이가 20이상이면 해당 문자열을 거꾸로 출력하고 " +
                "     20미만이면 문자열에 n, a, v, e, r 다섯개의 문자를 순서대로 추가하여" +
                "     문자열의 길이가 20이 되면 그 때 문자열을 출력하세요.");
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String inputString = sc.nextLine();

        if (inputString.length() >= 20) {
            StringBuilder sb = new StringBuilder(inputString);//변환한 글자를 넣어줄 공간
            System.out.println("입력한 문자열의 역순: " + sb.reverse().toString()); //reverse 거꾸로, toString 변환
        } else {
            while (inputString.length() < 20) {
                inputString += "naver".charAt(inputString.length() % 5); //"naver" 문자열에서 입력한 문자열의 길이를 5로 나눈 나머지는 0이므로,
                                                                         // 추가할 문자는 n이된다
            }
            System.out.println("출력할 문자열: " + inputString);
        }
    }
}
