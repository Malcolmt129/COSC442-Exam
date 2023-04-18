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
}
