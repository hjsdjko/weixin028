package com.cl.entity.view;

import com.cl.entity.DiscusslvyougonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 旅游攻略评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@TableName("discusslvyougonglve")
public class DiscusslvyougonglveView  extends DiscusslvyougonglveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvyougonglveView(){
	}
 
 	public DiscusslvyougonglveView(DiscusslvyougonglveEntity discusslvyougonglveEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvyougonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
