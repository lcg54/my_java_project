package ch04_class;

public class Movie05 {
    // 영화 : 제목, 감독, 주연, 개봉일, 상영시간, 누적관객수, 평가
    private String title, director, main_actor;
    private int open_date, runtime, audience;
    private double rating = 0.0;

    // 생성자 (반환타입 없음)
    public Movie05(String title, String director, String main_actor, int open_date, int runtime, int audience, double rating) {
        this.title = title;
        this.director = director;
        this.main_actor = main_actor;
        this.open_date = open_date;
        this.runtime = runtime;
        this.audience = audience;
        this.rating = rating;
    }
    // 생성자 오버로딩 (인자 갯수가 다른 경우 (rating 없음))
    public Movie05(String title, String director, String main_actor, int open_date, int runtime, int audience) {
        this.title = title;
        this.director = director;
        this.main_actor = main_actor;
        this.open_date = open_date;
        this.runtime = runtime;
        this.audience = audience;
    }
    // getter (setter는 생성자로 대체)
    public String getTitle() {return "제목 : " + title;}
    public String getDirector() {return "감독 : " + director;}
    public String getMain_actor() {return "주연 : " + main_actor;}
    public String getOpen_date() {
        int year = open_date / 10000;
        int month = (open_date - year * 10000) / 100;
        int date = open_date - year * 10000 - month * 100;
        return "개봉일 : " + year + "년 " + month + "월 " + date + "일";
    }
    public String getRuntime() {
        int hr = runtime / 60;
        int min = runtime % 60;
        return "상영시간 : " + hr + "시간 " + min + "분";
    }
    public String getAudience() {return "누적 관객수 : " + audience + "만 명";}
    public String getRating() {
        String recommendation;
        if (rating >= 9) {recommendation = "강력 추천합니다.";}
        else if (rating >= 8) {recommendation = "추천합니다.";}
        else if (rating >= 7) {recommendation = "무난해요.";}
        else if (rating == 0) {recommendation = "평점이 존재하지 않습니다.";}
        else {recommendation = "별로 추천하지 않아요.";}
        return "평가 : " + recommendation;
    }
    // 출력
    public void display() {
        System.out.println(getTitle());
        System.out.println(getDirector());
        System.out.println(getMain_actor());
        System.out.println(getOpen_date());
        System.out.println(getRuntime());
        System.out.println(getAudience());
        System.out.println(getRating());
    }
}
