import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HIndex {
    public static void main(String[] args){
        int[] c={0,5,6,7,8};
        System.out.println(solution(c));
    }

    static int solution(int[] citations){
        int answer=citations.length;
        Integer[] ci=new Integer[citations.length];
        for(int i=0;i<ci.length;i++) ci[i]=citations[i];

        Arrays.sort(ci, Collections.reverseOrder());

        for(int i=0;i<ci.length;i++){
            if((i+1)<=ci[i]) {
                answer=i+1;
            }
        }

        return answer;
    }
}
