package core_java_day13;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void display() {
		System.out.println(name + " - " + score);
	}
}

public class StudentRanking {
	
	public static void main(String[] args) {
		
		Student[] students = { new Student("Nisha", 78), new Student("Rajani", 92), new Student("Chandu", 85),
				new Student("Pranali", 65), new Student("Ramya", 89) };

		for (int i = 0; i < students.length - 1; i++) 
		{
			for (int j = 0; j < students.length - 1 - i; j++) 
			{
				if (students[j].score < students[j + 1].score) 
				{	
					Student temp = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp;
				}
			}
		}

		System.out.println("Student Rankings (High to Low):");
		for (Student s : students) {
			s.display();
		}
	}
}
