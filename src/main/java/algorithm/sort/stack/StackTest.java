package algorithm.sort.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午11:13
 * To change this template use File | Settings | File Templates.
 */
public class StackTest {
    public static void main(String[] args){
        ArrayStack<String> stack=new ArrayStack<String>();
        stack.push("3");
        stack.push("1");
        stack.push("2");
        stack.push("4");
        System.out.println(stack.toString());
    }
}
