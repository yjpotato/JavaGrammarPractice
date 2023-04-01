package Inheritance;
//성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.

    public class ChildA extends Parent {
        private String firstName;

        public ChildA(String lastName, String bloodType, int height, String skinColor, String firstName) {
            super(lastName, bloodType, height, skinColor);
            this.firstName = firstName; //이름 속성 추가
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    }

