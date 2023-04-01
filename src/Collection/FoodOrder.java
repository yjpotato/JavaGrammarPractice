package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class FoodOrder {
        public static void main(String[] args) {
            // 음식 이름과 가격을 저장할 Map 객체 생성
            Map<String, Integer> menu = new HashMap<>();

            // 음식 이름과 가격 추가
            menu.put("짜장면", 5000);
            menu.put("짬뽕", 6000);
            menu.put("볶음밥", 7000);
            menu.put("탕수육", 12000);

            // 사용자 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("주문할 음식의 이름을 입력하세요: ");
            String foodName = scanner.nextLine();

            System.out.print("수량을 입력하세요: ");
            int quantity = scanner.nextInt();

            // 입력받은 음식의 가격과 수량으로 최종 금액 계산
            int price = menu.get(foodName);
            int totalPrice = price * quantity;

            // 최종 금액 출력
            System.out.println(foodName + " " + quantity + "개의 가격은 " + totalPrice + "원 입니다.");
        }
    }


