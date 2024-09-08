//Task-2
//Student Grade Calculator

import java.util.Scanner;


public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Student Grade Calculator");
        System.out.println("Enter the total number of subjects : ");

        int total = sc.nextInt();
        int totalMarks = 0;

        for (int i = 0; i < total; i++) {
            System.out.println("Enter the obtained  marks in  subject " + (i + 1) + ": ");

            int marks = sc.nextInt();
            totalMarks += marks;
        }
        //avg=average Per=percentage

        double  avgPer = (double) totalMarks / total;
        char Grade;



        if(avgPer>=90){
            Grade = 'A';
        }

        // A =
        else if(avgPer>=80){
            Grade = 'B';
        }

        else if(avgPer>=70){
            Grade = 'C';
        }

        else if(avgPer>=60){
            Grade = 'D';
        }

        else if(avgPer>=33){
            Grade = 'E';
        }


        else {
            Grade = 'F';
        }

        System.out.println("Total Marks Scored is " + totalMarks);
        System.out.println("Average Percentage Scored is :  " + avgPer + "%");
        System.out.println("Grade : " + Grade);

        System.out.println("Thank you for using Student Grade Calculator");


    }
}

