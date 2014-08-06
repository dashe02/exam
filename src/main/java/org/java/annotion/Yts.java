package org.java.annotion;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-7-30
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
@Documented
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Yts {
    public enum YtsType{util,entity,service,model}
    public YtsType classType() default YtsType.util;
}
