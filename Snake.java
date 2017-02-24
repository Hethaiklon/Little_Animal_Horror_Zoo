public class Snake{

    private String name;
    private int sXPosition = 1;
    private int sYPosition = 1;


    public Snake(String name){
        this.name = name;
    }

    public void moveUp(){

        //use method that returns something
        //int rabbitsXPosition = rabbit1.getRabbitsXPosition();
        //int rabbitsYPosition = rabbit1.getRabbitsYPosition();
        //if (this.sXPosition == rabbitsXPosition 
        //&& this.sYPosition == rabbitsYPosition) {
            //System.out.println("Nom! GAME OVER");
        //}
        //if (this.sXPosition == this.rabbitsXPosition && this.sYPosition == this.rabbitsYPosition) {
            //System.out.println("NOM! GAME OVER");
        //}
        

        sYPosition++;
        //int rabbitsXPosition = rabbit1.getRabbitsXPosition();
        //int rabbitsYPosition = rabbit1.getRabbitsYPosition();
        //if (this.sXPosition == rabbitsXPosition 
        //&& this.sYPosition == rabbitsYPosition) {
       //     System.out.println("Nom! GAME OVER");
        //}
         if (this.sYPosition == 11) {
            sYPosition--;
            System.out.println("Ow! I, the " + name + " hit a wall at " + sXPosition + "," + sYPosition);
        }
    }

    public void moveDown(){
        sYPosition--;
         if (this.sYPosition == 0) {
            sYPosition++;
            System.out.println("Ow! I, the " + name + " hit a wall at " + sXPosition + "," + sYPosition);
        }
    }
    
    public void moveRight(){
        sXPosition++;
         if (this.sXPosition == 11) {
            sXPosition--;
            System.out.println("Ow! I, the " + name + " hit a wall at " + sXPosition + "," + sYPosition);
        }
    }
    
    public void moveLeft(){
        sXPosition--;
         if (this.sXPosition == 0) {
            sXPosition++;
            System.out.println("Ow! I, the " + name + " hit a wall at " + sXPosition + "," + sYPosition);
        }
    }
    public void printPosition() {
        System.out.println("Hi I'm the " + name + " and I'm in " + sXPosition + "," + sYPosition);
    }

    //public void getSnakePosition() {
        //sXPosition = sXPosition;
        //sYPosition = sYPosition;
    //}

    public int getSnakeXPosition() {
        return this.sXPosition;
    }

     public int getSnakeYPosition() {
        return this.sYPosition;
    }

}