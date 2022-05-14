/*Given a string, find the length of the longest substring without repeating characters.*/
import java.util.*;
public class LongestSubString{
    static void longestSubString(String str){
        int i = 0 , j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(i<str.length() && j<str.length()){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                j++;
                max = Math.max(max, j-i);
            }
            else{
                set.remove(str.charAt(i));
                i++;
            }
        }
        System.out.print(max);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        longestSubString(str);
    }
}