package se.floremila.träningspel;

public class Player {
    private String nickname; //Attribut


    public Player(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
