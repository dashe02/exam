package algorithm.sort.stack1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:47
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        ArrayStack<String> stack=new ArrayStack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.pop();
        stack.push("e");
        System.out.println(stack.toString());
    }
}
