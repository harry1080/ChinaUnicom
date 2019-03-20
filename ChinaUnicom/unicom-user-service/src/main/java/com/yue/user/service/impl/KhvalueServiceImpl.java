/**
 * 
 */
package com.yue.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.yue.pojo.Khvalue;
import com.yue.service.KhvalueService;
import com.yue.user.mapper.KhvalueMapper;

/**
 * @author 流星紫蝶雨
 *	2019年2月16日
 */
@Service
public class KhvalueServiceImpl implements KhvalueService{
	@Autowired
	private KhvalueMapper khvalueMapper;
	public List<Khvalue> selectKhvalueAll(){
		return khvalueMapper.selectKhvalueAll();
	}
}
