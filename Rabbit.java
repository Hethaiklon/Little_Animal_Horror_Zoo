public class Rabbit{

    private String name;
    private int rXPosition = 5;
    private int rYPosition = 5;

    public Rabbit(String name){
        this.name = name;
    }

    public void moveUp(){
        rYPosition++;
        if (this.rYPosition == 11) {
            rYPosition--;
            System.out.println("Ow! I, the " + name + " hit a wall at " + rXPosition + "," + rYPosition);
        }
         else {
        System.out.println("The " + name + " is in " + rXPosition + "," + rYPosition);
        }
    }

    public void moveDown(){
        rYPosition--;
        if (this.rYPosition == 0) {
            rYPosition++;
            System.out.println("Ow! I, the " + name + " hit a wall at " + rXPosition + "," + rYPosition);
        }
        else {
        System.out.println("The " + name + " is in " + rXPosition + "," + rYPosition);
        }
    }
    
    public void moveRight(){
        rXPosition++;
         if (this.rXPosition == 11) {
            rXPosition--;
            System.out.println("Ow! I, the " + name + " hit a wall at " + rXPosition + "," + rYPosition);
        }
        else {
        System.out.println("The " + name + " is in " + rXPosition + "," + rYPosition);
        }
    }
    
    public void moveLeft(){
        rXPosition--;
         if (this.rXPosition == 0) {
            rXPosition++;
            System.out.println("Ow! I, the " + name + " hit a wall at " + rXPosition + "," + rYPosition);
        }
        else {
        System.out.println("The " + name + " is in " + rXPosition + "," + rYPosition);
        }
    }
    public void printPosition() {
        System.out.println("Hi I'm a " + name + " and I'm in " + rXPosition + "," + rYPosition);
    }
    //public void getRabbitPosition() {
      //  this.rXPosition = rXPosition;
      //  this.rYPosition = rYPosition;

    //}

    public int getRabbitXPosition() {
        return this.rXPosition;
    }

     public int getRabbitYPosition() {
        return this.rYPosition;
    }

}