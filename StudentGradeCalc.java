 package codsoft;
import java.util.Scanner;

public class StudentGradeCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number of subjects: ");
		int numsubjects = scanner.nextInt();
		
		int[] marks = new int[numsubjects];
		int totalMarks=0;
		for(int i=0, value; i<numsubjects;i++) {
			System.out.print("Enter the marks obtained out of 100 in subject: "+(i+1)+" :\t");
			value = scanner.nextInt();
			if(value < 100) {
				marks[i] = value;
				totalMarks += marks[i];
				
			}else {
				System.out.println("\n\t please enter the valid marks");
				i++;
			}
		}
		scanner.close();
		float averagePercentage = (float) totalMarks / numsubjects;
		
		String grade;
		switch ((int) (averagePercentage /10)) {
		case 9,10:
			grade = "A";
		break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5,4:
			grade = "Pass";
		break;
		default:
			grade = "fail";
			break;
			
		
		
		}
		System.out.println("\nTotal marks: scored " + totalMarks  + "/" + numsubjects * 100);
		System.out.println("\nAverage percentage: " + averagePercentage);
		System.out.println("\nGrade:" + grade);
		
		
		
	}
}


		
		
		