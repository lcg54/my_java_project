package ch06_abstract_interface.movieExam;

public class MovieAddInfo {
    private String genre;
    private double rating;

    public MovieAddInfo(String genre, double rating) {
        this.genre = genre;
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}
