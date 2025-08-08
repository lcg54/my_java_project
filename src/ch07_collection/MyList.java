package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> coffeeList = new ArrayList<>(); // 제네릭<>으로 문자열만 받겠다 선언

        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마끼야또");
        coffeeList.add("카페라떼"); // 중복 허용, 순서 따짐

        System.out.println("요소 크기 : " + coffeeList.size());

        int index = -1; // 원래 indexOf에 할당값 없으면 -1 할당되므로 명시할 필욘 없음
        String findData = "카페라떼";
        index = coffeeList.indexOf(findData); // indexOf = 해당 요소의 순서
        System.out.println(findData + "의 인덱스 : " + index);

        index = coffeeList.lastIndexOf(findData); // lastIndexOf = 해당 요소의 마지막 순서 (중복이 있다면)
        System.out.println(findData + "의 인덱스 : " + index);

        findData = "카푸치노";
        index = coffeeList.indexOf(findData); // 해당 요소가 없음 -> indexOf에 할당되는 값이 없음 -> -1 할당
        System.out.println(findData + "의 인덱스 : " + index);

        if (!coffeeList.contains(findData)){
            coffeeList.add(findData);
        }
    /*  또는 이렇게 할 수 있음
        if (coffeeList.indexOf(findData)==-1){
            coffeeList.add(findData);
        }
    */
        coffeeList.add(2, findData); // add(순서,요소) - 원하는 위치에 삽입

        for (String coffee:coffeeList){
            System.out.print(coffee + "\t");
        } System.out.println();


        findData = "콜드브루";
        coffeeList.set(5, findData); // set(순서, 요소) - 원하는 위치에 덮어쓰기

        findData = "카푸치노";
        coffeeList.remove(findData); // 삭제 (선입된 요소부터)

        for (String coffee:coffeeList){
            System.out.print(coffee + "\t");
        } System.out.println();

        String item = coffeeList.get(3); // get(순서) - 해당 순서의 요소 호출
        System.out.println(item);

        for (int i = 0; i < coffeeList.size(); i++) { // 기존 for 루프
            String data = coffeeList.get(i);
            System.out.println(data);
        }
    }
}
