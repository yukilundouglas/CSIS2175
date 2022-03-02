package Inheritance;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity{
	private int numQuestions; //number of Questions
	private double pointsEach; // marks for each question
	private int numMissed; //questions missed
	
	public FinalExam(int numQuestions, int numMissed) {
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0/numQuestions;
		
		double score = 100 - (numMissed * pointsEach);
		setScore(score);
		
	}
	
	
	public void foo() {
		//System.out.println(score); // score itself is private
		System.out.println(getScore());
		display(); //this child method unless there is not display method in this class (then it is the parent method)
		this.display(); //same as above
		super.display(); // the parent method
	}
	
	@Override
	public void display() { //static method cannot be overridden, and you call it by ClassName.MethodName()
		
		JOptionPane.showMessageDialog(null, 
				"Each question counts " + pointsEach);
		super.display();
//				+ "\n Your score is " + getScore()
//				+ "\n Your grade is "+ getGrade());
	}
	
	
	
	
}
