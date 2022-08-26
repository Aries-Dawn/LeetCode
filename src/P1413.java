class P1413 {

    // This is the first answer
    public int minStartValue_A(int[] nums) {
        int min = 1;
        int sum = 0;
        for (int temp : nums) {
            sum += temp;
            if (min > sum) min = sum;
            // System.out.println(min)
        }
        if (min >= 0) return 1;
        else return -min + 1;
    }

    // This is the second answer
    public int minStartValue(int[] nums) {
        int ans = 1;
        int sum = ans;
        for (int temp : nums) {
            sum += temp;
            if (sum < 1) {
                ans += (1 - sum);
                sum = 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        P1413 p1413 = new P1413();
        int[] nums = {1,-2,-3};
        System.out.println(p1413.minStartValue(nums));
        System.out.println(p1413.minStartValue_A(nums));
    }
}