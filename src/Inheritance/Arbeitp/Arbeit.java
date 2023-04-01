package Inheritance.Arbeitp;
//일한 시간, 시간당 급여를 속성으로 갖는 알바라는 클래스를 만들고 일한다(일한 시간동안 일해서 일한 시간 * 시간당 급여를 받는다. 라고 출력하는)를 메소드로 만드세요.
public class Arbeit {

        private int workTime;
        private int timePay;

        public Arbeit(int workTime, int timePay) {
            this.workTime = workTime;
            this.timePay = timePay;
        }

        public int getWorkTime() {
            return workTime;
        }

        public void setWorkTime(int workTime) {
            this.workTime = workTime;
        }

        public int getTimePay() {
            return timePay;
        }

        public void setTimePay(int timePay) {
            this.timePay = timePay;
        }
         //일한다 메소드
        public int getPaid() {
            return workTime * timePay;
        }
    }


