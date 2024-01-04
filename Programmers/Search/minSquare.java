public class minSquare {
    public static void main(String[] args){
        int[][] sizes={{10,7},{12,3},{8,15},{14,7},{7,11}};
        System.out.println(solution(sizes));
    }

    static int solution(int[][] sizes){
        int answer=0;
        int aMax=Integer.MIN_VALUE;
        int bMax=Integer.MIN_VALUE;

        for(int i=0;i<sizes.length;i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp=sizes[i][0];
                sizes[i][0]=sizes[i][1];
                sizes[i][1]=temp;
            }
        }

        for(int i=0;i<sizes.length;i++){
            aMax=Math.max(aMax,sizes[i][0]);
            bMax=Math.max(bMax,sizes[i][1]);
        }

        return aMax*bMax;
    }
}
