import java.io.IOException;

// https://school.programmers.co.kr/learn/courses/30/lessons/42748?language=java
public class K_Number {
    public static void main(String[] args) throws IOException{
        int[] array={1,5,2,6,3,7,4};
        int[][] commands={{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Solution(array,commands));
    }

    static int[] Solution(int[] array,int [][] commands){
        int[] answer = new int[commands.length];
        int[] divide;
        for(int i=0;i<commands.length;i++){
            divide=new int[commands[i][1]-commands[i][0]+1];
            int count=0;
            for(int j=commands[i][0]-1;j<commands[i][1];j++){
                divide[count]=array[j];
                count++;
            }
            answer[i]=divide[commands[i][2]-1];
        }
        return answer;
    }

    static int[] sort(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        return array;
    }
}
