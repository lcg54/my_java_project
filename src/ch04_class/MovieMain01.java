package ch04_class;

import java.util.Scanner;

public class MovieMain01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("제목을 검색하세요 : ");
        String name = scan.next();

        switch (name) {
            case "F1 더 무비","F1","f1":
                Movie01 F1 = new Movie01();
                F1.title = "F1 더 무비";
                F1.director = "조셉 코신스키";
                F1.main_actor = "브래드 피트";
                F1.open_date = 20250625;
                F1.runtime = 155;
                F1.audience = 251;
                F1.rating = 9.03;

                F1.display1();
                System.out.println(F1.show_open_date());
                System.out.println(F1.show_runtime());
                F1.display2();
                System.out.println(F1.showRating());
                break;

            case "전지적 독자 시점","전독시":
                Movie01 Omniscient_Reader = new Movie01();
                Omniscient_Reader.title = "전지적 독자 시점";
                Omniscient_Reader.director = "김병우";
                Omniscient_Reader.main_actor = "안효섭";
                Omniscient_Reader.open_date = 20250723;
                Omniscient_Reader.runtime = 117;
                Omniscient_Reader.audience = 74;
                Omniscient_Reader.rating = 7.85;

                Omniscient_Reader.display1();
                System.out.println(Omniscient_Reader.show_open_date());
                System.out.println(Omniscient_Reader.show_runtime());
                Omniscient_Reader.display2();
                System.out.println(Omniscient_Reader.showRating());
                break;

            default:
                System.out.println("해당 검색어와 일치하는 영화가 없습니다.");
        }
        scan.close();
    }
}
