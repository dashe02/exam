package algorithm.exist.structure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午8:37
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args){
        ArrayStack<String> stack=new ArrayStack<String>();
        stack.push("g");
        stack.push("a");
        stack.push("f");
        stack.push("r");
        stack.push("e");
        stack.push("c");
        System.out.println(stack.toString());
    }
}
