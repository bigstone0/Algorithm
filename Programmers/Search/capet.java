public class capet {
    public static void main(String[] args){
        int[] answer=solution(24,24);
        for(int i=0;i<answer.length;i++) System.out.println(answer[i]);
    }

    static int[] solution(int brown,int yellow){
        int[] answer=new int[2];

        for(int i=1;i<=yellow;i++){
            if((yellow%i)==0){
                if((yellow/i)<=i){
                    int result=((yellow/i)+2)*(i+2);
                    if(result==(brown+yellow)) {
                        answer[0]=i+2;
                        answer[1]=(yellow/i)+2;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
