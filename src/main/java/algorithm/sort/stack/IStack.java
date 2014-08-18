package algorithm.sort.stack;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 上午9:58
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

    public int length();

    public boolean push(T data);

    public T peek();

    public T pop();

    public boolean isEmpty();

    public int search(T t);

}
