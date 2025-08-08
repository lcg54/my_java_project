package ch07_collection;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> teamMap = new HashMap<>(); // 기본형 int -> 참조형 Integer. 제네릭 클래스는 참조형만 사용 가능

        teamMap.put("lg",1);
        teamMap.put("ssg",2);
        teamMap.put("두산",3);
        teamMap.put("kt",4);

        System.out.println("요소 크기 : " + teamMap.size());

        String findItem = "nc";
        boolean bool = teamMap.containsKey(findItem);
        System.out.println(findItem + "팀이 목록에 있나요?" + bool);
        if (!teamMap.containsKey(findItem)) { // key가 없다면 추가
            teamMap.put(findItem, 5);
        }

        final int pos = 6;
        if (!teamMap.containsValue(pos)){ // value가 없다면 추가
            System.out.println("존재하지 않습니다. 추가합니다.");
            teamMap.put("kia",pos);
        }else {
            System.out.println("존재합니다.");
        }

        String[] teams = {"롯데", "한화", "키움", "삼성"};
        for (int i = 0; i < teams.length; i++) {
            teamMap.put(teams[i], i+7); // 7,8,9,10위 추가
        }

        System.out.println(teamMap); // 해당 객체의 toSting을 암시적으로 호출

        findItem = "한화";
        Integer rank = teamMap.get(findItem); // get(key) - value를 반환
        if (rank == null){
            System.out.println(findItem + "팀은 존재하지 않습니다.");
        }else{
        System.out.println("팀명 : " + findItem);
        System.out.println("순위 : " + rank);
        }
        System.out.println();

        String[] findItems = {"두산", "kt", "빙그레"};
        for (String one:findItems){ // 컬렉션 말고 배열에서도 사용 가능한 구문
            rank = teamMap.get(one);
            if (rank != null){
                System.out.print("팀명 : " + one);
                System.out.println("\t순위 : " + rank);
            }else{
                System.out.println(one + "팀은 존재하지 않아서 추가합니다.");
                teamMap.put(one,11);
            }
        }

        System.out.println(teamMap.keySet()); // key만 set로 반환

        for (String key:teamMap.keySet()){
            System.out.println(key + " 팀의 순위는 " + teamMap.get(key) + "위입니다.");
        }

        teamMap.clear();
        if (teamMap.isEmpty()){ // is~~ 는 대부분 boolean 값이 나옴
            System.out.println("teamMap is empty.");
        }else {
            System.out.println("teamMap is not empty.");
        }
    }
}
