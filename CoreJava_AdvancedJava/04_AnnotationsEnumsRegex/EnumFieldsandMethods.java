public class EnumFieldsandMethods {
    enum Directions {
        EAST ("E"), 
        WEST ("W"), 
        NORTH ("N"), 
        SOUTH ("S");

        private final String shortCode;

        Directions(String code) {
            this.shortCode = code;
        }

        public String getDirectionsCode() {
            return this.shortCode;
        }
    }

    public static void main(String[] args) {
        Directions dir = Directions.SOUTH;
        System.out.println(dir.getDirectionsCode());

        Directions dir2 = Directions.EAST;
        System.out.println(dir2.getDirectionsCode());
    }
}
