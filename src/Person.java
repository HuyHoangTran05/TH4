public class Person {
    protected String name;
    protected int yearOfBirth;

    Person() {

    }

    Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getYearOfBirth() {

        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {

        this.yearOfBirth = yearOfBirth;
    }
}
