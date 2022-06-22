import java.util.List;

public class School {
    /**
     * School have many teacher, many student.
     * Implements teacher & student using arrayList.
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarn;
    private int totalMoneySpent;

    /**
     * New school object is created.
     *
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarn = 0;
        totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers(){
        return teachers;
    }
    public List<Student> getStudents(){
        return students;
    }
    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }
    public int getTotalMoneyEarn(){
        return totalMoneyEarn;
    }

    /**
     * Adds Teacher to school
     * @param newTeacher Teacher object(id, name, salary)
     */
    public void addTeacher(Teacher newTeacher){
        teachers.add(newTeacher);
    }

    /**
     * Adds Student  to school
     * @param newStudent Student object(id, name, feesPaid, feesTotal)
     */
    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    /**
     * Add the total monet earned by school
     * @param moneyEarn money earn by the school
     */
    public void updateTotalMoneyEarn(int moneyEarn) {
        this.totalMoneyEarn += moneyEarn;
    }

    /**
     * Add the total monet spend by school
     * its salary of teachers
     * @param moneySpent money spent by the school
     */
    public void setTotalMoneySpent(int moneySpent) {
        this.totalMoneyEarn -= moneySpent;
    }
}
