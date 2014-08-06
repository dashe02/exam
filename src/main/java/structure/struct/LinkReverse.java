package structure.struct;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-29
 * Time: 下午8:32
 * To change this template use File | Settings | File Templates.
 */
public class LinkReverse {
   private Node head=null;

   private int size;

   private Node tempnode=null;

   private Node lastnode=null;

   private Node node=null;

   private Node node2=null;

   private int temp;

   public LinkReverse(Node head,int size){
       this.head=head;
       this.size=size;
       this.reverse(this.head);
   }
   private void reverse(Node head2){
       System.out.println("反转后的结果:");
       while(node!=null){
           node2=node.next;
           while(node2!=null){
               temp=node.obj;
               node.obj=node2.obj;
               node2.obj=temp;
               node2=node2.next;
           }
           node=node.next;
       }
       node=head;
       while(node!=null){
           System.out.println(node.obj + " ");
           node=node.next;
       }
       System.out.println();
   }
   public static void main(String[] args){

   }



}
