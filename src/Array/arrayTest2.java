package Array;
//1. 길이가 12인 char 배열을 선언하고 {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'}로 초기화합니다.
//   단어를 bit, com, sql, int로 만들어서 모두 출력하세요.(힌트 bit => [0], [4], [8]에 있습니다.)
public class arrayTest2 {
    public static void main(String[] args) {
        char charArr[] = {'b', 'c', 's', 'i', 'i', 'o', 'q', 'n', 't', 'm', 'l', 't'};
        String bit = "" + charArr[0] + charArr[4] + charArr[8];
        String com = "" + charArr[1] + charArr[2] + charArr[5];
        String sql = "" + charArr[2] + charArr[3] + charArr[8];
        String integer = "" + charArr[3] + charArr[4] + charArr[9] + charArr[10] + charArr[11];

        System.out.println("bit: " + bit);
        System.out.println("com: " + com);
        System.out.println("sql: " + sql);
        System.out.println("integer: " + integer);

    }
}
