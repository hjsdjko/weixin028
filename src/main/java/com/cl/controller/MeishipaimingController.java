package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.MeishipaimingEntity;
import com.cl.entity.view.MeishipaimingView;

import com.cl.service.MeishipaimingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 美食排名
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@RestController
@RequestMapping("/meishipaiming")
public class MeishipaimingController {
    @Autowired
    private MeishipaimingService meishipaimingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeishipaimingEntity meishipaiming,
		HttpServletRequest request){
        EntityWrapper<MeishipaimingEntity> ew = new EntityWrapper<MeishipaimingEntity>();

		PageUtils page = meishipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishipaiming), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeishipaimingEntity meishipaiming, 
		HttpServletRequest request){
        EntityWrapper<MeishipaimingEntity> ew = new EntityWrapper<MeishipaimingEntity>();

		PageUtils page = meishipaimingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meishipaiming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeishipaimingEntity meishipaiming){
       	EntityWrapper<MeishipaimingEntity> ew = new EntityWrapper<MeishipaimingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meishipaiming, "meishipaiming")); 
        return R.ok().put("data", meishipaimingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeishipaimingEntity meishipaiming){
        EntityWrapper< MeishipaimingEntity> ew = new EntityWrapper< MeishipaimingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meishipaiming, "meishipaiming")); 
		MeishipaimingView meishipaimingView =  meishipaimingService.selectView(ew);
		return R.ok("查询美食排名成功").put("data", meishipaimingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeishipaimingEntity meishipaiming = meishipaimingService.selectById(id);
		meishipaiming = meishipaimingService.selectView(new EntityWrapper<MeishipaimingEntity>().eq("id", id));
        return R.ok().put("data", meishipaiming);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeishipaimingEntity meishipaiming = meishipaimingService.selectById(id);
		meishipaiming = meishipaimingService.selectView(new EntityWrapper<MeishipaimingEntity>().eq("id", id));
        return R.ok().put("data", meishipaiming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeishipaimingEntity meishipaiming, HttpServletRequest request){
    	meishipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishipaiming);
        meishipaimingService.insert(meishipaiming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeishipaimingEntity meishipaiming, HttpServletRequest request){
    	meishipaiming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meishipaiming);
        meishipaimingService.insert(meishipaiming);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MeishipaimingEntity meishipaiming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meishipaiming);
        meishipaimingService.updateById(meishipaiming);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meishipaimingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
