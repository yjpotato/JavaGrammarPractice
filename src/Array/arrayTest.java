package Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayTest {
    public static void main(String[] args) {
        //1부터 10까지의 정수를 배열에 저장하고 배열의 모든 요소를 출력하세요.
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("-----------------------------");
        //사용자가 q를 입력하기 전까지 정수를 입력받아 배열에 저장하고 배열의 모든 요소를 출력하세요.
        Scanner sc = new Scanner(System.in);

        int[] arr2 = new int[100]; // 최대 100개의 정수를 저장할 수 있는 배열 생성
        int size = 0; // 현재까지 입력된 정수의 개수
        while(true) {
            System.out.print("정수를 입력하세요 (종료하려면 q): ");
            String input = sc.next();

            if(input.equals("q")) { // q를 입력하면 반복 종료
                break;
            }

            int num = Integer.parseInt(input); // 입력한 문자열을 정수형으로 변환
            arr2[size] = num; // 입력한 정수를 배열에 저장
            size++; // 배열의 크기를 1 증가시킴
        }

        System.out.println("입력한 정수: ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr1[i] + " "); //+ " "
        }

        sc.close(); // Scanner 객체 닫기
        System.out.println("-----------------------------");
        //사용자가 입력한 10개의 정수를 배열에 저장하고 평균을 계산하여 출력하세요.
        int[] nums = new int[10]; //배열 크기 지정
        int sum = 0;
        for (int i = 0; i < 10; i++) {   // 정수를 입력받아 배열에 저장
            nums[i] = sc.nextInt();
            sum += nums[i];
        }
        System.out.println();
        double average = (double) sum / nums.length; // 배열의 크기로 나누어 평균 계산

        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
        System.out.println("-----------------------------");
//        사용자가 입력한 10개의 정수를 배열에 저장하고 최소값과 최대값을 찾아서 출력하세요.
        int[] nums2 = new int[10];
        for (int i = 0; i < 10; i++) {   // 정수를 입력받아 배열에 저장
            nums2[i] = sc.nextInt();
        }
        int min = nums2[0]; // 첫 번째 요소로 초기화
        int max = nums2[0]; // 첫 번째 요소로 초기화

        for (int i = 1; i < nums2.length; i++) { // 배열의 나머지 요소와 비교
            if (nums2[i] < min) {
                min = nums2[i];
            }
            if (nums2[i] > max) {
                max = nums2[i];
            }
        }

        System.out.println("최소값: " + min);
        System.out.println("최대값: " + max);
        System.out.println("-----------------------------");
        //사용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과 길이가 가장 작은 문자열을 출력하세요.
        String[] strs = new String[5];
        for (int i = 1; i<5; i++){
            strs[i] = sc.nextLine();
        }
        String longest = strs[0]; //긴 문자열
        String shortest = strs[0]; //짧은 문자열


        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > longest.length()) {
                longest = strs[i];
            }
            if (strs[i].length() < shortest.length()) {
                shortest = strs[i];
            }
        }

        System.out.println("가장 긴 문자열: " + longest);
        System.out.println("가장 짧은 문자열: " + shortest);
        System.out.println("-----------------------------");
        // 두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로 첫 번째 배열은 4개
        // 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
        //Math.random() 사용하면 랜덤으로 배열에 값을 넣어줄 수 있음.
        int[] ranArr1 = new int[4];  //배열 크기 지정
        int[] ranArr2 = new int[3];


        for (int i = 0; i < 4; i++) {
            ranArr1[i] = (int)(Math.random() * 100) + 1; // 1~100 사이의 랜덤한 정수 생성
            //Math.random() * 100 -> 결과값은 0 이상 10 미만의 수가 됨. 최소값인 1을 더해주면 1이 배열 arr의 각 원소에 대입된다.
        }
        for (int i = 0; i < 3; i++) {
            ranArr2[i] = (int)(Math.random() * 100) + 1; // 1~100 사이의 랜덤한 정수 생성
            //Math.random() * 100 -> 결과값은 0 이상 10 미만의 수가 됨. 최소값인 1을 더해주면 1이 배열 arr의 각 원소에 대입된다.
        }
        // 두 배열을 합쳐서 새로운 배열을 생성
        int[] ranArr3 = new int[arr1.length + arr2.length];
        System.arraycopy(ranArr1, 0, ranArr3, 0, ranArr1.length); //arraycopy : 배열의 요소를 복사하는 기능
        System.arraycopy(ranArr2, 0, ranArr3, ranArr1.length, ranArr2.length);//arr1 배열 다음 위치부터 복사
        //(선택배열, 복사할 인덱스위치, 새로운배열, 새로운 배열에 원본을 복사할 위치, 복사할 요소의 개수)

        System.out.println("arr1: " + Arrays.toString(ranArr1));// Arrays.toString() 배열을 문자열로 변환
        System.out.println("arr2: " + Arrays.toString(ranArr2));
        System.out.println("arr3: " + Arrays.toString(ranArr3));

        //랜덤으로 배열을 만드는 다른 방법.
        //int[] arr = new int[10];
        //Random random = new Random();
        //for (int i = 0; i < 10; i++) {
        //    arr[i] = random.nextInt(10) + 1; // 1~10 사이의 랜덤한 정수 생성
        //}
        System.out.println("-----------------------------");
        //사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다. -기준으로 잘라진 문자열 배열을 생성하고 잘라진 문자열 중에
        //    가장 길이가 긴 문자열의 인덱스와 그 문자열을 출력하세요.

        String inputString = sc.nextLine(); // 문자열 입력

       // "-" 구분자를 제거한 문자열을 분리하여 배열로 저장
        String[] stringArray = inputString.split("-"); //split("-") 메서드는 "-" 문자열을 기준으로 입력된 문자열을 분리한다

        // 가장 긴 문자열의 길이와 인덱스를 저장할 변수 초기화
        int maxLength = 0;
        int maxIndex = 0;

        // 분리된 문자열을 순회하면서 가장 긴 문자열의 길이와 인덱스를 찾음
        for (int i = 0; i < stringArray.length; i++) {
            String str = stringArray[i];
            if (str.length() > maxLength) {
                maxLength = str.length();
                maxIndex = i;
            }
        }
        // 가장 긴 문자열과 인덱스 출력
        System.out.println("가장 긴 문자열: " + stringArray[maxIndex]);
        System.out.println("가장 긴 문자열의 인덱스: " + maxIndex);



        }

    }





