package com.cl.dao;

import com.cl.entity.TesemeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TesemeishiView;


/**
 * 特色美食
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface TesemeishiDao extends BaseMapper<TesemeishiEntity> {
	
	List<TesemeishiView> selectListView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);

	List<TesemeishiView> selectListView(Pagination page,@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	
	TesemeishiView selectView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
	

}
