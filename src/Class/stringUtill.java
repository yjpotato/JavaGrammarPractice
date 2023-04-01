package Class;
//3. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
public class stringUtill {
        public static String concat(String str1, String str2) { //concat 문자열을 합치는 메소
            return str1 + str2;
        }

    public static void main(String[] args) {
        String str1 = "Hello ";
        String str2 = " I'm yoojin";
        String result = concat(str1, str2);
        System.out.println(result);
    }
    }


