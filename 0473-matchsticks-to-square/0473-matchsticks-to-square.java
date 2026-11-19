
class Solution {

    boolean solve(int i, int target, int s1, int s2,
                  int s3, int s4, int[] arr) {

        if(i == arr.length) {
            return s1 == target && s2 == target &&
                   s3 == target && s4 == target;
        }

        int x = arr[i];

        if(s1 + x <= target) {
            if(solve(i+1, target, s1+x, s2, s3, s4, arr))
                return true;
        }

        if(s2 != s1 && s2+x <= target) {
            if(solve(i+1, target, s1, s2+x, s3, s4, arr))
                return true;
        }

        if(s3 != s1 && s3 != s2 && s3+x <= target) {
            if(solve(i+1, target, s1, s2, s3+x, s4, arr))
                return true;
        }

        if(s4 != s1 && s4 != s2 && s4 != s3 &&
           s4+x <= target) {
            if(solve(i+1, target, s1, s2, s3, s4+x, arr))
                return true;
        }

        return false;
    }

    public boolean makesquare(int[] arr) {

        if(arr.length < 4) return false;

        int t = 0;
        for(int x : arr) t += x;

        if(t % 4 != 0) return false;

        int target = t/4;

        Arrays.sort(arr);

        for(int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        if(arr[0] > target) return false;

        return solve(0, target, 0, 0, 0, 0, arr);
    }
}
