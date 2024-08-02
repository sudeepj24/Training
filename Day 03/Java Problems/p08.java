// A three digit number is called Armstrong number if sum of cube of its digit 
//is equal to number itself.
//E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
//Write all Armstrong numbers between 100 to 500.

public class p08{
    public static boolean Armstrong(int num)
    {
        int sum = 0;
        int check = num;
        for(int i=0; i<=2; i++){
            sum = sum + ((num%10)*(num%10)*(num%10));
            num = num/10;
        }
        if(sum == check){
            return true;
        }

        return false;
    }

    public static void arm()
    {
        for(int i=100; i<= 500;i++){
            if(Armstrong(i)==true){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        arm();
    }
}