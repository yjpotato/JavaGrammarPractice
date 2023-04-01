package Inheritance.employee;
//근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를
//    본인이 원하는 대로 구현하세요.

//인터페이스는 단순히 메소드의 원형만을 제공하고, 구현 내용은 자식 클래스에서 구현해야 합니다.
public interface Worker {
    void goWork();    // 출근하다
    void doWork();    // 일하다
    void leaveWork(); // 퇴근하다
}
