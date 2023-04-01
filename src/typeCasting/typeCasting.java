package typeCasting;

import java.util.Scanner;

public class typeCasting {


    public static void main(String[] args) {
        System.out.println(" -------1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요.-------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요: ");
        String num1 = sc.nextLine();

        System.out.print("두 번째 정수를 입력하세요: ");
        String num2 = sc.nextLine();

        int numT1 = Integer.parseInt(num1);
        int numT2 = Integer.parseInt(num2);

        int sum = numT1 + numT2;

        System.out.println("두 수의 합: " + sum);

        System.out.println("-------2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)-----");
        System.out.print("정수 a를 입력하세요: ");
        int a = sc.nextInt();

        int b;
        while (true) {
            System.out.print("정수 b를 입력하세요 (0은 입력할 수 없습니다.): ");
            b = sc.nextInt();
            if (b != 0) break;
            System.out.println("0을 입력할 수 없습니다. 다시 입력해주세요.");
        }

        double result = (double) a / b;
        System.out.println("a / b의 결과는 " + result + "입니다.");

        System.out.println("----- 3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.--------");

        System.out.print("숫자를 입력하세요: ");
        double dnum = sc.nextDouble();
        int numInt = (int) dnum;

        System.out.println("입력한 실수의 정수형 변환 값: " + numInt);

        System.out.println("--------------- 4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.-----------");
        System.out.print("숫자를 입력하세요: ");
        double dnum2 = sc.nextDouble();
        double square = Math.pow(dnum2, 2);
        String stringValue1 = Double.toString(square);
        System.out.println(stringValue1);

        System.out.println("------------5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.-------------------");
        int iNum = 10;
        long lNum = 20;

        long temp = iNum;
        iNum = (int) lNum; // lNum의 값이 int 범위를 초과하므로 (int)로 형변환
        lNum = temp;
        System.out.print(iNum);
        System.out.println(lNum);

        System.out.println("----------------6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.---------------------");
        System.out.print("첫 번째 문자를 입력하세요: ");
        char str1 = sc.next().charAt(0);
        System.out.println((int) str1);

        System.out.print("두 번째 문자를 입력하세요: ");

        char str2 = sc.next().charAt(0);
        System.out.println((int) str2);


    }


}
