import java.util.Arrays;

public class P6010 {
    public long minimumTime(int[] time, int totalTrips) {
        Arrays.sort(time);
        long max = (long) totalTrips * time[0];
        long sum = 0;
        long lo = 0, hi = max;
        long mid = max;
        long result = max;
        boolean br = false;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            sum = 0;
            for (int t : time) sum += mid / t;
            if (sum == totalTrips) {
                br = true;
                break;
            } else if (sum < totalTrips) lo = mid + 1;
            else {
                if (result > mid) result = mid;
                hi = mid - 1;
            }
        }
        long ans = mid;
        if (br) ans = result;
        while (sum == totalTrips) {
            ans = mid;
            --mid;
            sum = 0;
            for (int t : time) sum += mid / t;
        }
        return ans;
    }
}
