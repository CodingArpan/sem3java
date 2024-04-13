import java.util.Scanner;

class Student {
    Scanner scan = new Scanner(System.in);
    long rollno, contact;
    float weight, height, age;

    void set_info() {

        System.out.println("Enter the rollno :");
        this.rollno = scan.nextLong();
        System.out.println("Enter the contact :");
        this.contact = scan.nextLong();
        System.out.println("Enter the weight :");
        this.weight = scan.nextFloat();
        System.out.println("Enter the height :");
        this.height = scan.nextFloat();
        System.out.println("Enter the age :");
        this.age = scan.nextFloat();
    }

    void get_info() {

        System.out.println("Rollno :" + this.rollno);
        System.out.println("Contact :" + this.contact);
        System.out.println("Weight :" + this.weight);
        System.out.println("Height :" + this.height);
        System.out.println("Age :" + this.age);

        System.out.println("------------------------");

    }
}

class student_info {
    public static void main(String[] args) {
        Student[] s = new Student[5];
        for (int i = 0; i < 5; i++) {
            s[i] = new Student();
            s[i].set_info();
            s[i].get_info();
        }
        for (int i = 0; i < 5; i++) {
            s[i].get_info();
        }
    }
}
