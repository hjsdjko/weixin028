package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiebanlvxingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiebanlvxingView;


/**
 * 结伴旅行
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiebanlvxingService extends IService<JiebanlvxingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiebanlvxingView> selectListView(Wrapper<JiebanlvxingEntity> wrapper);
   	
   	JiebanlvxingView selectView(@Param("ew") Wrapper<JiebanlvxingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiebanlvxingEntity> wrapper);
   	

}

