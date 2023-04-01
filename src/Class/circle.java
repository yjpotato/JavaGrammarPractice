package Class;
//5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.

    public class circle {
        private double radius;

        public circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() { //넓이
            return Math.PI * radius * radius;
        }

        public double getPerimeter() { //둘레
            return 2 * Math.PI * radius;
        }

        public static void main(String[] args) {
            double radius = 5.0; // 원의 반지름
            circle myCircle = new circle(radius); // 원 객체 생성

            // 결과 출력
            System.out.println("반지름: " + myCircle.getRadius());
            System.out.println("넓이: " + myCircle.getArea());
            System.out.println("둘레: " + myCircle.getPerimeter());
        }
    }



