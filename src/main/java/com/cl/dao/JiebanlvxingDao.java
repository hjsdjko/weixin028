package com.cl.dao;

import com.cl.entity.JiebanlvxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiebanlvxingView;


/**
 * 结伴旅行
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiebanlvxingDao extends BaseMapper<JiebanlvxingEntity> {
	
	List<JiebanlvxingView> selectListView(@Param("ew") Wrapper<JiebanlvxingEntity> wrapper);

	List<JiebanlvxingView> selectListView(Pagination page,@Param("ew") Wrapper<JiebanlvxingEntity> wrapper);
	
	JiebanlvxingView selectView(@Param("ew") Wrapper<JiebanlvxingEntity> wrapper);
	

}
