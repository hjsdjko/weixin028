package com.cl.dao;

import com.cl.entity.MeishipaimingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MeishipaimingView;


/**
 * 美食排名
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface MeishipaimingDao extends BaseMapper<MeishipaimingEntity> {
	
	List<MeishipaimingView> selectListView(@Param("ew") Wrapper<MeishipaimingEntity> wrapper);

	List<MeishipaimingView> selectListView(Pagination page,@Param("ew") Wrapper<MeishipaimingEntity> wrapper);
	
	MeishipaimingView selectView(@Param("ew") Wrapper<MeishipaimingEntity> wrapper);
	

}
