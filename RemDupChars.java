// This java program removes any duplicate char from the given string and prints new string excluding all the duplicate characters
// Time space complexity of this program is o(n)

import java.util.*;
class RemDupChars {
    public static StringBuilder removeDups(String str, StringBuilder st, boolean[] map, int count){
        if(count==str.length()-1){
            return st;
        }
        if(map[str.charAt(count)-'a']==false){
            map[str.charAt(count)-'a'] = true;
            st.append(str.charAt(count));
        }
        return removeDups(str, st, map, count+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removeDups(str, new StringBuilder(), new boolean[26], 0));
        sc.close();
    }
}
