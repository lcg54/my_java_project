package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        int x = 3, y = 5;

        // 정수 데이터 3개를 취급하기 위한 배열 arr 선언
        int[] arr = new int[3]; // 타입[] 배열이름 = new 타입[크기]

        arr[0] = x - y + 6;  // 4
        arr[2] = arr[0] + 3; // 7
        arr[1] = arr[0] + arr[2]; // 11

        System.out.println("요소들 출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("배열 초기화 기법");
        int[] arr2 = {50, 20, 30};

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}
