//6. Write down the names of 10 of your friends in an array
//and then sort those in alphabetically ascending order.(HINT :
//USE the compareTo methid of String)
import java.util.Arrays;
public class p06 {
	public static void main(String[] args) {
		String arr[]= {"Madhav","Vardan","Sudeep","Rohan","Guru"};
		
		Arrays.sort(arr, (a, b) -> b.compareTo(a));

		
		System.out.print(Arrays.toString(arr));
	}
}