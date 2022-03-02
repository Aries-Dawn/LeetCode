public class P6011 {
    public int minimumFinishTime(int[][] tires, int changeTime, int numLaps) {
        int n = tires.length;
        long[] avg = new long[n];
        long[] count_collection = new long[n];
        long[] sum_collection = new long[n];
        long min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int[] tire = tires[i];
            int f = tire[0], r = tire[1];
            long count = 0, sum = 0;
            long cost = f;
            while (cost < f + changeTime) {
                count += 1;
                sum += cost;
                cost = f * (long) Math.pow(r, count);
            }
            avg[i] = (sum + changeTime) / count;
            count_collection[i] = count;
            sum_collection[i] = sum;
            if (avg[i] < min) {
                min = avg[i];
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(count_collection[index]);
        int whole = numLaps / (int) count_collection[index];
        int remain = numLaps % (int) count_collection[index];
        int ans = whole*(int)(sum_collection[index]+changeTime);
        if (remain==0) {
            ans -= changeTime;
            return ans;
        }
        min = Integer.MAX_VALUE;
        for (int[] tire : tires){
            int sum=0;
            int f = tire[0],r = tire[1];
            for (int i = 0; i < remain;i++){
                sum+=f * (long) Math.pow(r, i);
            }
            if (sum<min) min=sum;
        }
        return ans+(int)min;
    }
}
