public class Student {
    /**
     * Created by Mostafa
     * This class responsible for simulate students
     */

    private String id;
    private String name;
    private int feesPaid;
    private int feesTotal;
    private int grade;

    /**
     * To create new student by initializing.
     * Fess for every student is 30,000$.
     * Fees Total initially is 0.
     * @param id  id for student  unique.
     * @param name name for student.
     * @param grade grade for student.
     */
    public Student(String id, String name,int grade){
        feesTotal = 30000;
        feesPaid= 0;
        this. id= id;
        this.name = name;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getGrade() {
        return grade;
    }

    /**
     * Adding the fees to feesPaid field
     * @param fees
     */
    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
