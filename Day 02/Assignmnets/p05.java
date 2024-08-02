//Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, 
//write two programs to swap the values of the two variables.
//A - first program by using a third variable
//B - second program without using any third variable


public class p05 {
    static int a = 6;
    static int b = 8;

    static void swap_w(){
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }


    static void swap(){
        int c = b;
        b = a;
        a = c;
        System.out.println(a);
        System.out.println(b);
    }
  
    public static void main(String[] args) {
        swap();
        swap_w();
    }
}
