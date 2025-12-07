class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;   
        int i = 0;       

        while (i < n) {
            int j = i;

          
            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            
            chars[write] = chars[i];
            write++;

            int count = j - i;

           
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }

           
            i = j;
        }

        return write;   // new compressed length
    }
}
