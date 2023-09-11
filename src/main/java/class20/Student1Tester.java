package class20;

public class Student1Tester {
    public static void main(String[] args) {
        Student1[] s = {new Student1(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (int i = 0; i < s.length; i++) {
            s[i].read();
            s[i].study();
            s[i].write();

        }

    }
}

