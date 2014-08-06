package org.java.annotion.test1;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午9:16
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {
    @id
    private int testClassId;

    private String name;

    public int getTestClassId() {
        return testClassId;
    }

    public void setTestClassId(int testClassId) {
        this.testClassId = testClassId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
