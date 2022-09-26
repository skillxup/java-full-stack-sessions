class FinallyCloseStatement {
    public static void main(String[] args) {
        try {
            OutputStream osf = new FileOutputStream("filename");
            OutputStream osb = new BufferedOutputStream(opf);
            ObjectOutput op = new ObjectOutputStream(osb);

            try {
                output.writeObject(writableObject);
            }
            finally {
                op.close();
            }
        } catch(IOException e1) {
            System.out.println(e1);
        }
    }    
}
