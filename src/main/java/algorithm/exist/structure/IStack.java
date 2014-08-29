package algorithm.exist.structure;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-20
 * Time: 下午8:26
 * To change this template use File | Settings | File Templates.
 */
public interface IStack<T> {

    boolean isEmpty();

    boolean push(T data);

    int size();

    T pop();

    T peek();

    int search(T t);

}
