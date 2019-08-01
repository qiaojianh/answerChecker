import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class answerReader {
	
	private ArrayList<String> answers;
	
	public answerReader() {
		answers = new ArrayList<String>();
	}
	
	public ArrayList<String> getAnswers(){
		return answers;
	}
	
	public int getSize() {
		return answers.size();
	}
	
	public void readAnswers(String path) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(path));
			if(!reader.ready())
		    {
		        System.out.println("Cannot read answer file");
		        return;
		    }
		    int size=0;
		    String line=reader.readLine();
		    while((line=reader.readLine())!=null)
		    {
//		        System.out.println(line.replaceAll("[^(A-Za-z)]", ""));
		        String[] answerLine = line.replaceAll("[^(A-Za-z)]", "").split("");
		        for(String s: answerLine) {
		        		if(!s.equals("")) {
		        			answers.add(s);
		        		}
		        }
		    }
		    reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Wrong path");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		String res = "";
		int size = 0;
		for(String s: answers) {
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
