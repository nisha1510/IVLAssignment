package core_java_day13;

class Student2 {
    String name;
    int marks;
 
    Student2(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
 
    public String toString() {
        return name + " - " + marks;
    }
}
 
public class StudentInsertionSort {
    public static void main(String[] args) {
        Student1[] students = {
            new Student1("Amit", 78),
            new Student1("Preeti", 92),
            new Student1("Rahul", 67),
            new Student1("Sneha", 85),
            new Student1("Zoya", 70)
        };
 
        // Insertion Sort by marks in descending order
        for (int i = 1; i < students.length; i++) {
            Student1 key = students[i];
            int j = i - 1;
 
            // Shift students with lower marks forward
            while (j >= 0 && students[j].marks < key.marks) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
 
        // Display ranked list
        System.out.println("Student Rankings:");
        for (int rank = 0; rank < students.length; rank++) {
            System.out.println((rank + 1) + ". " + students[rank]);
        }
    }
}