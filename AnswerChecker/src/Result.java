
public class Result {
	private int questionNumber;
	private String answer;
	private String input;
	
	public Result(int questionNumber, String answer,  String input) {
		this.questionNumber = questionNumber;
		this.answer = answer;
		this.input = input;
	}
	
	public int getQuestionNumber() {
		return questionNumber;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public String getInput() {
		return input;
	}
}
