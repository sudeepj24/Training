//Write a program to add 8 to the number 2345 and then divide it by 3. 
//Now, the modulus of the quotient is taken with 5 and then multiply the resultant value 
//by 5. Display the final result.

public class p03 {
    public static void sample(){
        int num = (((8 + 2345)/3)%5)*5;
        System.out.println(num);
    }

    public static void main(String[] args) {
        sample();
    }
    
}
