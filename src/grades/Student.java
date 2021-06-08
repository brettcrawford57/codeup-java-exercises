package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

//    public Student(String name, int grades) {
//        this.name = name;
//        grades = new ArrayList<>();
//    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
        return;

//        public double getGradeAverage(){
//            return grades / grade.size;
//        }
    }

    HashMap<String, String> students = new HashMap<>();

}
