package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusstesemeishiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusstesemeishiView;


/**
 * 特色美食评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:29
 */
public interface DiscusstesemeishiService extends IService<DiscusstesemeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstesemeishiView> selectListView(Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	DiscusstesemeishiView selectView(@Param("ew") Wrapper<DiscusstesemeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstesemeishiEntity> wrapper);
   	

}

