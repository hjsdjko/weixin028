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


import com.cl.dao.JiudiandingdanDao;
import com.cl.entity.JiudiandingdanEntity;
import com.cl.service.JiudiandingdanService;
import com.cl.entity.view.JiudiandingdanView;

@Service("jiudiandingdanService")
public class JiudiandingdanServiceImpl extends ServiceImpl<JiudiandingdanDao, JiudiandingdanEntity> implements JiudiandingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiudiandingdanEntity> page = this.selectPage(
                new Query<JiudiandingdanEntity>(params).getPage(),
                new EntityWrapper<JiudiandingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiudiandingdanEntity> wrapper) {
		  Page<JiudiandingdanView> page =new Query<JiudiandingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<JiudiandingdanView> selectListView(Wrapper<JiudiandingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiudiandingdanView selectView(Wrapper<JiudiandingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
