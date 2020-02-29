/**
 * Created by S10080586 on 2/9/2017.
 */
public class CollegeStudent extends Student {
    private String major;
    private int year;

    // constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major)
    {
        super(name, age, gender, idNum, gpa);

        this.major= major;
        this.year=year;
    }

    public String getMajor()
    {
        return this.major;
    }

    public double getYear()
    {
        return this.year;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String toString()
    {
        return super.toString() +
                ", year: " + year + ", major: " + major;
    }
}
