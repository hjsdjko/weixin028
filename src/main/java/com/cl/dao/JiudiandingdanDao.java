package com.cl.dao;

import com.cl.entity.JiudiandingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudiandingdanView;


/**
 * 酒店订单
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiudiandingdanDao extends BaseMapper<JiudiandingdanEntity> {
	
	List<JiudiandingdanView> selectListView(@Param("ew") Wrapper<JiudiandingdanEntity> wrapper);

	List<JiudiandingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiandingdanEntity> wrapper);
	
	JiudiandingdanView selectView(@Param("ew") Wrapper<JiudiandingdanEntity> wrapper);
	

}
