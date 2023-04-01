package Class;
class ElseIfCla extends IfCla {
    @Override
    public void makeIf(int num) {
        if(num == 5) {
            System.out.println("5입니다.");
        } else if(num > 5) {
            System.out.println("5보다 큽니다.");
        } else {

            super.makeIf(num);
        }
    }

    public void makeElseIf(int num) {
        if(num == 5) {
            System.out.println("5입니다.");
        }
    }

    @Override
    public void makeElse(int num) {
        System.out.println("5보다 작습니다.");
    }
}
