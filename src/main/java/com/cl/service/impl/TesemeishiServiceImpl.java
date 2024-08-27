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


import com.cl.dao.TesemeishiDao;
import com.cl.entity.TesemeishiEntity;
import com.cl.service.TesemeishiService;
import com.cl.entity.view.TesemeishiView;

@Service("tesemeishiService")
public class TesemeishiServiceImpl extends ServiceImpl<TesemeishiDao, TesemeishiEntity> implements TesemeishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TesemeishiEntity> page = this.selectPage(
                new Query<TesemeishiEntity>(params).getPage(),
                new EntityWrapper<TesemeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TesemeishiEntity> wrapper) {
		  Page<TesemeishiView> page =new Query<TesemeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<TesemeishiView> selectListView(Wrapper<TesemeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TesemeishiView selectView(Wrapper<TesemeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
