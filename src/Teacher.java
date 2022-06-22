public class Teacher {
    /**
     * Created by Mostafa
     * This class responsible for simulate teachers
     */
    private String id;
    private String name;
    private int salary;

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
}
