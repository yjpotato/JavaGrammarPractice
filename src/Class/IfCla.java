package Class;
class ElseCla {
    void makeElse(int num) {
        System.out.println("오답입니다.");
    }
}

// IfCla 클래스 정의
abstract class IfCla {
    ElseCla elseCla;

    IfCla() {
        elseCla = new ElseCla();
    }

    void makeIf(int num) {
    }

    abstract void makeElse(int num);
}

class MyClass extends IfCla {
    void makeIf(int num) {
        if (num == 1) {
            System.out.println("정답입니다.");
        } else {
            elseCla.makeElse(num);
        }
    }

    void makeElse(int num) {
        System.out.println("오답입니다.");
    }
}

