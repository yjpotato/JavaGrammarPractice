package Inheritance;
//성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.
public class Parent {

        private String lastName; //속성
        private String bloodType;
        private int height;
        private String skinColor;

        public Parent(String lastName, String bloodType, int height, String skinColor) {
            this.lastName = lastName;
            this.bloodType = bloodType;
            this.height = height;
            this.skinColor = skinColor;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getBloodType() {
            return bloodType;
        }

        public void setBloodType(String bloodType) {
            this.bloodType = bloodType;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getSkinColor() {
            return skinColor;
        }

        public void setSkinColor(String skinColor) {
            this.skinColor = skinColor;
        }
    }







