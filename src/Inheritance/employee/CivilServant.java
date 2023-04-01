package Inheritance.employee;

    public class CivilServant implements Worker {
        private String name;

        public CivilServant(String name) {
            this.name = name;
        }

        @Override
        public void goWork() {
            System.out.println(name + "공무원로 출근합니다.");
        }

        @Override
        public void doWork() {
            System.out.println(name + "사회복지부에서 일을 하고 있습니다.");
        }

        @Override
        public void leaveWork() {
            System.out.println(name + "주로 6시에 퇴근합니다");
        }
}
