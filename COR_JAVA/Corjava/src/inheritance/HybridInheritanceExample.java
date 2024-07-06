package inheritance;

// Main class to test the hybrid inheritance in education
public class HybridInheritanceExample {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("John Doe", "Mathematics", 5000);
        System.out.println(instructor.getInfo()); // Output: John Doe teaches Mathematics with a salary of $5000.

        OnlineStudent student = new OnlineStudent("Jane Smith", "Computer Science");
        System.out.println(student.getInfo()); // Output: Jane Smith studies Computer Science online.
    }
}

// Base class
class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}

// Base class
class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}

// Interface for teachers
interface Teacher {
    void teach();
    String getInfo();
}

// Interface for students
interface Student {
    void study();
    String getInfo();
}

// Derived class implementing Teacher interface
class Instructor extends Person implements Teacher {
    private String subject;
    private double salary;

    public Instructor(String name, String subject, double salary) {
        super(name);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void teach() {
        System.out.println(name + " teaches " + subject + ".");
    }

    @Override
    public String getInfo() {
        return name + " teaches " + subject + " with a salary of $" + salary + ".";
    }
}

// Derived class implementing Student interface and extending Course
class OnlineStudent extends Course implements Student {
    private String studentName;

    public OnlineStudent(String studentName, String courseName) {
        super(courseName);
        this.studentName = studentName;
    }

    @Override
    public void study() {
        System.out.println(studentName + " studies " + courseName + " online.");
    }

    @Override
    public String getInfo() {
        return studentName + " studies " + courseName + " online.";
    }
}
