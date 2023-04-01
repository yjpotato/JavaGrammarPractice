package Inheritance.employee;
//근로자를 인터페이스로 생성하고 출근하다, 퇴근하다, 일한다. 메소드를 선언합니다. 근로자를 상속받은 개발자와 공무원 클래스 만들고 상속받은 세 개의 메소드를
//        본인이 원하는 대로 구현하세요.
public class Developer implements Worker{
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void goWork() {
        System.out.println(name + " 개발자로 으출근합니다.");
    }

    @Override
    public void doWork() {
        System.out.println(name + "웹개발을 하고 있습니다.");
    }

    @Override
    public void leaveWork() {
        System.out.println(name + "주로 7시에 퇴근합니다");
    }
}











