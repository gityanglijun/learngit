package com.neuedu.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
	
	public static void main(String[] args) throws Exception {
		/*generator();*/
		/*BrandExample example=new BrandExample();*/

	}
	@Test
	public void handler(){
		//PageHelper.startPage(2, 10);
	   
		/*for(int i=1;i<=200;i++){
			Brand brand=new Brand();
			brand.setName("小米"+i);
			brand.setLogo("logo"+i);
			brand.setSort(i);
			brand.setWebSite("http://www.mi.com"+i);
			brand.setCreateTime(new Date());
			brand.setIsDel(1);
			brandService.add(brand);
		}
		System.out.println("添加完成");*/
	}
	
	public static void generator() throws Exception{

	    List<String> warnings = new ArrayList<String>();
	    boolean overwrite = true;
	    //指定逆向工程配置文件
	    File configFile = new File(System.getProperty("user.dir")+"/src/test/resources/mybatis.xml");
	   ConfigurationParser cp = new ConfigurationParser(warnings);
	    Configuration config = cp.parseConfiguration(configFile);
	    DefaultShellCallback callback = new DefaultShellCallback(overwrite);
	    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
	            callback, warnings);
	    myBatisGenerator.generate(null);
	    System.out.println("生成完成");
	} 
}
