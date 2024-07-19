import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("enter the marks obtained in Maths: ");
            int mathsMarks=sc.nextInt();

            System.out.println("enter the marks obtained in English: ");
            int englishMarks=sc.nextInt();

            System.out.println("enter the marks obtained in Physics: ");
            int physicsMarks=sc.nextInt();

            System.out.println("enter the marks obtained in Chemistry: ");
            int chemistryMarks=sc.nextInt();

            int totalMarks=mathsMarks+englishMarks+physicsMarks+chemistryMarks;
            double averageMarks=(totalMarks/4.0)*100;

            System.out.println("Total marks obtained: "+totalMarks);
            System.out.println("Total marks obtained: "+averageMarks);

            
            //Assign the grades based on the average percentage
            String grade;
            if(averageMarks>=90){
                grade="A+";
            }else if(averageMarks>=80){
                grade="A"; 
            }else if(averageMarks>=70){
                grade="B";
            }else if(averageMarks>=60){
                grade="C";
            }else if(averageMarks>=50){
                grade="D";
            }else{
                grade="F";
            }
            System.out.println("Grade: "+ grade);

            sc.close();

            
    }
}
