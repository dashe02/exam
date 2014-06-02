package org.java.test.annotation.jdbcdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * User: ThinkPad
 * Date: 14-5-28
 * Time: 上午11:40
 * To change this template use File | Settings | File Templates.
 */
@Target({ElementType.FIELD})
public @interface MyAnnotation {
}
