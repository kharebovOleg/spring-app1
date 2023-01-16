package org.example.genres;

import org.example.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {

    private String song1 = "Nocturnes, Op. 9 (Chopin)";
    private String song2 = "Carmina Burana (Orff)";
    private String song3 = "The Magic Flute";

    private List<String> classicalSongs;

    public ClassicalMusic() {
        classicalSongs = new ArrayList<>();
        classicalSongs.add(song1);
        classicalSongs.add(song2);
        classicalSongs.add(song3);
    }

    @Override
    public List <String> getSong() {
        return classicalSongs;
    }
}
