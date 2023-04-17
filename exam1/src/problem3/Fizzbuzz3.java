package problem3;

public class Fizzbuzz3 {
	public String fizzBuzzMethod(int num){
		String answer = "";

		for (int i = 1; i <= num; i++){
			if (((i % 5) == 0) && ((i % 7) == 0))
				answer = answer + " fizzbuzz";
			else if ((i % 5) == 0) 
				answer = answer + " fizz";
			else if ((i % 7) == 0) 
				answer = answer + " buzz";
			else
				answer = answer + "";
		}
		return answer; 
	}
	
	public String mut1(int num) {
		String answer = "";

		for (int i = 1; i < num; i++){ 			//Relational Op mutant
			if (((i % 5) == 0) && ((i % 7) == 0))
				answer = answer + " fizzbuzz";
			else if ((i % 5) == 0) 
				answer = answer + " fizz";
			else if ((i % 7) == 0) 
				answer = answer + " buzz";
			else
				answer = answer + "";
		}
		return answer; 
	}
	
	public String mut2(int num) {
		String answer = "";

		for (int i = 1; i <= num; i++){
			if (((i % 5) == 0) && ((i % 7) == 0))
				answer = answer + " fizzbuzz";
			else if ((i + 5) == 0) 				//Arithmetic Operator replacement
				answer = answer + " fizz";
			else if ((i % 7) == 0) 
				answer = answer + " buzz";
			else
				answer = answer + "";
		}
		return answer; 
	}
	
	public String mut3(int num) {
		String answer = "";

		for (int i = 1; i <= num; i++){
			if (((i % 5) == 0) && ((i % 7) == 0))
				answer = answer + " fizzbuzz";
			else if ((i % 5) == 0) 
				answer = answer + " fizz";
			//else if ((i % 7) == 0) 
				//answer = answer + " buzz";      //Statement Deletion
			else
				answer = answer + "";
		}
		return answer; 
	}
	
	public String mut4(int num) {
		String answer = "";

		for (int i = 1; i <= num; i++){
			if (((i % 5) == 0) || ((i % 7) == 0)) //Logical Operator Replacement
				answer = answer + " fizzbuzz";
			else if ((i % 5) == 0) 
				answer = answer + " fizz";
			else if ((i % 7) == 0) 
				answer = answer + " buzz";
			else
				answer = answer + "";
		}
		return answer; 
	}
	
	public String mut5(int num) {
		String answer = "";

		for (int i = 1; i <= num; i--){  //Shortcut operator replacement
			if (((i % 5) == 0) && ((i % 7) == 0))
				answer = answer + " fizzbuzz";
			else if ((i % 5) == 0) 
				answer = answer + " fizz";
			else if ((i % 7) == 0) 
				answer = answer + " buzz";
			else
				answer = answer + "";
		}
		return answer; 
	}
	

}
