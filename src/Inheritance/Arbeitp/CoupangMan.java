package Inheritance.Arbeitp;
//알바를 상속받는 캐셔와 쿠팡맨 클래스를 만들고 일한다 메소드를 오버라이딩하여 캐셔는 "캐셔는 일한 시간동안 계산해서 일한 시간 * 시간당 급여를 받는다."
// 쿠팡맨은  "쿠팡맨은 일한 시간동안 배송해서 일한 시간 * 시간당 급여를 받는다."라고 출력하도록 구현하세요. 일한 시간과 시간당 급여는 생성자에서 초기화합니다.

public class CoupangMan extends Arbeit {
    public CoupangMan(int workTime, int timePay) {
        super(workTime, timePay);
    }
    @Override
    public int getPaid() {
        return super.getPaid();
    }

    public void doWork() {
        System.out.println("쿠팡맨은 " + getPaid() + "원을 받는다.");
    }


}
