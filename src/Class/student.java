package Class;
//1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
//public -> 해당 클래스, 변수, 메소드 등을 다른 클래스에서 언제든지 접근 가능하도록 하는 접근 제어자.
//public static은 해당 변수 또는 메소드가 객체의 생성과 무관하게 클래스에 속하며,
//어디서든 바로 접근 가능하도록 하는 접근 제어자와 클래스 멤버 변수/메소드를 정의하는 키워드의 조합
public class student {

        private String name;  //객체 변수 =  인스턴스 변수, 멤버 변수, 속성
        private int studentId; //객체 변수 =  인스턴스 변수, 멤버 변수, 속성
        private String department; //객체 변수 =  인스턴스 변수, 멤버 변수, 속성

        // 메서드는 클래스 내에 구현된 함수를 의미
        public student(String name, int studentId, String department) { //정보를 저장하는 메소드
            this.name = name;  //this는  student 클래스에 의해서 생성된 객체를 지칭
            this.studentId = studentId;
            this.department = department;
        }
        //set 메서드는 객체의 속성값을 변경하는 메서드로, 외부에서 해당 객체의 속성에 값을 할당할 수 있는 유일한 방법

        public void setName(String name) { //입력으로 name이라는 문자열을 받고 출력은 없는 형태의 메서드. 리턴값이 없음.
            this.name = name;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        //get 메서드는 객체의 속성값을 반환하는 메서드로, 외부에서 해당 객체의 속성에 접근할 수 있는 유일한 방법.
        public String getName() {
            return name; //return -> 결과값을 반환하는 키워드
        }

        public int getStudentId() {
            return studentId;
        }

        public String getDepartment() {
            return department;
        }

        public void printInfo() { //학생정보를 출력하는 메소드
            System.out.println("Name: " + name);
            System.out.println("Student ID: " + studentId);
            System.out.println("Department: " + department);
        }

    public static void main(String[] args) {
        student student1 = new student("정유진", 2018144041, "데이터정보학과");

        // 학생 정보 변경
        student1.setName("정유진");
        student1.setStudentId(2018144041);
        student1.setDepartment("정보통신학과");

        // 학생 정보 출력
        student1.printInfo();
    }
    }


