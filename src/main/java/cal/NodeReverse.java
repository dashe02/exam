package cal;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-12
 * Time: 上午12:12
 * To change this template use File | Settings | File Templates.
 */
public class NodeReverse {
    /*
    * 单项链表顺序反转
    */
    class Node{
        int i;
        Node next;
    }
    public static void reverse(Node l){
        if(l==null) return;
        Node p=null,q=l,r=l.next;
        while(r!=null){
            q.next=p;
            p=q;
            q=r;
            r=r.next;
        }
          q.next=p;
          l=q;
    }
}
