package ch07_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoTest {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>() ;
        Random rand = new Random() ;
        int secondno = 0 ; // 이등 번호를 저장할 변수

        while(lotto.size() < 7){ // while 반복문으로 번호(su) 반복해서 뽑기. size가 6이 될 때까지.
            int su = rand.nextInt(45) + 1 ;
            if(lotto.size() == 6){
                // 1등 번호는 이미 모두 추출된 상태임
                System.out.print("금주의 1등 번호는 ");
                for (Integer firstno:lotto){ // for 루프로 내용물 전부 출력 : for(타입 변수명:컬랙션명)
                    System.out.print(firstno + " ");
                }
                System.out.println("입니다.");
            }
            lotto.add(su); // 6개에 if문 돌린 후에 while문 조건이 7개 미만이므로 한개 더 뽑음
            secondno = su; // 뽑은 수를 2등 번호에 저장
        }
        System.out.println("2등 번호는 " + secondno + "번입니다.");
    }
}
