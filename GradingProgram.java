public class GradingProgram {
	public double quiz1;
	public double quiz2;
	public double quiz3;
	public double scoreMidterm;
	public double scoreFinalExam;
	public double overallGradeNumber;
	public String finalLetterGrade;

	// default constructor to set all scores to 0
	public GradingProgram() {
		quiz1 = 0;
		quiz2 = 0;
		quiz3 = 0;
		scoreMidterm = 0;
		scoreFinalExam = 0;
	}

	// constructor for all tests
	public GradingProgram(double quiz1, double quiz2, double quiz3, double scoreMidterm, double scoreFinalExam) {
		this.quiz1 = quiz1;
		this.quiz2 = quiz2;
		this.quiz3 = quiz3;
		this.scoreMidterm = scoreMidterm;
		this.scoreFinalExam = scoreFinalExam;
	}

	// mutator set quiz 1
	public void setQuiz1(double quiz1) {
		this.quiz1 = quiz1;
	}

	// mutator set quiz 2
	public void setQuiz2(double quiz2) {
		this.quiz2 = quiz2;
	}

	// mutator set quiz 3
	public void setQuiz3(double quiz3) {
		this.quiz3 = quiz3;
	}

	// mutator to set new midterm score
	public void setMidtermScore(double scoreMidterm) {
		this.scoreMidterm = scoreMidterm;
	}

	// mutator to set new final exam score
	public void setFinalExamScore(double scoreFinalExam) {
		this.scoreFinalExam = scoreFinalExam;
	}

	// mutator to set overallscore
	public void setOverallGradeNumber() {
		overallGradeNumber = (((quiz1 + quiz2 + quiz3) / 3) * 0.25) + (scoreMidterm * 0.35) + (scoreFinalExam * 0.40);
	}

	// mutator to set the letter grade
	public void setLetterGrade() {
		overallGradeNumber = ((((quiz1 + quiz2 + quiz3) / 3) * 0.25) + (scoreMidterm * 0.35) + (scoreFinalExam * 0.40));
		if (overallGradeNumber >= 90) {
			finalLetterGrade = "A";
		} else if (overallGradeNumber >= 80) {
			finalLetterGrade = "B";
		} else if (overallGradeNumber >= 70) {
			finalLetterGrade = "C";
		} else if (overallGradeNumber >= 60) {
			finalLetterGrade = "D";
		} else if (overallGradeNumber < 60) {
			finalLetterGrade = "F";
		}
	}

	// accessor to return quiz 1
	public double getQuiz1() {
		return quiz1;
	}

	// accessor to return quiz 2
	public double getQuiz2() {
		return quiz2;
	}

	// accessor to return quiz 3
	public double getQuiz3() {
		return quiz3;
	}

	// accessor to return midterm score
	public double getMidtermScore() {
		return scoreMidterm;
	}

	// accessor to return final exam score
	public double getFinalExamScore() {
		return scoreFinalExam;
	}

	// accessor to get overall grade number
	public double getoverallGradeNumber() {
		return overallGradeNumber;
	}

	// accessor to return the letter grade
	public String getfinalLetterGrade() {
		return finalLetterGrade;
	}

	// equals method
	public boolean equals(GradingProgram temp) {
		if (finalLetterGrade.contentEquals(temp.finalLetterGrade))
			return true;
		else
			return false;
	}

	// to string method
	public String toString() {
		return "Quiz 1: " + quiz1 + ", " + "Quiz 2: " + quiz2 + ", " + "Quiz 3: " + quiz3 + ", " + "Midterm score: "
				+ scoreMidterm + ", " + "Final Exam Score: " + scoreFinalExam + ", " + "Overall Grade Number: "
				+ overallGradeNumber + ", " + "Letter Grade: " + finalLetterGrade;
	}
}
