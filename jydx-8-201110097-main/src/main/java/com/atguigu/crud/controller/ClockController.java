package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Clock;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.ClockService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理员工CRUD请求
 * 
 * @author lfy
 * 
 */
@Controller
public class ClockController {

	@Autowired
	ClockService clockService;
	
	
	/**
	 * 单个批量二合一
	 * 批量删除：1-2-3
	 * 单个删除：1
	 *
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/clock/{ids}",method=RequestMethod.DELETE)
	public Msg deleteClock(@PathVariable("ids")String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			clockService.deleteBatch(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			clockService.deleteClock(id);
		}
		return Msg.success();
	}

	/**
	 * 员工更新方法
	 * @param clock
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/clock/{clockId}",method=RequestMethod.PUT)
	public Msg saveClock(Clock clock,HttpServletRequest request){
//		System.out.println("请求体中的值："+request.getParameter("gender"));
		System.out.println("将要更新的打卡数据："+clock);
		clockService.updateClock(clock);
		return Msg.success()	;
	}
	
	/**
	 * 根据id查询员工
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/clock/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getClock(@PathVariable("id")Integer id){
		
		Clock clock = clockService.getClock(id);
		return Msg.success().add("clock", clock);
	}

	/**
	 * 员工保存
	 * 1、支持JSR303校验
	 * 2、导入Hibernate-Validator
	 * 
	 * 
	 * @return
	 */
	@RequestMapping(value="/clock",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveClock(@Valid Clock clock,BindingResult result){
		if(result.hasErrors()){
			//校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		}else{
			clockService.saveClock(clock);
			return Msg.success();
		}
		
	}

	/**
	 * 导入jackson包。
	 * @param pn
	 * @return
	 */
	@RequestMapping("/clocks")
	@ResponseBody
	public Msg getClocksWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 这不是一个分页查询
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Clock> clocks = clockService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(clocks, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	/**
	 * 查询员工数据（分页查询）
	 * 
	 * @return
	 */
	// @RequestMapping("/clocks")
	public String getClocks(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Model model) {
		// 这不是一个分页查询；
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Clock> clocks = clockService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(clocks, 5);
		model.addAttribute("pageInfo", page);

		return "list";
	}

}
