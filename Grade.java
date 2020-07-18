import java.util.Scanner;

public class Grade
{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		GradeBook myGradeBook = new GradeBook();
		System.out.println("Your input data:");
		System.out.print("Enter your number:");
		String number = input.next();
		myGradeBook.setNum(number);
		System.out.print("Enter your Chinese Grade:");
		String temp1 = input.next();
		Double chinese = Double.parseDouble(temp1);
		myGradeBook.setChineseGrade(chinese);
		System.out.print("Enter your Math Grade:");
		String temp2 = input.next();
		Double math = Double.parseDouble(temp2);
		myGradeBook.setMathGrade(math);
		System.out.print("Enter your English Grade:");
		String temp3 = input.next();
		Double english = Double.parseDouble(temp3);
		myGradeBook.setEnglishGrade(english);
		System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- --");
		System.out.println("Grade data:");
		myGradeBook.displayMessageNum();
		myGradeBook.displayMessageChinese();
		myGradeBook.displayMessageMath();
		myGradeBook.displayMessageEnglish();
		myGradeBook.displayMessageTotal();
		myGradeBook.displayMessageAverage();
	}
}