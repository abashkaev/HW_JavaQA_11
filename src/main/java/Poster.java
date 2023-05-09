public class Poster {
    private FilmItem[] poster = new FilmItem[0];
    private int sizePoster = 5;

    public Poster(int sizePoster) {
        this.sizePoster = sizePoster;
    }

    public Poster() {
    }

    public void addFilm(FilmItem film) {
        FilmItem[] tmp = new FilmItem[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }
        tmp[tmp.length - 1] = film;
        poster = tmp;
    }

    public FilmItem[] findAll() {
        return poster;
    }

    public int getSizePoster() {
        return sizePoster;
    }

    public void setSizePoster(int sizePoster) {
        this.sizePoster = sizePoster;
    }

    public int lengthAllMovies() {
        return findAll().length;
    }

    public FilmItem[] findLast() {
        FilmItem[] all = findAll();
        FilmItem[] reversed;

        if (lengthAllMovies() <= getSizePoster()) {
            reversed = new FilmItem[lengthAllMovies()];
        } else {
            reversed = new FilmItem[getSizePoster()];
        }
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}
