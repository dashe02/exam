package algorithm.sort;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午2:32
 * To change this template use File | Settings | File Templates.
 */
public class Test1 {
    public static int test(){
        try{
             return 0;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return  1;
        }
    }
    public static void main(String[] args){
        System.out.println(test());
    }
}
