package exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-9
 * Time: 上午10:24
 * To change this template use File | Settings | File Templates.
 */
public class GetSuShu {
    public static void getSuShu(int n){
        System.out.println("1"+"");
        int i,j;
        for(i=2;i<n;i++){
        int m=0;
         for(j=2;j<i;j++){
             if(i%j==0){
                 m++;
             }
         }
            if(m<1){
                System.out.println(i+"");
            }
        }
    }
    public static void main(String[] args){
        getSuShu(100);
    }
}
