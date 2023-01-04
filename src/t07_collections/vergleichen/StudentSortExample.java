package t07_collections.vergleichen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(47271, "Kerrie", "Adkins"));
        students.add(new Student(99319, "Aarron", "Wicks"));
        students.add(new Student(11056, "Kaya", "Molina"));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getLastName().compareTo(o2.getLastName());
                if (result == 0) {
                    result = o1.getFirstName().compareTo(o2.getFirstName());
                }
                return result;
            }
        });

        students.sort(Comparator.comparing(Student::getLastName)
                .thenComparing(Student::getFirstName)
                .thenComparingInt(Student::getId));

        System.out.println("students = " + students);
    }
}
