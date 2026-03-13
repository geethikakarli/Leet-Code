class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        long l = 1, r = (long)1e18, ans = r;

        while (l <= r) {
            long mid = (l + r) / 2;
            long total = 0;

            for (int t : workerTimes) {
                long k = mid / t;
                long x = (long)((Math.sqrt(1 + 8.0 * k) - 1) / 2);
                total += x;
                if (total >= mountainHeight) break;
            }

            if (total >= mountainHeight) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return ans;
    }
}