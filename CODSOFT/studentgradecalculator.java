
    import java.util.Scanner;

public class studentgradecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT GRADE CALCULATOR :");
        System.out.println("How many subject do you have :");
        int ns = sc.nextInt();
        int total=0;
    for(int i=0; i<ns; i++){
        System.out.println("Enter the marks obtained in subject :"+(i+1)+" is");
        int marks=sc.nextInt();
        total+=marks;
    }
    double average=(double)total/ns;

        char grade;
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60 && average < 80) {
            grade = 'B';
        } else if (average >= 50 && average < 60) {
            grade = 'C';
        } else {
            grade = 'F';
            System.out.println("you have Failed " );
        }
System.out.println("Total marks you obtained is:"+total);
System.out.println("Your average percentage is:"+average);
        System.out.println("Your grade is: " + grade);
    }
}


