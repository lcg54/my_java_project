package ch04_class;

import java.util.Scanner;

public class MovieMain05 {
    public static void main(String[] args) {
        //array - 초기화 기법
        Movie05[] movie_list = {
                new Movie05("F1 더 무비", "조셉 코신스키", "브래드 피트", 20250625, 155, 251, 9.03),
                new Movie05("전지적 독자 시점", "김병우", "안효섭", 20250723, 117, 74, 7.85),
                new Movie05("괴물", "봉준호", "송강호", 20060727, 119, 1091)
        };

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("제목을 검색하세요 : ");
            String search = scan.next();
            switch (search) {
                case "F1 더 무비", "F1", "f1":
                    movie_list[0].display();
                    break;
                case "전지적 독자 시점", "전독시":
                    movie_list[1].display();
                    break;
                case "괴물":
                    movie_list[2].display();
                    break;
                case "종료":
                    return; // 루프 종료 (정확히 말하면 return은 main 메소드 자체를 종료시킴. 따라서 만약 이후에도 코드가 있다면 동작하지 않음 주의
                default:
                    System.out.println("해당 검색어와 일치하는 영화가 없습니다.");
            }
            // scan.close(); 넣으면 스캔이 멈춰버리므로 이 경우엔 빼주기
        }
    }
}
