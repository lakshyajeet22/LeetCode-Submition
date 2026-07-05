class Solution {
    public String convert(String s, int row) {
        StringBuilder[] arr = new StringBuilder[row];
        int k = 0;

        if (row == 1)
            return s;
        if (row >= s.length())
            return s;
        for (int i = 0; i < row; i++) {
            arr[i] = new StringBuilder();
        }
        while (k < s.length()) {

            for (int i = 0; i < row; i++) {
                if (k >= s.length())
                    break;
                arr[i].append(s.charAt(k));
                k++;
                
            }
            for (int i = row - 2; i > 0; i--) {
                 if (k >= s.length())
                    break;
                arr[i].append(s.charAt(k));
                k++;
               
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder st : arr) {
            ans.append(st);
        }
        return ans.toString();
    }
}