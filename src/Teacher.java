public class Teacher {
    /**
     * Created by Mostafa
     * This class responsible for simulate teachers
     */
    private String id;
    private String name;
    private int salary;
    private int salaryEraned;

    /**
     * To create new Teacher by initializing.
     * @param id  id for Teacher  unique.
     * @param name name for Teacher.
     * @param salary salary for Teacher.
     */
    public Teacher(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Adds salary to salaryEarned.
     * Removes from total money earned to school.
     * @param salary
     */
    public void recevieSalary(int salary){
        salaryEraned += salary;
        School.updateTotalMoneySpent(salaryEraned);
    }

    @Override
    public String toString() {
        return "Teacher's name : " + this.getName()+" Total salary : $" +this.salaryEraned;
    }
}
