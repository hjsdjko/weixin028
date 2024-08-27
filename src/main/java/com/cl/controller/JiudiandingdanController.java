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

import com.cl.entity.JiudiandingdanEntity;
import com.cl.entity.view.JiudiandingdanView;

import com.cl.service.JiudiandingdanService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 酒店订单
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@RestController
@RequestMapping("/jiudiandingdan")
public class JiudiandingdanController {
    @Autowired
    private JiudiandingdanService jiudiandingdanService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiudiandingdanEntity jiudiandingdan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiudiandingdan.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiudiandingdanEntity> ew = new EntityWrapper<JiudiandingdanEntity>();

		PageUtils page = jiudiandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiandingdan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiudiandingdanEntity jiudiandingdan, 
		HttpServletRequest request){
        EntityWrapper<JiudiandingdanEntity> ew = new EntityWrapper<JiudiandingdanEntity>();

		PageUtils page = jiudiandingdanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiudiandingdan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiudiandingdanEntity jiudiandingdan){
       	EntityWrapper<JiudiandingdanEntity> ew = new EntityWrapper<JiudiandingdanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiudiandingdan, "jiudiandingdan")); 
        return R.ok().put("data", jiudiandingdanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiudiandingdanEntity jiudiandingdan){
        EntityWrapper< JiudiandingdanEntity> ew = new EntityWrapper< JiudiandingdanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiudiandingdan, "jiudiandingdan")); 
		JiudiandingdanView jiudiandingdanView =  jiudiandingdanService.selectView(ew);
		return R.ok("查询酒店订单成功").put("data", jiudiandingdanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiudiandingdanEntity jiudiandingdan = jiudiandingdanService.selectById(id);
		jiudiandingdan = jiudiandingdanService.selectView(new EntityWrapper<JiudiandingdanEntity>().eq("id", id));
        return R.ok().put("data", jiudiandingdan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiudiandingdanEntity jiudiandingdan = jiudiandingdanService.selectById(id);
		jiudiandingdan = jiudiandingdanService.selectView(new EntityWrapper<JiudiandingdanEntity>().eq("id", id));
        return R.ok().put("data", jiudiandingdan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiudiandingdanEntity jiudiandingdan, HttpServletRequest request){
    	jiudiandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiandingdan);
        jiudiandingdanService.insert(jiudiandingdan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiudiandingdanEntity jiudiandingdan, HttpServletRequest request){
    	jiudiandingdan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiudiandingdan);
        jiudiandingdanService.insert(jiudiandingdan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiudiandingdanEntity jiudiandingdan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiudiandingdan);
        jiudiandingdanService.updateById(jiudiandingdan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiudiandingdanService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
