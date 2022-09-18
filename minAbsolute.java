import java.util.Arrays;

public class minAbsolute {
  public static void main(String[] args) {
    int A[]={1,4,7,8};
    int B[]={2,3,6,5};
    Arrays.sort(A);
    Arrays.sort(B);
    int minAbos=0;
    for(int i=0;i<A.length;i++){
        minAbos+= Math.abs(A[i]-B[i]);

    }
    System.out.println("the min absolute are: "+minAbos);
  }  
}
