import java.util.Arrays;
import java.util.Comparator;

import javax.swing.SpringLayout;

public class knapSack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[] ={60,100,120};
        int capacity=50;
        int ans=0;
        double ratio[][]= new double[value.length][2];
    for(int i=0;i<value.length;i++){
        ratio[i][0]=i;
        ratio[i][i]=(double)value[i]/weight[i];
    }
    //sorted form 2d array
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    int val=capacity;
    int finalvalue=0;
    for(int i=ratio.length-1;i>=0;i--){
     int indx=(int) ratio[i][0];
        if(val>=weight[indx]){
finalvalue+=value[indx];
val-=weight[indx];


        }
        else{
            finalvalue+=(ratio[i][1]*val);
            val=0;
            break;
        }
    }
System.out.println("the final value are"+finalvalue);
    }
}
