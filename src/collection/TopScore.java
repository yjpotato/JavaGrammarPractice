package collection;

import java.util.HashMap;
import java.util.Map;

    public class TopScore {
        public static void main(String[] args) {
            // 학생 이름과 점수를 저장할 Map 객체 생성
            Map<String, Integer> scores = new HashMap<>();

            // 학생 이름과 점수 추가
            scores.put("김철수", 85);
            scores.put("이영희", 92);
            scores.put("박민수", 88);
            scores.put("정호성", 95);
            scores.put("홍길동", 78);

            // 점수가 가장 높은 학생 이름과 점수 출력
            int maxScore = 0;
            String topStudent = "";
            for (String name : scores.keySet()) {
                int score = scores.get(name);
                if (score > maxScore) {
                    maxScore = score;
                    topStudent = name;
                }
            }
            System.out.println("가장 높은 점수를 받은 학생은 " + topStudent + "이며, 점수는 " + maxScore + "입니다.");
        }
    }


