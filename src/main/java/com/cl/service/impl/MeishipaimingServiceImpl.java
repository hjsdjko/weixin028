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


import com.cl.dao.MeishipaimingDao;
import com.cl.entity.MeishipaimingEntity;
import com.cl.service.MeishipaimingService;
import com.cl.entity.view.MeishipaimingView;

@Service("meishipaimingService")
public class MeishipaimingServiceImpl extends ServiceImpl<MeishipaimingDao, MeishipaimingEntity> implements MeishipaimingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishipaimingEntity> page = this.selectPage(
                new Query<MeishipaimingEntity>(params).getPage(),
                new EntityWrapper<MeishipaimingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishipaimingEntity> wrapper) {
		  Page<MeishipaimingView> page =new Query<MeishipaimingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<MeishipaimingView> selectListView(Wrapper<MeishipaimingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishipaimingView selectView(Wrapper<MeishipaimingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
