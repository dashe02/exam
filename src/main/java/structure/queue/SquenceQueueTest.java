package structure.queue;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午2:57
 * To change this template use File | Settings | File Templates.
 */
public class SquenceQueueTest {
    public static void main(String[] args){
        SequenceQueue<String> sequenceQueue=new SequenceQueue<String>();
        sequenceQueue.add("1");
        sequenceQueue.add("2");
        sequenceQueue.add("3");
        System.out.println(sequenceQueue.toString());
    }
}
