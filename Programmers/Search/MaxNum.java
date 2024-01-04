import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {
    public static void main(String[] args){
        int[] numbers={3,30,34,5,9};
        System.out.println(solution(numbers));
    }

    static String solution(int[] numbers){
        String answer = "";
        String[] numStr=new String[numbers.length];

        for(int i=0;i<numbers.length;i++){
            numStr[i]=String.valueOf(numbers[i]);
        }

        Arrays.sort(numStr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });

        if(numStr[0].equals("0")) return "0";

        for(int i=0;i<numStr.length;i++) answer+=numStr[i];

        return answer;
    }
}
