public class EnumExampleWithSwitchCase {
    enum Directions {
        EAST, 
        WEST, 
        NORTH, 
        SOUTH
    }

    Directions dir;
    public EnumExampleWithSwitchCase(Directions dir) {
        this.dir = dir;
    }

    public void getMyDirections() {
        switch(dir) {
            case EAST: 
                System.out.println("In EAST Direction");
                break;

            case WEST:
                System.out.println("In WEST Direction");
                break;

            case NORTH: 
                System.out.println("In NORTH Direction");
                break;

            default: 
                System.out.println("In SOUTH Direction");
                break;
        }
    }

    public static void main(String[] args) {
        EnumExampleWithSwitchCase obj1 = new EnumExampleWithSwitchCase(Directions.EAST);
        obj1.getMyDirections();

        EnumExampleWithSwitchCase obj2 = new EnumExampleWithSwitchCase(Directions.SOUTH);
        obj2.getMyDirections();
    }
}
