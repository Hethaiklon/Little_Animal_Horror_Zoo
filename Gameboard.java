public class Gameboard {
    public Gameboard() {

        }
     public void collision(int rabbitxPosition, int rabbityPosition, int snakexPosition, int snakeyPosition) {
         if (rabbitxPosition == snakexPosition && rabbityPosition == snakeyPosition) {
             System.out.print("Game over");
    }
    }
}