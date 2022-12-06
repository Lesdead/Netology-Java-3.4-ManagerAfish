package domain;

public class Movie {

    private int Id;
    private String moviePicture;
    private String movieName;
    private String movieGenre;
    private boolean premiereTomorrow;

    public Movie() {
    }

    public Movie(int id, String moviePicture, String movieName, String movieGenre, boolean premiereTomorrow) {
        Id = id;
        this.moviePicture = moviePicture;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMoviePicture() {
        return moviePicture;
    }

    public void setMoviePicture(String moviePicture) {
        this.moviePicture = moviePicture;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}
