package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 特色美食
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@TableName("tesemeishi")
public class TesemeishiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TesemeishiEntity() {
		
	}
	
	public TesemeishiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 美食名称
	 */
					
	private String meishimingcheng;
	
	/**
	 * 美食图片
	 */
					
	private String meishitupian;
	
	/**
	 * 推荐指数
	 */
					
	private String tuijianzhishu;
	
	/**
	 * 人均消费
	 */
					
	private String renjunxiaofei;
	
	/**
	 * 打卡地点
	 */
					
	private String dakadidian;
	
	/**
	 * 美食介绍
	 */
					
	private String meishijieshao;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：美食名称
	 */
	public void setMeishimingcheng(String meishimingcheng) {
		this.meishimingcheng = meishimingcheng;
	}
	/**
	 * 获取：美食名称
	 */
	public String getMeishimingcheng() {
		return meishimingcheng;
	}
	/**
	 * 设置：美食图片
	 */
	public void setMeishitupian(String meishitupian) {
		this.meishitupian = meishitupian;
	}
	/**
	 * 获取：美食图片
	 */
	public String getMeishitupian() {
		return meishitupian;
	}
	/**
	 * 设置：推荐指数
	 */
	public void setTuijianzhishu(String tuijianzhishu) {
		this.tuijianzhishu = tuijianzhishu;
	}
	/**
	 * 获取：推荐指数
	 */
	public String getTuijianzhishu() {
		return tuijianzhishu;
	}
	/**
	 * 设置：人均消费
	 */
	public void setRenjunxiaofei(String renjunxiaofei) {
		this.renjunxiaofei = renjunxiaofei;
	}
	/**
	 * 获取：人均消费
	 */
	public String getRenjunxiaofei() {
		return renjunxiaofei;
	}
	/**
	 * 设置：打卡地点
	 */
	public void setDakadidian(String dakadidian) {
		this.dakadidian = dakadidian;
	}
	/**
	 * 获取：打卡地点
	 */
	public String getDakadidian() {
		return dakadidian;
	}
	/**
	 * 设置：美食介绍
	 */
	public void setMeishijieshao(String meishijieshao) {
		this.meishijieshao = meishijieshao;
	}
	/**
	 * 获取：美食介绍
	 */
	public String getMeishijieshao() {
		return meishijieshao;
	}

}
