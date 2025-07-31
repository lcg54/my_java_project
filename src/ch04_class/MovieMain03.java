package ch04_class;

import java.util.Scanner;

public class MovieMain03 {
    public static void main(String[] args) {
        Movie03 f1 = new Movie03();
        f1.setTitle("F1 더 무비");
        f1.setDirector("조셉 코신스키");
        f1.setMain_actor("브래드 피트");
        f1.setOpen_date(20250625);
        f1.setRuntime(155);
        f1.setAudience(251);
        f1.setRating(9.03);

        Movie03 omniscient_reader = new Movie03();
        omniscient_reader.setTitle("전지적 독자 시점");
        omniscient_reader.setDirector("김병우");
        omniscient_reader.setMain_actor("안효섭");
        omniscient_reader.setOpen_date(20250723);
        omniscient_reader.setRuntime(117);
        omniscient_reader.setAudience(74);
        omniscient_reader.setRating(7.85);


        Scanner scan = new Scanner(System.in);
        System.out.print("제목을 검색하세요 : ");
        String search = scan.next();
        switch (search) {
            case "F1 더 무비","F1","f1":
                System.out.println(f1.getTitle());
                System.out.println(f1.getDirector());
                System.out.println(f1.getMain_actor());
                System.out.println(f1.getOpen_date());
                System.out.println(f1.getRuntime());
                System.out.println(f1.getAudience());
                System.out.println(f1.getRating());
                break;

            case "전지적 독자 시점","전독시":
                System.out.println(omniscient_reader.getTitle());
                System.out.println(omniscient_reader.getDirector());
                System.out.println(omniscient_reader.getMain_actor());
                System.out.println(omniscient_reader.getOpen_date());
                System.out.println(omniscient_reader.getRuntime());
                System.out.println(omniscient_reader.getAudience());
                System.out.println(omniscient_reader.getRating());
                break;

            default:
                System.out.println("해당 검색어와 일치하는 영화가 없습니다.");
        }
        scan.close();
    }
}
