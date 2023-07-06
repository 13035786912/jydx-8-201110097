package com.atguigu.crud.service;

import com.atguigu.crud.bean.Clock;
import com.atguigu.crud.bean.ClockExample;
import com.atguigu.crud.bean.ClockExample.Criteria;
import com.atguigu.crud.dao.ClockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClockService {
	
	@Autowired
	ClockMapper clockMapper;

	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Clock> getAll() {
		// TODO Auto-generated method stub
		return clockMapper.selectByExample(null);
	}

	/**
	 * 打卡保存
	 * @param clock
	 */
	public void saveClock(Clock clock) {
		// TODO Auto-generated method stub
		clockMapper.insertSelective(clock);
	}



	/**
	 * 按照打卡id查询员工
	 * @param id
	 * @return
	 */
	public Clock getClock(Integer id) {
		// TODO Auto-generated method stub
		Clock clock = clockMapper.selectByPrimaryKey(id);
		return clock;
	}

	/**
	 * 打卡更新
	 * @param clock
	 */
	public void updateClock(Clock clock) {
		// TODO Auto-generated method stub
		clockMapper.updateByPrimaryKeySelective(clock);
	}

	/**
	 * 打卡删除
	 * @param id
	 */
	public void deleteClock(Integer id) {
		// TODO Auto-generated method stub
		clockMapper.deleteByPrimaryKey(id);
	}

	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		ClockExample example = new ClockExample();
		Criteria criteria = example.createCriteria();
		//delete from xxx where emp_id in(1,2,3)
		criteria.andClockIdIn(ids);
		clockMapper.deleteByExample(example);
	}

}
