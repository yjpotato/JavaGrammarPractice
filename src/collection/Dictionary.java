package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class Dictionary {
        public static void main(String[] args) {
            // 영어 단어와 뜻을 저장할 Map 객체 생성
            Map<String, String> dictionary = new HashMap<>();

            // 영어 단어와 뜻 추가
            dictionary.put("apple", "사과"); //put -> 추가
            dictionary.put("banana", "바나나");
            dictionary.put("cherry", "체리");
            dictionary.put("orange", "오렌지");

            // 사용자 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("단어를 입력하세요: ");
            String word = scanner.nextLine();

            // 입력받은 단어의 뜻 출력
            String meaning = dictionary.get(word);
            if (meaning == null) {
                System.out.println("해당 단어를 찾을 수 없습니다.");
            } else {
                System.out.println(word + "의 뜻은 " + meaning + "입니다.");
            }
        }
    }


