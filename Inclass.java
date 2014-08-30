import java.util.Scanner;
//5631299421 Pheerawit Charuvajana
//5631354221 Saris Ophaswongse

public class Inclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String input = kb.nextLine();
		String output = process(input);
		System.out.println(output);

	}
	public static String process(String input){
		String result = "";
		for(int i =0; i<input.length(); i++){
			if(input.charAt(i) == ','){
				
			}else if(input.charAt(i) == 'a'){
				
			}else if(input.charAt(i) == ' '){
				String letter = input.charAt(i+1) +"";
				result += " "+letter.toUpperCase();
				i+=1;
				
			}else{
				result += input.charAt(i);
			}
		}
		return result;
	}

}
