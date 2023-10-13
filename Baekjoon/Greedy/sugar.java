import java.util.*;

public class sugar {
    public static int main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int count=0;
        int sugar=scan.nextInt();

        if(sugar>5)
        {
            count=sugar/5;
            sugar=sugar%5;
        }
        else
        {
            count=count+2;
        }

        return count;
    }
}