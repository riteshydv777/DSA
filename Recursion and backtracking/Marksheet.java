 // Creatring Marksheet of Student.
 
 // Name : Ritesh Kumar
 // Sap id : 1000017509
 // Roll no : 210102500

class Student {
    private int rollNo;
    private String name;
    private int[] marks;

    public Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int computeTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double computePercentage() {
        return computeTotalMarks() / 3.0;
    }

    public String computeGrade() {
        double percentage = computePercentage();
        if (percentage >= 90) {
            return "A";
        } else if (percentage >= 80) {
            return "B";
        } else if (percentage >= 70) {
            return "C";
        } else if (percentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void printReportCard() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + computeTotalMarks());
        System.out.println("Percentage: " + computePercentage() + "%");
        System.out.println("Grade: " + computeGrade());
    }
}

public class Marksheet {
    public static void main(String[] args) {
        int[] marks = {85, 88, 76};

        Student student = new Student(7, "Rohan", marks);
        student.printReportCard();
        
    }
}
