package structure.test;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

    void add(T t);

    T remove();

    boolean isEmpty();

    T front();

    int size();
}
