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


import com.cl.dao.JiudiantuidingDao;
import com.cl.entity.JiudiantuidingEntity;
import com.cl.service.JiudiantuidingService;
import com.cl.entity.view.JiudiantuidingView;

@Service("jiudiantuidingService")
public class JiudiantuidingServiceImpl extends ServiceImpl<JiudiantuidingDao, JiudiantuidingEntity> implements JiudiantuidingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiantuidingEntity> page = this.selectPage(
                new Query<JiudiantuidingEntity>(params).getPage(),
                new EntityWrapper<JiudiantuidingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiantuidingEntity> wrapper) {
		  Page<JiudiantuidingView> page =new Query<JiudiantuidingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiudiantuidingView> selectListView(Wrapper<JiudiantuidingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiantuidingView selectView(Wrapper<JiudiantuidingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
