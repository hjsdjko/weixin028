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

import com.cl.entity.JiudiantuidingEntity;
import com.cl.entity.view.JiudiantuidingView;

import com.cl.service.JiudiantuidingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 酒店退订
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@RestController
@RequestMapping("/jiudiantuiding")
public class JiudiantuidingController {
    @Autowired
    private JiudiantuidingService jiudiantuidingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiudiantuidingEntity jiudiantuiding,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiudiantuiding.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiudiantuidingEntity> ew = new EntityWrapper<JiudiantuidingEntity>();

		PageUtils page = jiudiantuidingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiantuiding), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiudiantuidingEntity jiudiantuiding, 
		HttpServletRequest request){
        EntityWrapper<JiudiantuidingEntity> ew = new EntityWrapper<JiudiantuidingEntity>();

		PageUtils page = jiudiantuidingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiantuiding), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiudiantuidingEntity jiudiantuiding){
       	EntityWrapper<JiudiantuidingEntity> ew = new EntityWrapper<JiudiantuidingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiudiantuiding, "jiudiantuiding")); 
        return R.ok().put("data", jiudiantuidingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiudiantuidingEntity jiudiantuiding){
        EntityWrapper< JiudiantuidingEntity> ew = new EntityWrapper< JiudiantuidingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiudiantuiding, "jiudiantuiding")); 
		JiudiantuidingView jiudiantuidingView =  jiudiantuidingService.selectView(ew);
		return R.ok("查询酒店退订成功").put("data", jiudiantuidingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiudiantuidingEntity jiudiantuiding = jiudiantuidingService.selectById(id);
		jiudiantuiding = jiudiantuidingService.selectView(new EntityWrapper<JiudiantuidingEntity>().eq("id", id));
        return R.ok().put("data", jiudiantuiding);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiudiantuidingEntity jiudiantuiding = jiudiantuidingService.selectById(id);
		jiudiantuiding = jiudiantuidingService.selectView(new EntityWrapper<JiudiantuidingEntity>().eq("id", id));
        return R.ok().put("data", jiudiantuiding);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiudiantuidingEntity jiudiantuiding, HttpServletRequest request){
    	jiudiantuiding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiantuiding);
        jiudiantuidingService.insert(jiudiantuiding);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiudiantuidingEntity jiudiantuiding, HttpServletRequest request){
    	jiudiantuiding.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiantuiding);
        jiudiantuidingService.insert(jiudiantuiding);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiudiantuidingEntity jiudiantuiding, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiudiantuiding);
        jiudiantuidingService.updateById(jiudiantuiding);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiudiantuidingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
