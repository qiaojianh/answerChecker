import java.util.ArrayList;
import java.util.List;

public class Checker {
	
	List<Result> answerKeeper;
	boolean checked = true;
	public Checker() {
		answerKeeper = new ArrayList<Result>();
	}
	
	public boolean sizeCheck(List<String> answer, List<String> input) {
		if(answer.size() != input.size()) {
			return false;
		}
		return true;
	}
	
	public void check(List<String> answer, List<String> input) throws Exception{
//		List<Result> res = new ArrayList<Result>();
		if(!sizeCheck(answer,input)) {
			checked = false;
			System.out.println("answer number"+ answer.size());
			System.out.println("input number"+ input.size());
			throw new Exception("Number of input does not match number of answer");
		}
		for(int i = 0 ; i < answer.size(); i++) {
			if(!answer.get(i).equals(input.get(i))) {
				answerKeeper.add(new Result(i+1,answer.get(i), input.get(i)));
			}
		}
		checked = true;
//		return res;
	}
	
	public String toString() {
		if(!checked){
			return "Does not have data";
		}
		if(answerKeeper.size() == 0 ) {
			return "Congratulation!";
		}
		String res = "You have " + answerKeeper.size() + " question wrong\n";
		for(Result r: answerKeeper) {
			res += "Question "+ r.getQuestionNumber() + " :The answer is "+r.getAnswer() + ", your input is " + r.getInput() + "\n"; 
		}
		return res;
	}
}
