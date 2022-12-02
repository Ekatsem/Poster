package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

    @Test
    public void shouldAddAndShowFilms(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddAndShowFilmsMin(){
        PosterManager manager = new PosterManager();

        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddAndShowFilmsOne(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");


        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndMax(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");

        String[] actual = manager.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8","Film 7", "Film 6", "Film 5","Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndUpperBorder(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");
        manager.addFilm("Film 10");
        manager.addFilm("Film 11");


        String[] actual = manager.findLast();
        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8","Film 7", "Film 6", "Film 5","Film 4", "Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndBelowBorder(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");
        manager.addFilm("Film 9");

        String[] actual = manager.findLast();
        String[] expected = {"Film 9", "Film 8","Film 7", "Film 6", "Film 5","Film 4", "Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotShowLimitFilmsFromEndMin(){
        PosterManager manager = new PosterManager();

        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    } @Test
    public void shouldShowLimitFilmsFromEndOne(){
        PosterManager manager = new PosterManager();

        manager.addFilm("Film 1");

        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotShowLimitFilmsFromEndParameterMin(){
        PosterManager manager = new PosterManager(0);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndParameterOne(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");


        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndParameter(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");


        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndParameterMax(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");


        String[] actual = manager.findLast();
        String[] expected = {"Film 5", "Film 4", "Film 3","Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowLimitFilmsFromEndParameterMoreLimit(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");
        manager.addFilm("Film 7");
        manager.addFilm("Film 8");



        String[] actual = manager.findLast();
        String[] expected = {"Film 8", "Film 7", "Film 6","Film 5", "Film 4"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotShowLimitFilmsFromEndParameterUpperBorder(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");
        manager.addFilm("Film 5");
        manager.addFilm("Film 6");

        String[] actual = manager.findLast();
        String[] expected = {"Film 6", "Film 5", "Film 4","Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldNotShowLimitFilmsFromEndParameterBelowBorder(){
        PosterManager manager = new PosterManager(5);

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");
        manager.addFilm("Film 4");

        String[] actual = manager.findLast();
        String[] expected = {"Film 4","Film 3", "Film 2", "Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }



}