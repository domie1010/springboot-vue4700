package com.entity.model;

import com.entity.FangwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 房屋
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FangwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 房屋名称
     */
    private String fangwuName;


    /**
     * 房屋编号
     */
    private String fangwuUuidNumber;


    /**
     * 房屋照片
     */
    private String fangwuPhoto;


    /**
     * 房屋位置
     */
    private String fangwuAddress;


    /**
     * 楼层
     */
    private String fangwuLouceng;


    /**
     * 单元
     */
    private String fangwuDanyuan;


    /**
     * 房号
     */
    private String fangwuFanghao;


    /**
     * 房屋类型
     */
    private Integer fangwuTypes;


    /**
     * 楼盘
     */
    private Integer fangwuLoupanTypes;


    /**
     * 户型
     */
    private String huxing;


    /**
     * 房屋结构
     */
    private String fangwuJiegou;


    /**
     * 建筑结构
     */
    private String fangwuJianzhujiegou;


    /**
     * 装修情况
     */
    private String fangwuZhuangxiu;


    /**
     * 房屋用途
     */
    private String fangwuYongtu;


    /**
     * 房本
     */
    private Integer fangwuFangbenTypes;


    /**
     * 房屋热度
     */
    private Integer fangwuClicknum;


    /**
     * 房屋面积
     */
    private Double fangwuMianji;


    /**
     * 总价(万)
     */
    private Double fangwuJiage;


    /**
     * 房屋状态
     */
    private Integer fangwuzhuangtaiTypes;


    /**
     * 房屋介绍
     */
    private String fangwuContent;


    /**
     * 小区介绍
     */
    private String fangwuXiaoquContent;


    /**
     * 周边配套
     */
    private String fangwuPeitaoContent;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer fangwuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：房屋名称
	 */
    public String getFangwuName() {
        return fangwuName;
    }


    /**
	 * 设置：房屋名称
	 */
    public void setFangwuName(String fangwuName) {
        this.fangwuName = fangwuName;
    }
    /**
	 * 获取：房屋编号
	 */
    public String getFangwuUuidNumber() {
        return fangwuUuidNumber;
    }


    /**
	 * 设置：房屋编号
	 */
    public void setFangwuUuidNumber(String fangwuUuidNumber) {
        this.fangwuUuidNumber = fangwuUuidNumber;
    }
    /**
	 * 获取：房屋照片
	 */
    public String getFangwuPhoto() {
        return fangwuPhoto;
    }


    /**
	 * 设置：房屋照片
	 */
    public void setFangwuPhoto(String fangwuPhoto) {
        this.fangwuPhoto = fangwuPhoto;
    }
    /**
	 * 获取：房屋位置
	 */
    public String getFangwuAddress() {
        return fangwuAddress;
    }


    /**
	 * 设置：房屋位置
	 */
    public void setFangwuAddress(String fangwuAddress) {
        this.fangwuAddress = fangwuAddress;
    }
    /**
	 * 获取：楼层
	 */
    public String getFangwuLouceng() {
        return fangwuLouceng;
    }


    /**
	 * 设置：楼层
	 */
    public void setFangwuLouceng(String fangwuLouceng) {
        this.fangwuLouceng = fangwuLouceng;
    }
    /**
	 * 获取：单元
	 */
    public String getFangwuDanyuan() {
        return fangwuDanyuan;
    }


    /**
	 * 设置：单元
	 */
    public void setFangwuDanyuan(String fangwuDanyuan) {
        this.fangwuDanyuan = fangwuDanyuan;
    }
    /**
	 * 获取：房号
	 */
    public String getFangwuFanghao() {
        return fangwuFanghao;
    }


    /**
	 * 设置：房号
	 */
    public void setFangwuFanghao(String fangwuFanghao) {
        this.fangwuFanghao = fangwuFanghao;
    }
    /**
	 * 获取：房屋类型
	 */
    public Integer getFangwuTypes() {
        return fangwuTypes;
    }


    /**
	 * 设置：房屋类型
	 */
    public void setFangwuTypes(Integer fangwuTypes) {
        this.fangwuTypes = fangwuTypes;
    }
    /**
	 * 获取：楼盘
	 */
    public Integer getFangwuLoupanTypes() {
        return fangwuLoupanTypes;
    }


    /**
	 * 设置：楼盘
	 */
    public void setFangwuLoupanTypes(Integer fangwuLoupanTypes) {
        this.fangwuLoupanTypes = fangwuLoupanTypes;
    }
    /**
	 * 获取：户型
	 */
    public String getHuxing() {
        return huxing;
    }


    /**
	 * 设置：户型
	 */
    public void setHuxing(String huxing) {
        this.huxing = huxing;
    }
    /**
	 * 获取：房屋结构
	 */
    public String getFangwuJiegou() {
        return fangwuJiegou;
    }


    /**
	 * 设置：房屋结构
	 */
    public void setFangwuJiegou(String fangwuJiegou) {
        this.fangwuJiegou = fangwuJiegou;
    }
    /**
	 * 获取：建筑结构
	 */
    public String getFangwuJianzhujiegou() {
        return fangwuJianzhujiegou;
    }


    /**
	 * 设置：建筑结构
	 */
    public void setFangwuJianzhujiegou(String fangwuJianzhujiegou) {
        this.fangwuJianzhujiegou = fangwuJianzhujiegou;
    }
    /**
	 * 获取：装修情况
	 */
    public String getFangwuZhuangxiu() {
        return fangwuZhuangxiu;
    }


    /**
	 * 设置：装修情况
	 */
    public void setFangwuZhuangxiu(String fangwuZhuangxiu) {
        this.fangwuZhuangxiu = fangwuZhuangxiu;
    }
    /**
	 * 获取：房屋用途
	 */
    public String getFangwuYongtu() {
        return fangwuYongtu;
    }


    /**
	 * 设置：房屋用途
	 */
    public void setFangwuYongtu(String fangwuYongtu) {
        this.fangwuYongtu = fangwuYongtu;
    }
    /**
	 * 获取：房本
	 */
    public Integer getFangwuFangbenTypes() {
        return fangwuFangbenTypes;
    }


    /**
	 * 设置：房本
	 */
    public void setFangwuFangbenTypes(Integer fangwuFangbenTypes) {
        this.fangwuFangbenTypes = fangwuFangbenTypes;
    }
    /**
	 * 获取：房屋热度
	 */
    public Integer getFangwuClicknum() {
        return fangwuClicknum;
    }


    /**
	 * 设置：房屋热度
	 */
    public void setFangwuClicknum(Integer fangwuClicknum) {
        this.fangwuClicknum = fangwuClicknum;
    }
    /**
	 * 获取：房屋面积
	 */
    public Double getFangwuMianji() {
        return fangwuMianji;
    }


    /**
	 * 设置：房屋面积
	 */
    public void setFangwuMianji(Double fangwuMianji) {
        this.fangwuMianji = fangwuMianji;
    }
    /**
	 * 获取：总价(万)
	 */
    public Double getFangwuJiage() {
        return fangwuJiage;
    }


    /**
	 * 设置：总价(万)
	 */
    public void setFangwuJiage(Double fangwuJiage) {
        this.fangwuJiage = fangwuJiage;
    }
    /**
	 * 获取：房屋状态
	 */
    public Integer getFangwuzhuangtaiTypes() {
        return fangwuzhuangtaiTypes;
    }


    /**
	 * 设置：房屋状态
	 */
    public void setFangwuzhuangtaiTypes(Integer fangwuzhuangtaiTypes) {
        this.fangwuzhuangtaiTypes = fangwuzhuangtaiTypes;
    }
    /**
	 * 获取：房屋介绍
	 */
    public String getFangwuContent() {
        return fangwuContent;
    }


    /**
	 * 设置：房屋介绍
	 */
    public void setFangwuContent(String fangwuContent) {
        this.fangwuContent = fangwuContent;
    }
    /**
	 * 获取：小区介绍
	 */
    public String getFangwuXiaoquContent() {
        return fangwuXiaoquContent;
    }


    /**
	 * 设置：小区介绍
	 */
    public void setFangwuXiaoquContent(String fangwuXiaoquContent) {
        this.fangwuXiaoquContent = fangwuXiaoquContent;
    }
    /**
	 * 获取：周边配套
	 */
    public String getFangwuPeitaoContent() {
        return fangwuPeitaoContent;
    }


    /**
	 * 设置：周边配套
	 */
    public void setFangwuPeitaoContent(String fangwuPeitaoContent) {
        this.fangwuPeitaoContent = fangwuPeitaoContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getFangwuDelete() {
        return fangwuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setFangwuDelete(Integer fangwuDelete) {
        this.fangwuDelete = fangwuDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
