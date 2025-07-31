package ch04_class;

public class Movie03 {
    //영화 : 제목, 감독, 주연, 개봉일, 상영시간, 누적관객수, 평가
    String title, director, main_actor;
    int open_date, runtime, audience;
    double rating;

    public String getTitle() {return "제목 : " + title;}
    public void setTitle(String title) {this.title = title;}

    public String getDirector() {return "감독 : " + director;}
    public void setDirector(String director) {this.director = director;}

    public String getMain_actor() {return "주연 : " + main_actor;}
    public void setMain_actor(String main_actor) {this.main_actor = main_actor;}

    public String getOpen_date() {
        int year = open_date / 10000;
        int month = (open_date - year * 10000) / 100;
        int date = open_date - year * 10000 - month * 100;
        return "개봉일 : " + year + "년 " + month + "월 " + date + "일";
    }
    public void setOpen_date(int open_date) {this.open_date = open_date;}

    public String getRuntime() {
        int hr = runtime / 60;
        int min = runtime % 60;
        return "상영시간 : " + hr + "시간 " + min + "분";
    }
    public void setRuntime(int runtime) {this.runtime = runtime;}

    public String getAudience() {return "누적 관객수 : " + audience + "만 명";}
    public void setAudience(int audience) {this.audience = audience;}

    public String getRating() {
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
    public void setRating(double rating) {this.rating = rating;}
}
