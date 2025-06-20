package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.FangwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 房屋
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("fangwu")
public class FangwuView extends FangwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 房屋类型的值
	*/
	@ColumnInfo(comment="房屋类型的字典表值",type="varchar(200)")
	private String fangwuValue;
	/**
	* 楼盘的值
	*/
	@ColumnInfo(comment="楼盘的字典表值",type="varchar(200)")
	private String fangwuLoupanValue;
	/**
	* 房本的值
	*/
	@ColumnInfo(comment="房本的字典表值",type="varchar(200)")
	private String fangwuFangbenValue;
	/**
	* 房屋状态的值
	*/
	@ColumnInfo(comment="房屋状态的字典表值",type="varchar(200)")
	private String fangwuzhuangtaiValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;




	public FangwuView() {

	}

	public FangwuView(FangwuEntity fangwuEntity) {
		try {
			BeanUtils.copyProperties(this, fangwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 房屋类型的值
	*/
	public String getFangwuValue() {
		return fangwuValue;
	}
	/**
	* 设置： 房屋类型的值
	*/
	public void setFangwuValue(String fangwuValue) {
		this.fangwuValue = fangwuValue;
	}
	//当前表的
	/**
	* 获取： 楼盘的值
	*/
	public String getFangwuLoupanValue() {
		return fangwuLoupanValue;
	}
	/**
	* 设置： 楼盘的值
	*/
	public void setFangwuLoupanValue(String fangwuLoupanValue) {
		this.fangwuLoupanValue = fangwuLoupanValue;
	}
	//当前表的
	/**
	* 获取： 房本的值
	*/
	public String getFangwuFangbenValue() {
		return fangwuFangbenValue;
	}
	/**
	* 设置： 房本的值
	*/
	public void setFangwuFangbenValue(String fangwuFangbenValue) {
		this.fangwuFangbenValue = fangwuFangbenValue;
	}
	//当前表的
	/**
	* 获取： 房屋状态的值
	*/
	public String getFangwuzhuangtaiValue() {
		return fangwuzhuangtaiValue;
	}
	/**
	* 设置： 房屋状态的值
	*/
	public void setFangwuzhuangtaiValue(String fangwuzhuangtaiValue) {
		this.fangwuzhuangtaiValue = fangwuzhuangtaiValue;
	}
	//当前表的
	/**
	* 获取： 是否上架的值
	*/
	public String getShangxiaValue() {
		return shangxiaValue;
	}
	/**
	* 设置： 是否上架的值
	*/
	public void setShangxiaValue(String shangxiaValue) {
		this.shangxiaValue = shangxiaValue;
	}




	@Override
	public String toString() {
		return "FangwuView{" +
			", fangwuValue=" + fangwuValue +
			", fangwuLoupanValue=" + fangwuLoupanValue +
			", fangwuFangbenValue=" + fangwuFangbenValue +
			", fangwuzhuangtaiValue=" + fangwuzhuangtaiValue +
			", shangxiaValue=" + shangxiaValue +
			"} " + super.toString();
	}
}
