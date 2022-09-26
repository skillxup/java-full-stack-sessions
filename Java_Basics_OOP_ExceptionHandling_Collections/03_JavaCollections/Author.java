// Author Class
public class Author implements Comparable<Author> {
    String firstName;
    String lastName;
    String bookName;

    Author(String first, String last, String book) {
        this.firstName = first;
        this.lastName = last;
        this.bookName = book;
    }

    @Override
    /**
     * this is where we write the logic to sort
     * this method sort automatically by the firstName 
     * in the case that the last name is the same
     */
    public int compareTo(Author au) {
        /**
         * sorting by last name, compareTo should return < 0 if this (keyword) 
         * is supposed to be less than au, > 0 if this is supposed to be greater than object au and 0 if they are supposed to equal
         */
        int last = this.lastName.compareTo(au.lastName);
        // sorting by first name if last name is name d
        return last == 0 ? this.firstName.compareTo(au.firstName): last;
    }
}

