package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class ListToSet {
        public static void main(String[] args) {
            // 정수를 저장할 List 객체 생성
            List<Integer> integers = new ArrayList<>();

            // 정수 추가 (중복 값을 포함하여)
            integers.add(1);
            integers.add(3);
            integers.add(5);
            integers.add(3);
            integers.add(7);
            integers.add(9);
            integers.add(1);
            integers.add(2);
            integers.add(4);
            integers.add(6);

            // List에서 Set으로 요소 복사
            Set<Integer> integerSet = new HashSet<>(integers);

            // Set의 요소 출력
            System.out.println("Set에 저장된 요소:");
            for (int i : integerSet) {
                System.out.println(i);
            }
        }
    }


