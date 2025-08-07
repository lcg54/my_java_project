package ch06_abstract_interface.movieExam;

public class MovieMain {
    public static void main(String[] args) {
        Movie[] movie = {
                new Movie("인디아나 존스", "제임스 맨골드", 2023, "어드벤처, 액션, 판타지", 10.0),
                new Movie("인셉션", "크리스토퍼 놀란", 2010, "액션, SF", 8.8),
                new Movie("범죄도시3", "이상용", 2023, "액션", 7.67)
        };
        for (int i = 0; i < movie.length; i++) {
            movie[i].movieBasic();
            movie[i].movieDetail();
            System.out.println();
        }

    }
}
