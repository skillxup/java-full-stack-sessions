public class EnumExampleWithIfElse {
    enum Directions {
        EAST, 
        WEST, 
        NORTH, 
        SOUTH
    }
    public static void main(String[] args) {
        Directions dir = Directions.NORTH;
        
        if(dir == Directions.EAST) {
            System.out.println("Directions: EAST");
        } else if(dir == Directions.WEST) {
            System.out.println("Directions: WEST");
        } else if(dir == Directions.NORTH) {
            System.out.println("Directions: NORTH");
        } else {
            System.out.println("Directions: SOUTH");
        }
    }
}