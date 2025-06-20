package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.FangwuYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 预约看房
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("fangwu_yuyue")
public class FangwuYuyueView extends FangwuYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 预约状态的值
	*/
	@ColumnInfo(comment="预约状态的字典表值",type="varchar(200)")
	private String fangwuYuyueYesnoValue;

	//级联表 房屋
		/**
		* 房屋名称
		*/

		@ColumnInfo(comment="房屋名称",type="varchar(200)")
		private String fangwuName;
		/**
		* 房屋编号
		*/

		@ColumnInfo(comment="房屋编号",type="varchar(200)")
		private String fangwuUuidNumber;
		/**
		* 房屋照片
		*/

		@ColumnInfo(comment="房屋照片",type="varchar(200)")
		private String fangwuPhoto;
		/**
		* 房屋位置
		*/

		@ColumnInfo(comment="房屋位置",type="varchar(200)")
		private String fangwuAddress;
		/**
		* 楼层
		*/

		@ColumnInfo(comment="楼层",type="varchar(200)")
		private String fangwuLouceng;
		/**
		* 单元
		*/

		@ColumnInfo(comment="单元",type="varchar(200)")
		private String fangwuDanyuan;
		/**
		* 房号
		*/

		@ColumnInfo(comment="房号",type="varchar(200)")
		private String fangwuFanghao;
		/**
		* 房屋类型
		*/
		@ColumnInfo(comment="房屋类型",type="int(11)")
		private Integer fangwuTypes;
			/**
			* 房屋类型的值
			*/
			@ColumnInfo(comment="房屋类型的字典表值",type="varchar(200)")
			private String fangwuValue;
		/**
		* 楼盘
		*/
		@ColumnInfo(comment="楼盘",type="int(11)")
		private Integer fangwuLoupanTypes;
			/**
			* 楼盘的值
			*/
			@ColumnInfo(comment="楼盘的字典表值",type="varchar(200)")
			private String fangwuLoupanValue;
		/**
		* 户型
		*/

		@ColumnInfo(comment="户型",type="varchar(200)")
		private String huxing;
		/**
		* 房屋结构
		*/

		@ColumnInfo(comment="房屋结构",type="varchar(200)")
		private String fangwuJiegou;
		/**
		* 建筑结构
		*/

		@ColumnInfo(comment="建筑结构",type="varchar(200)")
		private String fangwuJianzhujiegou;
		/**
		* 装修情况
		*/

		@ColumnInfo(comment="装修情况",type="varchar(200)")
		private String fangwuZhuangxiu;
		/**
		* 房屋用途
		*/

		@ColumnInfo(comment="房屋用途",type="varchar(200)")
		private String fangwuYongtu;
		/**
		* 房本
		*/
		@ColumnInfo(comment="房本",type="int(11)")
		private Integer fangwuFangbenTypes;
			/**
			* 房本的值
			*/
			@ColumnInfo(comment="房本的字典表值",type="varchar(200)")
			private String fangwuFangbenValue;
		/**
		* 房屋热度
		*/

		@ColumnInfo(comment="房屋热度",type="int(11)")
		private Integer fangwuClicknum;
		/**
		* 房屋面积
		*/
		@ColumnInfo(comment="房屋面积",type="decimal(10,2)")
		private Double fangwuMianji;
		/**
		* 总价(万)
		*/
		@ColumnInfo(comment="总价(万)",type="decimal(10,2)")
		private Double fangwuJiage;
		/**
		* 房屋状态
		*/
		@ColumnInfo(comment="房屋状态",type="int(11)")
		private Integer fangwuzhuangtaiTypes;
			/**
			* 房屋状态的值
			*/
			@ColumnInfo(comment="房屋状态的字典表值",type="varchar(200)")
			private String fangwuzhuangtaiValue;
		/**
		* 房屋介绍
		*/

		@ColumnInfo(comment="房屋介绍",type="longtext")
		private String fangwuContent;
		/**
		* 小区介绍
		*/

		@ColumnInfo(comment="小区介绍",type="longtext")
		private String fangwuXiaoquContent;
		/**
		* 周边配套
		*/

		@ColumnInfo(comment="周边配套",type="longtext")
		private String fangwuPeitaoContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer fangwuDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;



	public FangwuYuyueView() {

	}

	public FangwuYuyueView(FangwuYuyueEntity fangwuYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, fangwuYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 预约状态的值
	*/
	public String getFangwuYuyueYesnoValue() {
		return fangwuYuyueYesnoValue;
	}
	/**
	* 设置： 预约状态的值
	*/
	public void setFangwuYuyueYesnoValue(String fangwuYuyueYesnoValue) {
		this.fangwuYuyueYesnoValue = fangwuYuyueYesnoValue;
	}


	//级联表的get和set 房屋

		/**
		* 获取： 房屋名称
		*/
		public String getFangwuName() {
			return fangwuName;
		}
		/**
		* 设置： 房屋名称
		*/
		public void setFangwuName(String fangwuName) {
			this.fangwuName = fangwuName;
		}

		/**
		* 获取： 房屋编号
		*/
		public String getFangwuUuidNumber() {
			return fangwuUuidNumber;
		}
		/**
		* 设置： 房屋编号
		*/
		public void setFangwuUuidNumber(String fangwuUuidNumber) {
			this.fangwuUuidNumber = fangwuUuidNumber;
		}

		/**
		* 获取： 房屋照片
		*/
		public String getFangwuPhoto() {
			return fangwuPhoto;
		}
		/**
		* 设置： 房屋照片
		*/
		public void setFangwuPhoto(String fangwuPhoto) {
			this.fangwuPhoto = fangwuPhoto;
		}

		/**
		* 获取： 房屋位置
		*/
		public String getFangwuAddress() {
			return fangwuAddress;
		}
		/**
		* 设置： 房屋位置
		*/
		public void setFangwuAddress(String fangwuAddress) {
			this.fangwuAddress = fangwuAddress;
		}

		/**
		* 获取： 楼层
		*/
		public String getFangwuLouceng() {
			return fangwuLouceng;
		}
		/**
		* 设置： 楼层
		*/
		public void setFangwuLouceng(String fangwuLouceng) {
			this.fangwuLouceng = fangwuLouceng;
		}

		/**
		* 获取： 单元
		*/
		public String getFangwuDanyuan() {
			return fangwuDanyuan;
		}
		/**
		* 设置： 单元
		*/
		public void setFangwuDanyuan(String fangwuDanyuan) {
			this.fangwuDanyuan = fangwuDanyuan;
		}

		/**
		* 获取： 房号
		*/
		public String getFangwuFanghao() {
			return fangwuFanghao;
		}
		/**
		* 设置： 房号
		*/
		public void setFangwuFanghao(String fangwuFanghao) {
			this.fangwuFanghao = fangwuFanghao;
		}
		/**
		* 获取： 房屋类型
		*/
		public Integer getFangwuTypes() {
			return fangwuTypes;
		}
		/**
		* 设置： 房屋类型
		*/
		public void setFangwuTypes(Integer fangwuTypes) {
			this.fangwuTypes = fangwuTypes;
		}


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
		/**
		* 获取： 楼盘
		*/
		public Integer getFangwuLoupanTypes() {
			return fangwuLoupanTypes;
		}
		/**
		* 设置： 楼盘
		*/
		public void setFangwuLoupanTypes(Integer fangwuLoupanTypes) {
			this.fangwuLoupanTypes = fangwuLoupanTypes;
		}


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

		/**
		* 获取： 户型
		*/
		public String getHuxing() {
			return huxing;
		}
		/**
		* 设置： 户型
		*/
		public void setHuxing(String huxing) {
			this.huxing = huxing;
		}

		/**
		* 获取： 房屋结构
		*/
		public String getFangwuJiegou() {
			return fangwuJiegou;
		}
		/**
		* 设置： 房屋结构
		*/
		public void setFangwuJiegou(String fangwuJiegou) {
			this.fangwuJiegou = fangwuJiegou;
		}

		/**
		* 获取： 建筑结构
		*/
		public String getFangwuJianzhujiegou() {
			return fangwuJianzhujiegou;
		}
		/**
		* 设置： 建筑结构
		*/
		public void setFangwuJianzhujiegou(String fangwuJianzhujiegou) {
			this.fangwuJianzhujiegou = fangwuJianzhujiegou;
		}

		/**
		* 获取： 装修情况
		*/
		public String getFangwuZhuangxiu() {
			return fangwuZhuangxiu;
		}
		/**
		* 设置： 装修情况
		*/
		public void setFangwuZhuangxiu(String fangwuZhuangxiu) {
			this.fangwuZhuangxiu = fangwuZhuangxiu;
		}

		/**
		* 获取： 房屋用途
		*/
		public String getFangwuYongtu() {
			return fangwuYongtu;
		}
		/**
		* 设置： 房屋用途
		*/
		public void setFangwuYongtu(String fangwuYongtu) {
			this.fangwuYongtu = fangwuYongtu;
		}
		/**
		* 获取： 房本
		*/
		public Integer getFangwuFangbenTypes() {
			return fangwuFangbenTypes;
		}
		/**
		* 设置： 房本
		*/
		public void setFangwuFangbenTypes(Integer fangwuFangbenTypes) {
			this.fangwuFangbenTypes = fangwuFangbenTypes;
		}


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

		/**
		* 获取： 房屋热度
		*/
		public Integer getFangwuClicknum() {
			return fangwuClicknum;
		}
		/**
		* 设置： 房屋热度
		*/
		public void setFangwuClicknum(Integer fangwuClicknum) {
			this.fangwuClicknum = fangwuClicknum;
		}

		/**
		* 获取： 房屋面积
		*/
		public Double getFangwuMianji() {
			return fangwuMianji;
		}
		/**
		* 设置： 房屋面积
		*/
		public void setFangwuMianji(Double fangwuMianji) {
			this.fangwuMianji = fangwuMianji;
		}

		/**
		* 获取： 总价(万)
		*/
		public Double getFangwuJiage() {
			return fangwuJiage;
		}
		/**
		* 设置： 总价(万)
		*/
		public void setFangwuJiage(Double fangwuJiage) {
			this.fangwuJiage = fangwuJiage;
		}
		/**
		* 获取： 房屋状态
		*/
		public Integer getFangwuzhuangtaiTypes() {
			return fangwuzhuangtaiTypes;
		}
		/**
		* 设置： 房屋状态
		*/
		public void setFangwuzhuangtaiTypes(Integer fangwuzhuangtaiTypes) {
			this.fangwuzhuangtaiTypes = fangwuzhuangtaiTypes;
		}


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

		/**
		* 获取： 房屋介绍
		*/
		public String getFangwuContent() {
			return fangwuContent;
		}
		/**
		* 设置： 房屋介绍
		*/
		public void setFangwuContent(String fangwuContent) {
			this.fangwuContent = fangwuContent;
		}

		/**
		* 获取： 小区介绍
		*/
		public String getFangwuXiaoquContent() {
			return fangwuXiaoquContent;
		}
		/**
		* 设置： 小区介绍
		*/
		public void setFangwuXiaoquContent(String fangwuXiaoquContent) {
			this.fangwuXiaoquContent = fangwuXiaoquContent;
		}

		/**
		* 获取： 周边配套
		*/
		public String getFangwuPeitaoContent() {
			return fangwuPeitaoContent;
		}
		/**
		* 设置： 周边配套
		*/
		public void setFangwuPeitaoContent(String fangwuPeitaoContent) {
			this.fangwuPeitaoContent = fangwuPeitaoContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


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

		/**
		* 获取： 逻辑删除
		*/
		public Integer getFangwuDelete() {
			return fangwuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setFangwuDelete(Integer fangwuDelete) {
			this.fangwuDelete = fangwuDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "FangwuYuyueView{" +
			", fangwuYuyueYesnoValue=" + fangwuYuyueYesnoValue +
			", fangwuName=" + fangwuName +
			", fangwuUuidNumber=" + fangwuUuidNumber +
			", fangwuPhoto=" + fangwuPhoto +
			", fangwuAddress=" + fangwuAddress +
			", fangwuLouceng=" + fangwuLouceng +
			", fangwuDanyuan=" + fangwuDanyuan +
			", fangwuFanghao=" + fangwuFanghao +
			", huxing=" + huxing +
			", fangwuJiegou=" + fangwuJiegou +
			", fangwuJianzhujiegou=" + fangwuJianzhujiegou +
			", fangwuZhuangxiu=" + fangwuZhuangxiu +
			", fangwuYongtu=" + fangwuYongtu +
			", fangwuClicknum=" + fangwuClicknum +
			", fangwuMianji=" + fangwuMianji +
			", fangwuJiage=" + fangwuJiage +
			", fangwuContent=" + fangwuContent +
			", fangwuXiaoquContent=" + fangwuXiaoquContent +
			", fangwuPeitaoContent=" + fangwuPeitaoContent +
			", fangwuDelete=" + fangwuDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
