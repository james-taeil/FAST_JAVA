package ch16.gamelevel;

public class PlayerTest {
    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        AdvancedLevel adlevel = new AdvancedLevel();
        player.upgradeLevel(adlevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);


    }
}
