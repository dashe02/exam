package structure.tree;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-29
 * Time: 下午6:15
 * To change this template use File | Settings | File Templates.
 */
public class MyTreeClient {
    public static void main(String[] args){
        Node<String> root=new Node<String>("A",-1);
        MyTree<String> tree=new MyTree<String>(root);
        Node<String> b=new Node<String>("B");
        Node<String> c=new Node<String>("C");
        Node<String> d=new Node<String>("D");
        Node<String> e=new Node<String>("E");
        Node<String> f=new Node<String>("F");
        Node<String> g=new Node<String>("G");
        tree.add(b,root);
        tree.add(c,root);
        tree.add(d,root);
        tree.add(e,b);
        tree.add(f,b);
        tree.add(g,f);
        System.out.println(tree.getSize());
        System.out.println(tree.getRoot().getData());
        System.out.println(tree.getAllNodes());
        System.out.println(tree.getDepth());
        tree.add(new Node<String>("H"),g);
        System.out.println(tree.getDepth());
        tree.enlarge();
    }
}
