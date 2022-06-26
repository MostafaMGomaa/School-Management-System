import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher mostafa = new Teacher("1", "Mostafa", 500);
        Teacher ahmed = new Teacher("2", "Ahmed", 700);
        Teacher sami = new Teacher("3", "sami", 600);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(mostafa);
        teachers.add(ahmed);
        teachers.add(sami);


        Student john = new Student("1", "John", 4);
        Student albert = new Student("2", "albert", 12);
        Student mick = new Student("3", "Mick", 5);

        List<Student> students = new ArrayList<>();
        students.add(john);
        students.add(albert);
        students.add(mick);

        School usc = new School(teachers, students);

        john.payFees(5000);
        albert.payFees(5000);

        System.out.printf("USC has earned %d$%n", usc.getTotalMoneyEarn());

        System.out.println("_______________________________________");
        mostafa.recevieSalary(mostafa.getSalary());
        System.out.printf("USC has spent for salary to %s and now has %d$%n",
                mostafa.getName(), usc.getTotalMoneyEarn());

        sami.recevieSalary(sami.getSalary());
        System.out.printf("USC has spent for salary to %s and now has %d$%n",
                sami.getName(), usc.getTotalMoneyEarn());


        System.out.println(john);
        System.out.println(mostafa);
    }
}
