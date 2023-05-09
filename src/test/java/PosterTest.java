import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosterTest {
    Poster poster = new Poster();
    FilmItem film1 = new FilmItem("Властелин колец", "Фентези", 1);
    FilmItem film2 = new FilmItem("Хоббит", "Фентези", 2);
    FilmItem film3 = new FilmItem("Матрица", "Боевик", 3);
    FilmItem film4 = new FilmItem("Кладбище домашних животных", "Хоррор", 4);
    FilmItem film5 = new FilmItem("Горько", "Комедия", 5);
    FilmItem film6 = new FilmItem("Форсаж", "Боевик", 6);
    FilmItem film7 = new FilmItem("Тоня против всех", "Байопик", 7);

    @BeforeEach
    public void setup() {
        poster.addFilm(film1);
        poster.addFilm(film2);
        poster.addFilm(film3);
    }

    @Test
    public void addFilmTest() {
        poster.addFilm(film4);

        FilmItem[] expected = {film1, film2, film3, film4};
        FilmItem[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showAllMovies() {

        FilmItem[] expected = {film1, film2, film3};
        FilmItem[] actual = poster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast3movies() {

        Poster poster = new Poster(3);

        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);
        poster.addFilm(film7);

        FilmItem[] expected = {film7, film6, film5};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLast7moviesIfAllMovies4() {

        Poster poster = new Poster(7);


        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);
        poster.addFilm(film7);

        FilmItem[] expected = {film7, film6, film5, film4};
        FilmItem[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lengthAllMoviesTest() {

        poster.addFilm(film4);
        poster.addFilm(film5);
        poster.addFilm(film6);
        poster.addFilm(film7);

        int expected = 7;
        int actual = poster.lengthAllMovies();

        Assertions.assertEquals(expected, actual);
    }
}
