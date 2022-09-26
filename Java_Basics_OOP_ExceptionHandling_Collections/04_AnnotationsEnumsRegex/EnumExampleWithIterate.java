public class EnumExampleWithIterate {
    enum Directions {
        EAST, 
        WEST, 
        NORTH, 
        SOUTH
    }

    Directions dir;
    public EnumExampleWithIterate(Directions dir) {
        this.dir = dir;
    }

    public static void main(String[] args) {
        for(Directions dir : Directions.values()) {
            System.out.println(dir);
        }
    }
}
