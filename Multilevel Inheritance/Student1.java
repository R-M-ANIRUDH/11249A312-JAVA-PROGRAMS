
class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


class Marks extends Student1 {
    double[] marks;

    Marks(int id, String name, double[] marks) {
        super(id, name);
        this.marks = marks;
    }
}


class Result extends Marks {
    double total, avg;
    char grade;

    Result(int id, String name, double[] marks) {
        super(id, name, marks);
        calculate();
    }

    void calculate() {
        total = 0;
        for (double m : marks) total += m;
        avg = total / 5;

        if (avg >= 90) grade = 'A';
        else if (avg >= 80) grade = 'B';
        else if (avg >= 70) grade = 'C';
        else if (avg >= 60) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("=== Student Result ===");
        System.out.println("ID    : " + id);
        System.out.println("Name  : " + name);
        System.out.println("Total : " + total + " / 500");
        System.out.println("Avg   : " + avg + "%");
        System.out.println("Grade : " + grade);
    }

    public static void main(String[] args) {
        double[] studentMarks = {85.0, 90.5, 78.0, 88.5, 92.0};
        Result r = new Result(101, "Alice", studentMarks);
        r.display();
    }
}