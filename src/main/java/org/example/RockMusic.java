package org.example;

public class RockMusic implements Music {

    private RockMusic() {
    }

    public static RockMusic getRockMusic(){
        return new RockMusic();
    }

    public void doMyInit() {
        System.out.println("initialization");
    }

    public void doMyDestroy() {
        System.out.println("destructing");
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
