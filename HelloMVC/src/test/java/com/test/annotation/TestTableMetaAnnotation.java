package com.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import com.venture.annotation.Table;
import com.venture.entity.Apple;

@Table
public class TestTableMetaAnnotation {
	public void name() {
		System.out.println();
	}
	public static void main(String[] args) {
		Class class1=Apple.class;
		Field[] fields=class1.getDeclaredFields();
		for (Field field : fields) {
			if(field.isAnnotationPresent(Table.class)){
				Table a= (Table)field.getAnnotation(Table.class);
				System.err.println(a.tableName());
			}
		}
		
		Table table=(Table)class1.getAnnotation(Table.class);
		System.err.println(table.tableName());

	}
}
