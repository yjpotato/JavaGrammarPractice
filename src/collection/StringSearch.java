package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class StringSearch {
        public static void main(String[] args) {
            // 문자열을 저장할 List 객체 생성
            List<String> strings = new ArrayList<>();

            // 문자열 추가
            strings.add("Java");
            strings.add("Python");
            strings.add("C++");
            strings.add("Ruby");
            strings.add("JavaScript");

            // 검색할 문자열 입력 받기
            Scanner scanner = new Scanner(System.in);
            System.out.print("검색할 문자열을 입력하세요: ");
            String search = scanner.nextLine();

            // 문자열 검색하여 인덱스 출력
            int index = strings.indexOf(search);
            if (index == -1) {
                System.out.println("해당 문자열을 찾을 수 없습니다.");
            } else {
                System.out.println("검색한 문자열 " + search + "의 인덱스는 " + index + "입니다.");
            }
        }
    }


