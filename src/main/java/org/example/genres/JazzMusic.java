package org.example.genres;

import org.example.Music;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music {

    private String song1 = "an island";
    private String song2 = "hey la la lei";
    private List<String> songs;

    public JazzMusic() {
        songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
