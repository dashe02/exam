package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:02
 * To change this template use File | Settings | File Templates.
 */
public class GetSum {
    //输入n，然后输出从1到n的所有数
    public static void putSum(int n){
        String max="1";
        for(int i=1;i<=n;i++){
            max+="0" ;
        }
        int maxNum=Integer.parseInt(max);
        for(int i=1;i<maxNum;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
          putSum(3);
    }
}
