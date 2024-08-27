package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.MeishipaimingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.MeishipaimingView;


/**
 * 美食排名
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface MeishipaimingService extends IService<MeishipaimingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishipaimingView> selectListView(Wrapper<MeishipaimingEntity> wrapper);
   	
   	MeishipaimingView selectView(@Param("ew") Wrapper<MeishipaimingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishipaimingEntity> wrapper);
   	

}

