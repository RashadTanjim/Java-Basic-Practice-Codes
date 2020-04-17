package mathChamp;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenerateQuestions randomExpression = new GenerateQuestions();
		
		System.out.println(randomExpression.getExpression());
		System.out.println(randomExpression.getResult());
		
		randomExpression.generateNewExpression();
		
		System.out.println(randomExpression.getExpression());
		System.out.println(randomExpression.getResult());
		

	}

}
