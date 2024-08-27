package com.cl.dao;

import com.cl.entity.DiscusstesemeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstesemeishiView;


/**
 * 特色美食评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:29
 */
public interface DiscusstesemeishiDao extends BaseMapper<DiscusstesemeishiEntity> {
	
	List<DiscusstesemeishiView> selectListView(@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);

	List<DiscusstesemeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);
	
	DiscusstesemeishiView selectView(@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);
	

}
