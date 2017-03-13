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
//SpringJUnit4ClassRunner 在测试开始的时候自动创建Spring的应用上下文
//@ContextConfiguration会告诉它需要在SpringConfig中加载配置
	@Autowired
	private CompactDisc cDisc;
	@Test
	public void TestA(){
		cDisc.play();
	}
}
