import java.util.Scanner;
public class determineStringWithUniqueCharacter{
    public static void main(String[] args){
        //Obtains a string input from the User for processing
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter a String:");
        String stringInput = userInput.nextLine();
        userInput.close();
        //Check if string have repeating characters
        Boolean repeatingCharacter = false;
        for(int comparer = 0; comparer <= stringInput.length()-2; comparer++){
            for(int compareTo = comparer+1; compareTo <= stringInput.length()-1; compareTo++){
                if(stringInput.charAt(comparer)==stringInput.charAt(compareTo)){
                    repeatingCharacter = true;
                    break;
                }
            }
        }
        if(repeatingCharacter == true){
            System.out.println("There are repeating characters.");
        }
        else{
            System.out.println("There are no repeating characters.");
        }
    }
}