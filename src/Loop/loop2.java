package Loop;

import java.util.Random;
import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        //1. 1~20까지 랜덤한 값을 생성해서 생성한 랜덤 값만큼 반복되는 반복문을 만들고
//    반복문에서 사용자가 입력한 문자열에 "bit"를 계속 추가하세요. 그리고 bit가 몇 번
//    추가됐는지 개수를 세서 출력하세요. 랜던 값을 그대로 출력하면 안됩니다.
//
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNum = rand.nextInt(20) + 1; // 1 ~ 20 사이의 랜덤한 숫자 생성
                                                    //0~19이기 때문에 +1을 더해줌
        System.out.println("랜덤 값: " + randomNum);

        String inputString = sc.nextLine();
        int bitCount = 0; // bit가 추가된 횟수를 저장할 변수 초기화

        while (randomNum > 0) {
            inputString += "bit";
            bitCount++;
            randomNum--;// 반복문의 조건을 만족하지 못할 때마다 randomNum 변수를 1씩 감소
        }

        System.out.println("추가된 bit의 개수: " + bitCount);
        System.out.println("결과 문자열: " + inputString);
        //2. 사용자가 입력한 정수의 약수들의 총합을 출력하세요.
        System.out.print("정수를 입력하세요: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        System.out.println("약수의 총합: " + sum);


    }
}
