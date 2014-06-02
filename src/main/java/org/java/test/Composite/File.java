package org.java.test.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午2:15
 * To change this template use File | Settings | File Templates.
 */
public class File implements IFile{

    private String name;

    private int deep;

    public File(String name){
        this.name=name;
    }
    public IFile getComposite(){
         return this;
    }
    public void sampleOperation(){
        System.out.println("执行了某个商业方法!");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getDeep(){
        return deep;
    }
    public void setDeep(int deep){
        this.deep=deep;
    }




}
