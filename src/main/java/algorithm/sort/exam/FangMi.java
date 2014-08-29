package algorithm.sort.exam;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-19
 * Time: 下午7:42
 * To change this template use File | Settings | File Templates.
 */
public class FangMi {
    public static double getFangMi(double base,int exponent){
            double mul=1;
            for(int i=0;i<exponent;i++){
                 mul*=base;
             }
             return mul;
    }
    public static void main(String[] args){
        double base=2.0;
        int exponent=3;
        System.out.println(getFangMi(base,exponent));
    }
}
