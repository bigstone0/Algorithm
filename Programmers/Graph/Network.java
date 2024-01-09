import java.util.LinkedList;
import java.util.Queue;

public class Network {
    static Queue<Integer> q=new LinkedList<>();
    static boolean[] check;

    public static void main(String[] args){
        int[][] com={{1,1,0},{1,1,1},{0,1,1}};

        System.out.println(solution(3,com));
    }

    static int solution(int n, int[][] computers){
        check=new boolean[n];
        int answer=0;

        for(int i=0;i<n;i++){
            if(!check[i]) {
                q.offer(i);
                check[i]=true;
                bfs(computers,n);
                answer++;
            }
        }

        return answer;
    }

    static void bfs(int[][] com,int n){
        while(!q.isEmpty()){
            int num=q.poll();
            for(int i=0;i<n;i++){
                if(com[num][i]==1&&!check[i]){
                    q.offer(i);
                    check[i]=true;
                }
            }
        }
    }
}
