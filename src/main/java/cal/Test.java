package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-10
 * Time: 上午10:36
 * To change this template use File | Settings | File Templates.
 */
public class Test implements ITest{
    private static int N1=10000000;
    private static int N2=1000;
    static int[] a=new int[N1];
    static int[] b=new int[N2];
    public  void method1()
    {
        int i,j;
        for(i=0;i<N1;i++){
            for(j=0;j<N2;j++){
                b[j]++;
            }
        }
    }
    public  void method2(){
           int i,j;
        for(j=0;j<N2;j++){
            for(i=0;i<N1;i++){
                a[i]++;
            }
        }
    }
    public static void main(String[] args){
      /* ITest t=new Test();
       TestProxy proxy=new TestProxy();
       ITest i=(ITest)proxy.bind(t);
       i.method1();*/
        short a=128;
        byte b=(byte)a;
        System.out.println(a+","+b);
    }
}
