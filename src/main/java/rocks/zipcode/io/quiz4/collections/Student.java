package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    private Integer id;
    private Double numberOfHours;

    public Student() {
        this(null);
        this.numberOfHours = 0.0;
    }

    public Student(Integer id) {
        this.id = id;
        this.numberOfHours = 0.0;
    }

    public Student(Integer id, Double numberOfHours){
        this.id = id;
        this.numberOfHours = numberOfHours;
    }

    public void learn(Double amountOfHours) {
        this.numberOfHours += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return this.numberOfHours;
    }

    public void setTotalStudyTime(Double numberOfHours){
        this.numberOfHours = numberOfHours;
    }
}
