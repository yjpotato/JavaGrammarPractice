package Class;
//4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.

//public static은 해당 변수 또는 메소드가 객체의 생성과 무관하게 클래스에 속하며,
//어디서든 바로 접근 가능하도록 하는 접근 제어자와 클래스 멤버 변수/메소드를 정의하는 키워드의 조합
public class mathUtill {

        public static double multiply(int num1, double num2) { // (int num1, double num2) -> 메소드의 매개변수
            double result = num1 * num2;
            result = Math.round(result * 100.0) / 100.0; //round 반올림 함수
            return result; //result라는 변수에 결과값을 저장한 뒤, return 키워드를 사용해서 result 값을 반환하도록 구현되어 있습니다.
                        //return을 생략하게 되면 반환된 값이 없기 때문에, 메소드 내에서 계산한 결과를 활용할 수 없게 된다.


        }

    public static void main(String[] args) {
        int num1 = 5;
        double num2 = 3.14;
        double result = multiply(num1, num2);
        System.out.println(result);
    }
    }


