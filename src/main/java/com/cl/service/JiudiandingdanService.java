package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.JiudiandingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.JiudiandingdanView;


/**
 * 酒店订单
 *
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
public interface JiudiandingdanService extends IService<JiudiandingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiudiandingdanView> selectListView(Wrapper<JiudiandingdanEntity> wrapper);
   	
   	JiudiandingdanView selectView(@Param("ew") Wrapper<JiudiandingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiudiandingdanEntity> wrapper);
   	

}

