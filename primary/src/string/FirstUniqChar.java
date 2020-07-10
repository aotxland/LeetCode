package string;


/**
 * @author AoTxLand
 * @date 2020-05-17 10:04
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] list = new int[26];
        for(int i = 0; i < s.length(); i++){
            int i1 = list[s.charAt(i) - 'a'];
            if(i1 != 0) {
                i1 = -2;
            }
            else {
                if(i != 0) i1 = i;
                else i1 = -1;
            }
            list[s.charAt(i) - 'a'] = i1;
        }
        int charAt = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            if (list[i] < charAt && list[i] != -2 && list[i] != 0)
                charAt = list[i];
        }
        if(charAt == -1) return 0;
       if(charAt < Integer.MAX_VALUE) return charAt;
       return -1;
    }

    public static void main(String[] args) {
        FirstUniqChar fu = new FirstUniqChar();
        int uniqChar = fu.firstUniqChar("leetcode");
        System.out.println(uniqChar);
    }
}
