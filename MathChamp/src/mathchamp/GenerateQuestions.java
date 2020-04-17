package mathChamp;

import java.util.HashMap;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class GenerateQuestions {
	
	private String question;
	private double result;
	private int questionLength;
	private int digitSize;
	private HashMap<String, Integer> operatorPrecedenceTable = new HashMap<>();
	
	private static ScriptEngine jsEngine = new ScriptEngineManager().getEngineByName("javascript");
	
	
	public GenerateQuestions() {
		
		operatorPrecedenceTable.put("+", 1);
		operatorPrecedenceTable.put("-", 1);
		
		
		questionLength = 3;
		digitSize = 2;
		
		generateNewExpression();
		
	}
	
	public void generateNewExpression() {
		question = "";
		for(int i = 0; i < questionLength; i++)
			question +=  Integer.toString((int)(Math.random() * 10e5 % Math.pow(10, digitSize))) 
							+ (i < questionLength - 1 ? 
									operatorPrecedenceTable
										.keySet()
											.toArray()[ 
									            (int)(Math.random() * 10e5) % operatorPrecedenceTable.size()
							            ] 
				            		: ""
		            			);
		
		try {
			result =  new Double( (jsEngine.eval(question)).toString() );
		} catch (ScriptException e) {
			//e.printStackTrace();
			System.err.println("Environmental variable is not deteched!");
		}
		
	}
	
	public String getExpression() {
		return question;
	}
	
	public double getResult() {
		return result;
	}
	
	public void setExpressionLength (int length) {
		questionLength = length;
	}
	
	public void setDigitSize(int size) {
		digitSize = size;
	}
	
	public void addOperator(String symbol, int precendence) {
		operatorPrecedenceTable.put(symbol, precendence);
	}
	
	
}
