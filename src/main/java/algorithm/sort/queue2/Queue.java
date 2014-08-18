package algorithm.sort.queue2;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-18
 * Time: 上午8:45
 * To change this template use File | Settings | File Templates.
 */
public interface Queue<T> {

    void add(T t);

    boolean isEmpty();

    T remove();

    T front();

    boolean isFull();

    int size();

}
