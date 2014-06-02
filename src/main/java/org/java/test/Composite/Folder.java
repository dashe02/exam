package org.java.test.Composite;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午2:07
 * To change this template use File | Settings | File Templates.
 */
public class Folder implements IFile{
    private String name;

    private int deep;

    private Vector<IFile> componentVector=new Vector<IFile>();

    public Folder(String name){
        this.name=name;
    }
    public IFile getComposite(){
        return this;
    }
    public void sampleOperation(){
        System.out.println("执行了某个商业方法!");
    }
    public void add(IFile IFile){
        componentVector.addElement(IFile);
        IFile.setDeep(this.deep+1);
    }
    public void remove(IFile IFile){
        componentVector.removeElement(IFile);
    }
    public Vector getAllComponent(){
        return componentVector;
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
