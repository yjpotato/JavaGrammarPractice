package Thread;

public class chap01_thread {
    public static void main(String[] args) {
        //#1. 비디오프레임 1~5
        int[] intArr = {1, 2, 3, 4, 5};
        //#2. 자막 번호 하나~다섯
        String[] strArr = {"하나", "둘", "셋", "넷", "다섯"};

        //#3. 비디오 프레임 출력
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("(비디오프레임)" + intArr[i]);
            try {Thread.sleep(200); //sleep 메소드가 InterruptedException 예외를 던질 수 있기 때문에 "try-catch" 블록으로 감싸야 함.
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }//#4. 자막 번호 출력
        for (int i = 0; i < strArr.length; i++) {
            System.out.println("(자막번호)" + strArr[i]);
            try {Thread.sleep(200);
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
    }
}
