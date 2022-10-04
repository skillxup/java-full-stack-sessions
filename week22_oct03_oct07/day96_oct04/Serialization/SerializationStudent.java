class SerializationStudent implements java.io.Serializable {
    // properties
    private int stuRollNum;
    private int stuAge;
    private String stuName;
    private transient String stuAddress;
    private transient int stuHeight;

    // constructor
    public SerializationStudent(int roll, int age, String name, String address, int height) {
        this.stuRollNum = roll;
        this.stuAge = age;
        this.stuName = name;
        this.stuAddress = address;
        this.stuHeight = height;
    }

    // getters and setters
    public int getStuRollNum() {
        return stuRollNum;
    }

    public void setStuRollNum(int stuRollNum) {
        this.stuRollNum = stuRollNum;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getStuHeight() {
        return stuHeight;
    }

    public void setStuHeight(int stuHeight) {
        this.stuHeight = stuHeight;
    }

    public static void main(String[] args) {
        SerializationStudent obj = new SerializationStudent(1, 33, "john", "uea", 5);

        System.out.println(obj);
    }
}