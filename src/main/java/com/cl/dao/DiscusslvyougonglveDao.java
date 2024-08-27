package com.cl.dao;

import com.cl.entity.DiscusslvyougonglveEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusslvyougonglveView;


/**
 * 旅游攻略评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface DiscusslvyougonglveDao extends BaseMapper<DiscusslvyougonglveEntity> {
	
	List<DiscusslvyougonglveView> selectListView(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);

	List<DiscusslvyougonglveView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	
	DiscusslvyougonglveView selectView(@Param("ew") Wrapper<DiscusslvyougonglveEntity> wrapper);
	

}
