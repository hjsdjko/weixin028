package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiudiantuidingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudiantuidingView;


/**
 * 酒店退订
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiudiantuidingService extends IService<JiudiantuidingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiantuidingView> selectListView(Wrapper<JiudiantuidingEntity> wrapper);
   	
   	JiudiantuidingView selectView(@Param("ew") Wrapper<JiudiantuidingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiantuidingEntity> wrapper);
   	

}

