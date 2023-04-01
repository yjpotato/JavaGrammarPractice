package Class;

public class Add2 {
    public static void main(String[] args) {

            // 매개변수가 2개인 add 메소드 사용
            Add add1 = new Add(); // Add 객체 생성
            int sum = add1.add(1,2); // 두 수의 합을 계산하고 반환
            System.out.println("두 수의 합: " + sum); // 결과 출력
            sum = add1.add(4,5,6); // 세 수의 제곱의 합을 계산하고 반환
            System.out.println("세 수의 제곱의 합: " + sum); // 결과 출력
        }
    }


