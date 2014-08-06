package dailyTest.fifthDay;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-18
 * Time: 下午5:45
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        int[] a={1,4,3,2,7,0};
        ShellSort.shellSort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
