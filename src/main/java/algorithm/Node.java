package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午8:46
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    private Node next;
    private String value;

    public Node(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public String toString(){
        return value;
    }
    private static void test(Node head){
       if(head!=null){
           Node node=head.next;
           if(node!=null){
               test(node);
               node.next=head;
           }
       }
    }
    public static void main(String[] args){
        Node head=new Node("aa");
        Node node1=new Node("bb");
        Node node2=new Node("cc");
        Node node3=new Node("dd");
        Node node4=new Node("ee");
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        test(head);
        head.next=null;
        while(node4!=null){
            System.out.println(node4);
            node4=node4.next;
            if(node4!=null){
                System.out.println("->");
            }
        }
    }
}
