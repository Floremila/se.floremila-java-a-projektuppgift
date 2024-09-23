package se.floremila.träningspel;

import java.util.Random;

public class Tärning {
    private int result;
    private Random rand;

    public Tärning() {
        this.rand = new Random();
        this.result = 0;
    }

    public int rollTärning() {
        this.result = rand.nextInt(6) + 1;
        return this.result;
    }

    public int getResult() {
        return this.result;
    }

}
