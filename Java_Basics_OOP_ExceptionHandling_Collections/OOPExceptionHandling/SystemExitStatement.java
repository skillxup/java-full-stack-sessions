class SystemExitStatement {
    try {
        System.out.println("Inside Try Block");
        System.exit(0);
    } catch(Exception exp) {
        System.out.println(exp);
    } finally {
        System.out.println("Finally Block Executed");
    }
}
