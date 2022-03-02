package Inheritance;

import javax.swing.JOptionPane;

public class GradeDemo {

	public static void main(String[] args) {
		String input;
		int questions, missed;
		
		input = JOptionPane.showInputDialog(null, "How many questions?");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "How many questions missed?");
		missed = Integer.parseInt(input);
		
		FinalExam exam = new FinalExam(questions, missed);
		exam.display();
		
	}

}
