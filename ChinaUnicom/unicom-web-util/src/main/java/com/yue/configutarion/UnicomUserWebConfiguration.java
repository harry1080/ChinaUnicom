/**
 * 
 */
package com.yue.configutarion;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import com.yue.converter.StringToDateConverter;

/**
 * @author 流星紫蝶雨 2019年2月22日
 */
@Configuration
public class UnicomUserWebConfiguration {
	@Autowired
	private RequestMappingHandlerAdapter handerAdapter;
	
	
	@PostConstruct
	public void addConverter() {
		ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handerAdapter.getWebBindingInitializer();
		if (initializer.getConversionService() != null) {
			GenericConversionService generic = (GenericConversionService) initializer.getConversionService();
			//添加自定义类型转换器
			generic.addConverter(new StringToDateConverter());
		}
	}

}
