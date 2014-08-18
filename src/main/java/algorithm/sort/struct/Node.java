package algorithm.sort.struct;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-15
 * Time: 下午7:34
 * To change this template use File | Settings | File Templates.
 */
public class Node {

      private Node next;

      private String value;

    public Node(String value){
        this.value=value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return value;
    }

    public static void main(String[] args){
        Node head=new Node("a");
        Node node1=new Node("b");
        Node node2=new Node("c");
        Node node3=new Node("d");
        Node node4=new Node("e");
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        for(Node node=head;node!=null;node=node.next){
            System.out.println(node.value);
        }
    }

}
