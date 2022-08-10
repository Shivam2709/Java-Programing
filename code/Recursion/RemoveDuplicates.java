//QS. Remove duplicate in a string..!!
// Time complexity = O(n)

package Recursion;

public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];

    public static void duplicate(String str, int idx, String newString) {

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            duplicate(str, idx +1, newString);
        }else{
            newString += currChar;
            map[currChar -'a'] = true;
            duplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abcdad";
        duplicate(str, 0,"");

    }

}
