class Human {
    // ........
}

class Boy extends Human {
    public static void main(String[] args) {
        // Boy and assigns a reference of Boy to it
        Boy obj1 = new Boy();
        // since Boy extends Human class, the object creation can be done in this way, 
        // Parent class reference can have Child claas reference assigned to it
        Human obj2 = new Boy();
    }
}