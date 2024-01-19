public class Cube {
    private int side;

    public Cube() {
        side = 1;
    }
    public Cube(int side){
        if(side < 1){
            throw new IllegalArgumentException("A Cube's side length cannot be less than 1!");
        }
        this.side = side;
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if(side < 1){
            throw new IllegalArgumentException("A Cube's side length cannot be less than 1!");
        }
        this.side = side;
    }
    public int getSurfaceArea(){
        return 6 * side * side;
    }
    public int getVolume(){
        return side * side * side;
    }



}
