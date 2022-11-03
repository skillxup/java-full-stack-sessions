import java.io.File;

class DeleteTheFile {

    public static void main(String[] args) {
        try {
            File file = new File("newfile.txt");
            if(file.delete()) {
                System.out.println(file.getName() + " is deleted");
            } else {
                System.out.println("Deleted failed: File didn't delete");
            }
        } catch(Exception e) {
            System.out.println("Exception occured");
            e.printStackTrace();
        }     
    }
}
