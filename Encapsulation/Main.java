public class Main {
    public static void main(String[] args) {
        //Example - No Encapsulation
        Player player = new Player();

        player.name = "Cloud";
        player.health = 100;
        player.weapon = "Buster Sword";

        int damage = 10;
        player.loseHealth(damage);

        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(90);

        player.health = 1000; //Access to fields we might not want people to have access too

        System.out.println("Remaining health = " + player.healthRemaining());

        //Encapsulation
        EnhancedPlayer enhancePlayer = new EnhancedPlayer("Barret", 100, "Machine Gun Arm");

        
    }
}