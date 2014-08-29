package mianshibaodian;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-26
 * Time: 上午11:06
 * To change this template use File | Settings | File Templates.
 */
public class GetSushu {
    public static void getSuShu(int n){
        int a[]=new int[101],i,j,k;
        for(i=1;i<100;i++){
            k=(int)Math.sqrt(i);
            for(j=2;j<=k;j++){
                if(i%j==0)
                   break;
            }
            if(j>k){
                System.out.println(" "+i);
            }
        }
    }
    public static void main(String[] args){
        getSuShu(100);
    }
}
