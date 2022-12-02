package ru.netology.domain;

public class PosterManager {
    private String[] films = new String[0];
    private int limit;

    public PosterManager(){
        this.limit = 10;
    }
    public PosterManager(int limit){
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] temp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            temp[i] = films[i];
        }
        temp[temp.length - 1] = film;
        films = temp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit){
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] temp = new String[resultLength];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = films[films.length - 1 - i];
        }
        return temp;
    }

}
