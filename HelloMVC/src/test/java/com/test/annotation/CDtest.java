package com.test.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.venture.api.CompactDisc;
import com.venture.config.SpringConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringConfig.class)
public class CDtest {
//SpringJUnit4ClassRunner �ڲ��Կ�ʼ��ʱ���Զ�����Spring��Ӧ��������
//@ContextConfiguration���������Ҫ��SpringConfig�м�������
	@Autowired
	private CompactDisc cDisc;
	@Test
	public void TestA(){
		cDisc.play();
	}
}
