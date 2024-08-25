import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("Enter marks(out of 100)");
        for(int i=0;i<5;i++){
            System.out.print("Subject "+(i+1)+" : ");
            marks[i]=sc.nextInt();
            if(marks[i]>100 || marks[i]<0){
                System.out.println("Incorrect marks");
                i--;
                continue;
            }
        }
        int total=0;
        for(int x:marks){
            total = total+x;
        }
        float avg = total/5.0f;
        char grade;
        if(avg<=100 && avg>=80){
            grade = 'A';
        }else if(avg<80 && avg>=65){
            grade = 'B';
        }else if(avg<65 && avg>=50){
            grade = 'C';
        }else if(avg<50 && avg>=40){
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println("Total Marks : "+total);
        System.out.println("Average Percentage : "+avg);
        System.out.println("Grade : "+grade);
        sc.close();
    }
}
