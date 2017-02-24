public class RunAHZ{

//private int snakeXPosition2 = 0;
//private int snakeYPosition2 = 0;
//public int rabbitXPosition2 = 5;
//public int rabbitYPosition2 = 5;

    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit("White Rabbit");
        Snake snake1 = new Snake("Hungry Snake");
        Gameboard gameboard1 = new Gameboard();

        rabbit1.printPosition();
        snake1.printPosition();
        gameboard1.collision(rabbit1.getRabbitXPosition(),rabbit1.getRabbitYPosition(),snake1.getSnakeXPosition(),snake1.getSnakeYPosition());
        
        //rabbit1.getRabbitPosition();
        

        //rabbit1.moveUp();
        //rabbit1.moveLeft();
        //rabbit1.printPosition();
        //int rXPosition = rabbit1.getRabbitXPosition();
        //int rYPosition = rabbit1.getRabbitYPosition();
        //int sXPosition = snake1.getSnakeXPosition();
        //int sYPosition = snake1.getSnakeYPosition();
        //if (rXPosition == sXPosition 
        //&& rYPosition == sYPosition); {
            //System.out.println("NOM!");
            //System.out.println("NOM!");
            //System.out.println("Game Over");
        //}
        //snake1.moveUp();
        //int rXPosition = rabbit1.getRabbitXPosition();
        //int rYPosition = rabbit1.getRabbitYPosition();
        //int sXPosition = snake1.getSnakeXPosition();
        //int sYPosition = snake1.getSnakeYPosition();
        //if (rXPosition == sXPosition 
        //&& rYPosition == sYPosition); {
      //      System.out.println("NOM!");
      //      System.out.println("NOM!");
      //      System.out.println("Game Over");
        //}

        //rabbit1.printPosition();

        //snake1.moveUp();

        //rabbit1.moveUp();
        //rabbit1.printPosition();
        
        //snake1.moveUp();
        //snake1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();
        
        //rabbit1.moveDown();
        //rabbit1.printPosition();
        
        //rabbit1.moveLeft();
        //rabbit1.printPosition();
        
        //rabbit1.moveLeft();
        //rabbit1.printPosition();
        
        //rabbit1.moveRight();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //rabbit1.moveUp();
        //rabbit1.printPosition();

        //snake1.moveLeft();

       // int rabbitXPosition = rabbit1.getRabbitXPosition();
       // int rabbitYPosition = rabbit1.getRabbitYPosition();
       // int snakeXPosition = snake1.getSnakeXPosition();
       // int snakeYPosition = snake1.getSnakeYPosition();
       // if (rabbitXPosition == snakeXPosition 
       // && rabbitYPosition == snakeYPosition) {
         //   System.out.println("NOM!");
         //   System.out.println("NOM!");
         //   System.out.println("Game Over");
        //}
        
        //Backup planen
        //System.out.prinln("NOM! GAME OVER");
        
    }

}