package Collection;

import java.util.HashMap;
import java.util.Map;

    public class ScoreReport {
        public static void main(String[] args) {
            // 학생 이름과 점수를 저장할 Map 객체 생성
            Map<String, Integer> scores = new HashMap<>();

            // 학생 이름과 점수 추가
            scores.put("김철수", 85);
            scores.put("이영희", 92);
            scores.put("박민수", 88);
            scores.put("정호성", 95);
            scores.put("홍길동", 78);

            // 점수가 90점 이상인 학생 이름 출력
            for (String name : scores.keySet()) {
                int score = scores.get(name);
                if (score >= 90) {
                    System.out.println(name);
                }
            }
        }
    }


