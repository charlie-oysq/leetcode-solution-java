class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int wealth : account) {
                totalWealth += wealth;
            }

            ans = Math.max(ans, totalWealth);
        }

        return ans;
    }
}
