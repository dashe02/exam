package algorithm;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-8-13
 * Time: 下午9:00
 * To change this template use File | Settings | File Templates.
 */
public class NodeTest {
      private NodeTest  next;
      private String value;

    public NodeTest(String value){
        this.value=value;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodeTest getNext() {
        return next;
    }

    public void setNext(NodeTest next) {
        this.next = next;
    }

    public String toString(){
        return value;
    }
    public static void main(String[] args){
        NodeTest head=new NodeTest("aa");
        NodeTest node1=new NodeTest("bb");
        NodeTest node2=new NodeTest("cc");
        NodeTest node3=new NodeTest("dd");
        NodeTest node4=new NodeTest("ee");
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        for(NodeTest node=head;node!=null;node=node.next){
            System.out.println(node.value);
        }
    }
}
