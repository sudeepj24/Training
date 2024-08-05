import java.util.*;

public class remove_duplicates {
    
    public static void remove_Duplicates(String s){
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for( char c : s.toCharArray()){
            if(set.add(c) == true){
                System.out.print(c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        remove_Duplicates(str);
        sc.close();

    }
}
