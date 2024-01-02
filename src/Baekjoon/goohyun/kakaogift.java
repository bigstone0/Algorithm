import java.util.*;

class kakaogift {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends,gifts));
    }

    static int[][] giftNum;
    static int[][] giftJisu;
    static ArrayList<String> f=new ArrayList<>();

    static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        giftNum=new int[friends.length][friends.length];
        giftJisu=new int[friends.length][3];
        String[] giftSend=new String[2];

        for(int i=0;i< friends.length;i++){
            f.add(friends[i]);
        }


        for(int i=0;i<gifts.length;i++){
            giftSend=gifts[i].split(" ");
            giftNum[f.indexOf(giftSend[0])][f.indexOf(giftSend[1])]++;
            giftJisu[f.indexOf(giftSend[0])][0]++;
            giftJisu[f.indexOf(giftSend[1])][1]++;
        }

        for(int i=0;i<giftJisu.length;i++){
            giftJisu[i][2]=giftJisu[i][0]-giftJisu[i][1];
        }

        for(int i=0;i< giftNum.length;i++){
            int count=0;
            for(int j=0;j<giftNum[0].length;j++){
                if(i!=j){
                    if(giftNum[i][j]==giftNum[j][i]){
                        if(giftJisu[i][2]>giftJisu[j][2]) count++;
                    }

                    if(giftNum[i][j]>giftNum[j][i]) count++;
                }
            }
            if(answer<count) answer=count;
        }

        return answer;
    }
}
