package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    private List<Student> students;

    public ZipCodeWilmington(List<Student> students){
        this.students = students;
    }

    public ZipCodeWilmington(){
        this.students = new ArrayList<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        if (students.contains(student)){
            return true;
        }
        return false;
    }

    public void lecture(Double numberOfHours) {
        for (Student s : students){
            s.setTotalStudyTime(s.getTotalStudyTime() + numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for (Student s : students){
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
}
