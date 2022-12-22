// Time Complexity : O(log(n)) --log to the base 2
// Space Complexity :O(log(n)) --recursive stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//50. Pow(x, n)

class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        double result = myPow(x, n / 2);
        if (n % 2 == 0){
            return result * result;
        }
        else{
            if(n > 0){
                return result * result * x;
            }
            else{
                return result * result * 1 / x;
            }
        }
    }
}