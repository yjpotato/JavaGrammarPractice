package Class;
//6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
public class charge {

        private int balance; //잔액

        public charge(int balance) { //charge 클래스의 생성자.
            this.balance = balance;  //객체의 속성을 초기화. 객체를 생성하면서 속성값을 지정할 수 있음.
        }

        public void deposit(int amount) { //입금
            balance += amount;
        }

        public boolean withdraw(int amount) { //출금
            if (balance >= amount) {
                balance -= amount; //출금 금액만큼 잔액에서 차감한 뒤 true 값을 반환
                return true;
            } else { // 잔액이 출금 금액보다 작으면 출금이 불가능
                return false;
            }
        }

        public int getBalance() {
            return balance;
        }

    public static void main(String[] args) {
        charge myAccount = new charge(10000); // 초기 잔액 10,000원으로 계좌 객체 생성
        System.out.println("현재 잔액: " + myAccount.getBalance() + "원");

        myAccount.deposit(5000); // 5,000원 입금
        System.out.println("입금 후 잔액: " + myAccount.getBalance() + "원");

        if (myAccount.withdraw(8000)) { // 8,000원 출금 시도
            System.out.println("출금 후 잔액: " + myAccount.getBalance() + "원");
        } else {
            System.out.println("출금 실패: 잔액이 부족합니다.");
        }
    }
    }



