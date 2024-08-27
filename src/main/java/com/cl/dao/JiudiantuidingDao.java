package com.cl.dao;

import com.cl.entity.JiudiantuidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudiantuidingView;


/**
 * 酒店退订
 * 
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiudiantuidingDao extends BaseMapper<JiudiantuidingEntity> {
	
	List<JiudiantuidingView> selectListView(@Param("ew") Wrapper<JiudiantuidingEntity> wrapper);

	List<JiudiantuidingView> selectListView(Pagination page,@Param("ew") Wrapper<JiudiantuidingEntity> wrapper);
	
	JiudiantuidingView selectView(@Param("ew") Wrapper<JiudiantuidingEntity> wrapper);
	

}
