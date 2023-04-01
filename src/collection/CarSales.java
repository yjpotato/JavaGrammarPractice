package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

    public class CarSales {
        public static void main(String[] args) {
            // 현대차의 차종과 판매량을 저장하는 Map 객체 생성
            Map<String, Integer> hyundai = new HashMap<>();
            hyundai.put("아반떼", 5000);
            hyundai.put("소나타", 3000);
            hyundai.put("그랜저", 2000);

            // 기아차의 차종과 판매량을 저장하는 Map 객체 생성
            Map<String, Integer> kia = new HashMap<>();
            kia.put("K5", 4000);
            kia.put("K7", 2500);
            kia.put("K9", 1500);

            // 현대차와 기아차의 Map을 List에 저장
            List<Map<String, Integer>> carSales = new ArrayList<>();
            carSales.add(hyundai);
            carSales.add(kia);

            // 판매량이 가장 높은 차종의 Entry를 찾아서 List에 추가
            List<Entry<String, Integer>> bestSellers = new ArrayList<>();
            for (Map<String, Integer> carMap : carSales) {
                Entry<String, Integer> bestSeller = null;
                for (Entry<String, Integer> entry : carMap.entrySet()) {
                    if (bestSeller == null || entry.getValue() > bestSeller.getValue()) {
                        bestSeller = entry;
                    }
                }
                bestSellers.add(bestSeller);
            }

            // 출력
            System.out.println("회사별 가장 판매량이 높은 차종:");
            for (Entry<String, Integer> entry : bestSellers) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + "대");
            }
        }
    }


