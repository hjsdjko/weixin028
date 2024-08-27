package com.cl.entity.view;

import com.cl.entity.LvyougonglveEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 旅游攻略
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@TableName("lvyougonglve")
public class LvyougonglveView  extends LvyougonglveEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyougonglveView(){
	}
 
 	public LvyougonglveView(LvyougonglveEntity lvyougonglveEntity){
 	try {
			BeanUtils.copyProperties(this, lvyougonglveEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
