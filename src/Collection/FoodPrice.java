package Collection;

import java.util.HashMap;
import java.util.Map;

public class FoodPrice {
    public static void main(String[] args) {
        Map<String, Integer> foodPriceMap = new HashMap<>();
        foodPriceMap.put("비빔밥", 6000);
        foodPriceMap.put("칼국수", 9000);
        foodPriceMap.put("투뿔등심", 70000);

        Map<String, Integer> foodOrderMap = new HashMap<>();
        foodOrderMap.put("비빔밥", 5);
        foodOrderMap.put("칼국수", 2);
        foodOrderMap.put("투뿔등심", 1);

        int totalPrice = 0;
        for (String food : foodOrderMap.keySet()) {
            int price = foodPriceMap.get(food);
            int quantity = foodOrderMap.get(food);
            totalPrice += price * quantity;
        }

        System.out.println("총 가격은 " + totalPrice + "원 입니다.");
    }
}
