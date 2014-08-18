package algorithm.sort.stack1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-17
 * Time: 下午9:36
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

     boolean isEmpty();

     int length();

     boolean push(T data);

     T peek();

     T pop();

    int search(T t);

}
