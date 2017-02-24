public class Gameboard {
    public Gameboard() {

        }
     public void collision(int rabbitXPosition, int rabbitYPosition, int snakeXPosition, int snakeYPosition) {
         if (rabbitXPosition == snakeXPosition && rabbitYPosition == snakeYPosition) {
             System.out.println("'Please don't kill me! Mercy!'");
             System.out.println("  Nom!");
             System.out.println("Game over");
    }
    }
}