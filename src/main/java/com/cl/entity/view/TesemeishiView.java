package com.cl.entity.view;

import com.cl.entity.TesemeishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 特色美食
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@TableName("tesemeishi")
public class TesemeishiView  extends TesemeishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TesemeishiView(){
	}
 
 	public TesemeishiView(TesemeishiEntity tesemeishiEntity){
 	try {
			BeanUtils.copyProperties(this, tesemeishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
