
import java.text.DecimalFormat;
import java.util.*;
public class studentGrade {
    public static float sumMarks(int m1,int m2,int m3,int m4,int m5){
        return(m1+m2+m3+m4+m5);
    }
    public static double avgMarks(int m1,int m2,int m3,int m4,int m5){
        double avg=((m1+m2+m3+m4+m5)/500.00)*100.00;
        return avg;

    }
    public static void gradeMarks(double avg){
        if(avg>=90&&avg<=100){
            System.out.println("Grade: A+");
        }else if(avg>=80&&avg<90){
            System.out.println("Grade: A");
        }else if(avg>=70&&avg<80){  
            System.out.println("Grade: B+");
        }else if(avg>=60&&avg<70){
            System.out.println("Grade: B");
        }else if(avg>=50&&avg<60){
            System.out.println("Grade: C");
        }else if(avg>=40&&avg<50){
            System.out.println("Grade: D");
        }else if(avg<40){
            System.out.println("Grade: F");
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the marks:");
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        DecimalFormat f=new DecimalFormat("#.##");
        double avg=avgMarks(m1, m2, m3, m4, m5);
        System.out.println("Total marks:"+" "+sumMarks(m1, m2, m3, m4, m5));
        System.out.println("Average Percetage:"+" "+f.format(avg));
        gradeMarks(avg);

    }   
}
