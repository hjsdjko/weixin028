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

import com.cl.entity.JiebanlvxingEntity;
import com.cl.entity.view.JiebanlvxingView;

import com.cl.service.JiebanlvxingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 结伴旅行
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 15:14:28
 */
@RestController
@RequestMapping("/jiebanlvxing")
public class JiebanlvxingController {
    @Autowired
    private JiebanlvxingService jiebanlvxingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiebanlvxingEntity jiebanlvxing,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiebanlvxing.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiebanlvxingEntity> ew = new EntityWrapper<JiebanlvxingEntity>();

		PageUtils page = jiebanlvxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiebanlvxing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiebanlvxingEntity jiebanlvxing, 
		HttpServletRequest request){
        EntityWrapper<JiebanlvxingEntity> ew = new EntityWrapper<JiebanlvxingEntity>();

		PageUtils page = jiebanlvxingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiebanlvxing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiebanlvxingEntity jiebanlvxing){
       	EntityWrapper<JiebanlvxingEntity> ew = new EntityWrapper<JiebanlvxingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiebanlvxing, "jiebanlvxing")); 
        return R.ok().put("data", jiebanlvxingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiebanlvxingEntity jiebanlvxing){
        EntityWrapper< JiebanlvxingEntity> ew = new EntityWrapper< JiebanlvxingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiebanlvxing, "jiebanlvxing")); 
		JiebanlvxingView jiebanlvxingView =  jiebanlvxingService.selectView(ew);
		return R.ok("查询结伴旅行成功").put("data", jiebanlvxingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiebanlvxingEntity jiebanlvxing = jiebanlvxingService.selectById(id);
		jiebanlvxing = jiebanlvxingService.selectView(new EntityWrapper<JiebanlvxingEntity>().eq("id", id));
        return R.ok().put("data", jiebanlvxing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiebanlvxingEntity jiebanlvxing = jiebanlvxingService.selectById(id);
		jiebanlvxing = jiebanlvxingService.selectView(new EntityWrapper<JiebanlvxingEntity>().eq("id", id));
        return R.ok().put("data", jiebanlvxing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiebanlvxingEntity jiebanlvxing, HttpServletRequest request){
    	jiebanlvxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiebanlvxing);
        jiebanlvxingService.insert(jiebanlvxing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiebanlvxingEntity jiebanlvxing, HttpServletRequest request){
    	jiebanlvxing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiebanlvxing);
        jiebanlvxingService.insert(jiebanlvxing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiebanlvxingEntity jiebanlvxing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiebanlvxing);
        jiebanlvxingService.updateById(jiebanlvxing);//全部更新
        return R.ok();
    }

    /**
     * 审核
     */
    @RequestMapping("/shBatch")
    @Transactional
    public R update(@RequestBody Long[] ids, @RequestParam String sfsh, @RequestParam String shhf){
        List<JiebanlvxingEntity> list = new ArrayList<JiebanlvxingEntity>();
        for(Long id : ids) {
            JiebanlvxingEntity jiebanlvxing = jiebanlvxingService.selectById(id);
            jiebanlvxing.setSfsh(sfsh);
            jiebanlvxing.setShhf(shhf);
            list.add(jiebanlvxing);
        }
        jiebanlvxingService.updateBatchById(list);
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiebanlvxingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
