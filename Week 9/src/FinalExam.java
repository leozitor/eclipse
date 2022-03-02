import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity{
	private int numQuestions; //number of questions
	private double pointsEach; // marks for each question
	private int numMissed; // question missed
	
	public FinalExam(int numQuestions, int numMissed) {
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0/numQuestions;
		
		double score = 100 - (numMissed * pointsEach);
		setScore(score);
	}
	
	public void foo() {
		System.out.println(score);
		super.display();
	}
	
	@Override
	public final void display() {
		JOptionPane.showMessageDialog(null, "Each question counts" + pointsEach + "Your grade is: " + getGrade());
		super.display();
	}
	
	
}
