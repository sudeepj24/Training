//Write a program to check if the letter 'e' is present in the word 'Umbrella'.

public class p01{
    public static void main(String args[]){
        String str = "Umbrella";
        for(int c : str.toCharArray()){
            if (c=='e'){
                System.out.println("e is Present");
            }
        }
        
    }
}