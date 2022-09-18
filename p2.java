import java.lang.reflect.Array;
import java.util.ArrayList;

public class p2 {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int maxnum=0;
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        int lastend=end[0];
        maxnum=1;
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxnum++;
                ans.add(i);
                lastend=end[i];
            }
        }
        System.out.println("the maximum number is:"+maxnum);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();

    }
}
