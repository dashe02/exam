package structure.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午3:12
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

    void add(T t);

    T remove();

    int size();

    boolean isEmpty();

    T front();

}
