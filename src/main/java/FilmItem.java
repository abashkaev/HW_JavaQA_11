public class FilmItem {
    private String filmName;
    private String genreFilm;
    private int filmId;

    public FilmItem (String filmName, String genreFilm, int filmId) {
            this.filmName =filmName;
            this.genreFilm = genreFilm;
            this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }
}
