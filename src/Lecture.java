public class Lectures {
    string name;
    int yearOfBirth;

    Lectures(string name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public string getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setName(string name) {
        this.name = name;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
