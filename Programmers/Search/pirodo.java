public class pirodo {
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        System.out.println(solution(k, dungeons));
    }

    static int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] check = new boolean[dungeons.length];

        go(dungeons, check, 0, k);

        return result;
    }

    static void go(int[][] dun, boolean[] check, int count, int k) {
        for (int i = 0; i < dun.length; i++) {
            if (!check[i]) {
                if (dun[i][0] <= k) {
                    check[i] = true;
                    go(dun, check, count + 1, k - dun[i][1]);
                    check[i] = false;
                }
            }
        }

        result = Math.max(result, count);
    }
}
