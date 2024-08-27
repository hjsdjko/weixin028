package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.JiebanlvxingDao;
import com.cl.entity.JiebanlvxingEntity;
import com.cl.service.JiebanlvxingService;
import com.cl.entity.view.JiebanlvxingView;

@Service("jiebanlvxingService")
public class JiebanlvxingServiceImpl extends ServiceImpl<JiebanlvxingDao, JiebanlvxingEntity> implements JiebanlvxingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiebanlvxingEntity> page = this.selectPage(
                new Query<JiebanlvxingEntity>(params).getPage(),
                new EntityWrapper<JiebanlvxingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiebanlvxingEntity> wrapper) {
		  Page<JiebanlvxingView> page =new Query<JiebanlvxingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiebanlvxingView> selectListView(Wrapper<JiebanlvxingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiebanlvxingView selectView(Wrapper<JiebanlvxingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
