package ch04_class;

public class Movie01 {
    //영화 : 제목, 감독, 주연, 개봉일, 상영시간, 누적관객수, 평가
    String title, director, main_actor;
    int open_date, runtime, audience;
    double rating;

    void display1() {
        System.out.println("제목 : " + title);
        System.out.println("감독 : " + director);
        System.out.println("주연 : " + main_actor);
    }

    String show_open_date() {
        int year = open_date / 10000;
        int month = (open_date - year * 10000) / 100;
        int date = open_date - year * 10000 - month * 100;
        return "개봉일 : " + year + "년 " + month + "월 " + date + "일";
    }

    String show_runtime() {
        int hr = runtime / 60;
        int min = runtime % 60;
        return "상영시간 : " + hr + "시간 " + min + "분";
    }

    void display2() {
        System.out.println("누적 관객수 : " + audience + "만 명");
    }

    String showRating() {
        String message;
        if (rating >= 9) {
            message = "강력 추천합니다.";
        } else if (rating >= 8) {
            message = "추천합니다.";
        } else if (rating >= 7) {
            message = "무난해요.";
        } else {
            message = "별로 추천하지 않아요.";
        }
        return "평가 : " + message;
    }
}
