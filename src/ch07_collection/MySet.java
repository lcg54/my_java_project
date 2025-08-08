package ch07_collection;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<>(); // Object는 타입을 따지지 않음

        set.add("아메리카노");
        set.add(123);
        set.add(false);
        set.add("아메리카노"); // set는 중복 데이터를 허용하지 않음

        set.remove("아메리카노"); // 하나 지우기
        set.clear(); // 싹다 지우기

        System.out.println("요소 크기 : " + set.size());

        set.add("아메리카노");
        set.add("에스프레소");
        set.add("믹스커피");
        set.add("카페라떼");

        String findData = "카푸치노";
        System.out.println(findData + " 존재 여부 : " + set.contains("카푸치노")); // boolean 반환

        if (set.contains(findData)/*==true*/){ // 조건문에서 true인 경우 생략 가능.
            System.out.println(findData + " 있음");
        }else{
            System.out.println(findData + " 없음");
        }

        String addData = "마끼아또";
        if (!set.contains(set.contains(addData))){ // false도 마찬가지로 생략하고 맨앞에 ! 붙임
            set.add(addData);
        }

        findData = "믹스커피";
        if (set.remove(findData)) { // 요소가 존재할 시 삭제하고 true를 반환
            System.out.println("삭제 성공");
        } else {
            System.out.println("존재하지 않음");
        }

        for(Object item:set) { // *** 향상된 for 루프 : for(타입 변수명:배열명 또는 컬렉션명)
            System.out.println(item);
        }
    }
}
