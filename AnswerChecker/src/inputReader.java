import java.util.ArrayList;
import java.util.Scanner;

public class inputReader {
	private ArrayList<String> inputs;
	private int size;
	
	public inputReader(int size) {
		this.inputs = new ArrayList<String>();
		this.size = size;
	}
	
	public ArrayList<String> getInputs(){
		return inputs;
	}
	
	public int getSize() {
		return size;
	}
	
	public void readInput() {
		
		Scanner in = new Scanner(System.in);
		int read = 0;
		String input;
		while(read < size) {
			input = in.nextLine().replaceAll("[^(A-Za-z)]", "").replaceAll("\r|\n", "");
			for(String s: input.split("")) {
				if(!s.equals("")) {
					inputs.add(s);
        			}
				read++;
			}
		}
	}
	
	public String toString() {
		String res = "";
		int size = 0;
		for(String s: inputs) {
			res += s;
			size++;
			if(size == 5) {
				size = 0;
				res += "\n";
			}
		}
		return res;
	}
}
