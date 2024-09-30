public class HumanResourceMangement {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Tran Huy g");
        student1.setMsv("23020536");
        student1.setYearOfBirth(20);
        System.out.println(student1.getName());
        System.out.println(student1.getMsv());
        System.out.println(student1.getYearOfBirth());
        Lecture lecture1 = new Lecture();
        lecture1.setName("Tran  Hoang");
        lecture1.setYearOfBirth(195);
        System.out.println(lecture1.getName());
        System.out.println(lecture1.getYearOfBirth());
        Person person1 = new Person();
        person1.setName("Ngo n Dung");
        person1.setYearOfBirth(205);
        System.out.println(person1.getName());
        System.out.println(person1.getYearOfBirth());
    }
}
