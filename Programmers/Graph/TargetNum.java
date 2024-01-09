public class TargetNum {
    public static void main(String[] args) {
        int[] n = {1, 1, 1, 1, 1};
        System.out.println(solution(n, 3));
    }

    static int result = 0;

    static int solution(int[] numbers, int target) {
        mul(numbers, 0, target, 0);

        return result;
    }

    static void mul(int[] numbers, int sum, int target, int start) {
        if (start == numbers.length) {
            if (sum == target) result++;
            return;
        }

        mul(numbers, sum + numbers[start], target, start + 1);
        mul(numbers, sum + (numbers[start] * -1), target, start + 1);
    }
}
