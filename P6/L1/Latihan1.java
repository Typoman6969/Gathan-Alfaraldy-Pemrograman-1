public class Latihan1 {
    private String name;
    private String address;
    private int age;

    private static int studentCount;

    public void setName(String temp) {
        this.name = temp;
    }

    public void setAddress(String temp) {
        this.address = temp;
    }

    public void setAge(int temp) {
        this.age = temp;
    }

    public String getName() {
        return name;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void print(String temp) {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade) {
        System.out.println("Name: " + name);
        System.out.println("Math Grade: " + mGrade);
        System.out.println("English Grade: " + eGrade);
        System.out.println("Science Grade: " + sGrade);
    }

    public static void main(String[] args) {
        Latihan1 student1 = new Latihan1();

        student1.setName("Anna");
        student1.setAddress("Phillipines");
        student1.setAge(15);

        System.out.println("....Output Print 1....");
        student1.print(student1.getName());
        
        System.out.println("....Output Print 2....");
        student1.print(95.5, 88.0, 100.0);
    }
}