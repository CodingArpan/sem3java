class Exam {
    String stu_name, sub_code, sub_name;
    int rollno, InternalMarks, ExternalMarks, total;

    Exam(String stu_name, int rollno, String sub_code, String sub_name, int InternalMarks, int ExternalMarks) {
        this.stu_name = stu_name;
        this.rollno = rollno;
        this.sub_code = sub_code;
        this.sub_name = sub_name;
        this.InternalMarks = InternalMarks;
        this.ExternalMarks = ExternalMarks;
    }

    void Calculate_result() {
        this.total = this.InternalMarks + this.ExternalMarks;
    }

    void Show_result() {
        System.out.println("Name : " + this.stu_name + " Roll No. : " + this.rollno + " Total : " + this.total);
    }
}

class Exam_demo {
    public static void main(String[] args) {
        Exam st1 = new Exam("Arpan", 11004, "2ce002", "Oop", 20, 50);
        st1.Calculate_result();
        st1.Show_result();
    }
}
