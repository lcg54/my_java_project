package ch06_abstract_interface.movieExam;

public class Movie extends MovieAddInfo implements MovieDetail{
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year, String genre, double rating) {
        super(genre, rating);
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public void movieBasic() {
        System.out.println("영화 제목 : " + title);
        System.out.println("감독 : " + director);
        System.out.println("개봉 연도 : " + year);
    }

    @Override
    public void movieDetail() {
        System.out.println("장르 : " + getGenre());
        System.out.println("평점 : " + getRating());
    }
}
