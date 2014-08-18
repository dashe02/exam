package algorithm.sort.yanjiu;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-16
 * Time: 下午6:20
 * To change this template use File | Settings | File Templates.
 */
public class ClassLoaderTest {
    public static void main(String[] args){
        try{
           Test o=(Test)ClassLoader.getSystemClassLoader().loadClass(("algorithm.sort.yanjiu.Test")).newInstance();
           o.test();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
