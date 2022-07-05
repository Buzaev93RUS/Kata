package Kata.Calculator;

public class LatinaCalc {
    String[] nums;
    public LatinaCalc (String[] latinArray) {
        nums = latinArray;
    }
    public int res() {
        int a = Integer.parseInt(nums[0]);
        int b = Integer.parseInt(nums[2]);
        int result = 0;
        if (Integer.parseInt(nums[0]) <= 10 && Integer.parseInt(nums[0]) >= 1 && Integer.parseInt(nums[2]) <= 10 && Integer.parseInt(nums[2]) >= 1) {
            if (nums[1].equals("+")) {
                System.out.println(result = a + b);
            } else if (nums[1].equals("-")) {
                System.out.println( result = a - b);
            } else if (nums[1].equals("*")) {
                System.out.println(result = a * b);
            } else if (nums[1].equals("/")) {
                System.out.println(result = a / b);
            }
        }
        return result;
    }
}
