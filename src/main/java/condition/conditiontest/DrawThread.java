package condition.conditiontest;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-23
 * Time: 下午4:56
 * To change this template use File | Settings | File Templates.
 */
public class DrawThread extends Thread{
    private MyCount myCount;
    private String name;
    private int x;
    public DrawThread(MyCount myCount,String name,int x){
        this.myCount=myCount;
        this.name=name;
        this.x=x;
    }
    public void run(){
        myCount.drawing(x,name);
    }
}
