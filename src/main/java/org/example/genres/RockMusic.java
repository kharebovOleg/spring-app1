package org.example.genres;

import org.example.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {

    private String song1 = "Nothing else matter";
    private String song2 = "Riders on the storm";
    private String song3 = "Another One Bites The Dust";

    private List<String> rockSongs;

    public RockMusic() {
        rockSongs = new ArrayList<>();
        rockSongs.add(song1);
        rockSongs.add(song2);
        rockSongs.add(song3);
    }

    @Override
    public List<String> getSong() {
        return rockSongs;
    }
}
