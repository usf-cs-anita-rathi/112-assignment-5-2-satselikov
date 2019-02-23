public class GradingProgramTest {
	public static void main(String[] args) {
		GradingProgram record1 = new GradingProgram();
		double quiz1 = 75.0;
		record1.setQuiz1(quiz1);
		System.out.println("Quiz 1: " + quiz1);
		double quiz2 = 83.0;
		record1.setQuiz2(quiz2);
		System.out.println("Quiz 2: " + quiz2);
		double quiz3 = 89.0;
		record1.setQuiz3(quiz3);
		System.out.println("Quiz 3: " + quiz3);

		double scoreMidterm = 70;
		record1.setMidtermScore(scoreMidterm);
		System.out.println("Midterm Score: " + scoreMidterm);

		double scoreFinalExam = 95;
		record1.setFinalExamScore(scoreFinalExam);
		System.out.println("Final Exam Score " + scoreFinalExam);

		record1.setOverallGradeNumber();
		System.out.println("Grade Number: " + record1.getoverallGradeNumber());

		record1.setLetterGrade();
		System.out.println("Letter Grade: " + record1.getfinalLetterGrade());

		System.out.println("Overall Summary using toString Method; " + record1.toString());

	}

}
