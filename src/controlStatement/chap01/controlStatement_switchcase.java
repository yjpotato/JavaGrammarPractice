package controlStatement.chap01;

import java.util.Scanner;

public class controlStatement_switchcase {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

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








        }
    }


