package com.cl.entity.view;

import com.cl.entity.JiudiandingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 酒店订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@TableName("jiudiandingdan")
public class JiudiandingdanView  extends JiudiandingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiudiandingdanView(){
	}
 
 	public JiudiandingdanView(JiudiandingdanEntity jiudiandingdanEntity){
 	try {
			BeanUtils.copyProperties(this, jiudiandingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
