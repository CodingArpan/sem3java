class Q4{
public static void main(String args[]){
Long enr;
String name,branch;
enr=Long.parseLong(args[0]);
name=args[1];
branch=args[2];

// Single Line print

System.out.print("Enrolment No: "+ enr+ "\n" +"Name: "+ name+ "\n" + "Branch: "+ branch + "\n");

// Multiple Line Print

System.out.println("Enrolment No: "+ enr);
System.out.println("Name: "+ name);
System.out.println("Branch: "+ branch);
}
}