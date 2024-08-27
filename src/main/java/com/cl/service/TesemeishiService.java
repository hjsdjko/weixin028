package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.TesemeishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.TesemeishiView;


/**
 * 特色美食
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface TesemeishiService extends IService<TesemeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TesemeishiView> selectListView(Wrapper<TesemeishiEntity> wrapper);
   	
   	TesemeishiView selectView(@Param("ew") Wrapper<TesemeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TesemeishiEntity> wrapper);
   	

}

