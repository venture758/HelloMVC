package com.venture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) 
public @interface Table {
	/**
     * ���ݱ�����ע�⣬Ĭ��ֵΪ������
     * @return
     */
    public String tableName() default "className";
}
