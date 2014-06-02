package org.java.test.Composite;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-5
 * Time: 下午2:05
 * To change this template use File | Settings | File Templates.
 */
public  interface IFile {
    IFile getComposite();

    void sampleOperation();

    int getDeep();

    void setDeep(int x);
}
