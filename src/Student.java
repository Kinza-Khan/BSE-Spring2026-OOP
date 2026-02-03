public class Student {
    // instance variable or data members
    int studentId ;
    String studentName ;
    // default Constructor
    Student(){
         studentId = 1 ;
         studentName = "kinza";
        System.out.println("Default Constructor " + studentId + " " + studentName);
    }
    // parameterized constructor
    Student(int sId , String sName  ){
            this.studentId = sId;
            this.studentName = sName;
            System.out.println(this.studentId + " " + this.studentName);

    }
    void display(){
        System.out.print("studentId is " + studentId + "\nstduentName is "+ studentName);
    }




    public static void main(String[] args) {
            Student s1 =  new Student();
            Student s2 = new Student(2,"sana");
            Student s3 = new Student();


            s3.studentId = 4 ;
            s3.studentName = "Fareeha";
            s3.display();
    }
}