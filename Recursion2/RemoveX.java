/*
Given a string, compute recursively a new string where all 'x' chars have been removed.
*/
public class solution {

	// Return the changed string
	public static String removeX(String input){
	if(input.length()==0){
        return input;
       }
        if(input.charAt(0)=='x'){
            return removeX(input.substring(1));
        }else{
            return input.charAt(0)+removeX(input.substring(1));
        }
        
      }
	}
