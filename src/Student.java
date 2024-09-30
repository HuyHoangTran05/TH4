public class Student extends Person {
    protected String msv;

    Student() {
        super();
    }

    public Student(String msv, String name, int yearOfBirth) {
        super(name, yearOfBirth);
        this.msv = msv;
    }

    public String getMsv() {

        return msv;
    }

    public void setMsv(String msv) {

        this.msv = msv;
    }
}
