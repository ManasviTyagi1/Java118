class Student extends Abstr {
    public Student(String name, int roll_no) {
        super(name, roll_no);
    }

    @Override
    void attend_class() {
        System.out.println(name + " Attend class on Smart Board");
    }

    @Override
    void give_exam() {
        System.out.println(roll_no + " Give exam in Online Mode");
    }
}

public class MYCLASS {
    public static void main(String[] args) {
        Student s1 = new Student("Abhi", 12);
        s1.attend_class();
        s1.give_exam();
    }
}
