package org.java.test.annotation;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-27
 * Time: 下午8:52
 * To change this template use File | Settings | File Templates.
 */
public class TestClass {
    public TestClass(){

    }
    @id
    private String testClassId;

    private String name;

    public String getTestClassId() {
        return testClassId;
    }

    public void setTestClassId(String testClassId) {
        this.testClassId = testClassId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
