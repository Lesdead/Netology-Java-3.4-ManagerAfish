package manager;

import domain.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Manager manager = new Manager();

    Movie one = new Movie(1, "URLFilm1", "film1", "action", false);
    Movie two = new Movie(2, "URLFilm2", "film2", "drama", true);
    Movie three = new Movie(3, "URLFilm3", "film3", "drama", true);
    Movie four = new Movie(4, "URLFilm4", "film4", "action", true);
    Movie five = new Movie(5, "URLFilm5", "film5", "action", true);
    Movie six = new Movie(6, "URLFilm6", "film6", "action", false);
    Movie seven = new Movie(7, "URLFilm7", "film7", "drama", false);
    Movie eight = new Movie(8, "URLFilm8", "film8", "comedy", false);
    Movie nine = new Movie(9, "URLFilm9", "film9", "comedy", false);
    Movie ten = new Movie(10, "URLFilm10", "film10", "comedy", false);
    Movie eleven = new Movie(11, "URLFilm11", "film11", "drama", false);
    Movie twelve = new Movie(12, "URLFilm12", "film12", "comedy", false);
    Movie thirteen = new Movie(13, "URLFilm13", "film13", "document", true);

    @Test
    void addNewFilm() {
        manager.add(thirteen);

        Movie[] actual = manager.getAll();
        Movie[] expected = {thirteen};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastTenFilms() {

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);
        manager.add(twelve);
        manager.add(thirteen);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{thirteen, twelve, eleven, ten, nine, eight, seven, six, five, four};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmsIfLessTen() {
        Manager manager = new Manager(8);

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{ten, nine, eight, seven, six, five, four, three};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastOneFilm() {
        Manager manager = new Manager(1);

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{ten};

        assertArrayEquals(expected, actual);
    }

}