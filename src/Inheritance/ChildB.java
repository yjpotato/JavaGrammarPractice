package Inheritance;
//성씨, 혈액형, 키, 피부색을 속성으로 가지는 Parent 클래스를 생성하고 Parent를 상속받은 ChildA, ChildB 클래스를 만들어서
//    ChildA에는 이름 속성을 추가하고 ChildB에는 지문 속성을 추가하세요.

    public class ChildB extends Parent {
        private String fingerprint;

        public ChildB(String lastName, String bloodType, int height, String skinColor, String fingerprint) {
            super(lastName, bloodType, height, skinColor); //부모 클래스의 생성자를 호출. 부모 클래스의 필드나 메서드에 접근
            this.fingerprint = fingerprint; // 현재 클래스의 인스턴스를 참조할 때 사용. 현재 클래스의 필드나 메서드에 접근
        }

        public String getFingerprint() {
            return fingerprint;
        }

        public void setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
        }
}
