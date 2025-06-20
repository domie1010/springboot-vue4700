package com.entity.vo;

import com.entity.FangwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 房屋
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fangwu")
public class FangwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 房屋名称
     */

    @TableField(value = "fangwu_name")
    private String fangwuName;


    /**
     * 房屋编号
     */

    @TableField(value = "fangwu_uuid_number")
    private String fangwuUuidNumber;


    /**
     * 房屋照片
     */

    @TableField(value = "fangwu_photo")
    private String fangwuPhoto;


    /**
     * 房屋位置
     */

    @TableField(value = "fangwu_address")
    private String fangwuAddress;


    /**
     * 楼层
     */

    @TableField(value = "fangwu_louceng")
    private String fangwuLouceng;


    /**
     * 单元
     */

    @TableField(value = "fangwu_danyuan")
    private String fangwuDanyuan;


    /**
     * 房号
     */

    @TableField(value = "fangwu_fanghao")
    private String fangwuFanghao;


    /**
     * 房屋类型
     */

    @TableField(value = "fangwu_types")
    private Integer fangwuTypes;


    /**
     * 楼盘
     */

    @TableField(value = "fangwu_loupan_types")
    private Integer fangwuLoupanTypes;


    /**
     * 户型
     */

    @TableField(value = "huxing")
    private String huxing;


    /**
     * 房屋结构
     */

    @TableField(value = "fangwu_jiegou")
    private String fangwuJiegou;


    /**
     * 建筑结构
     */

    @TableField(value = "fangwu_jianzhujiegou")
    private String fangwuJianzhujiegou;


    /**
     * 装修情况
     */

    @TableField(value = "fangwu_zhuangxiu")
    private String fangwuZhuangxiu;


    /**
     * 房屋用途
     */

    @TableField(value = "fangwu_yongtu")
    private String fangwuYongtu;


    /**
     * 房本
     */

    @TableField(value = "fangwu_fangben_types")
    private Integer fangwuFangbenTypes;


    /**
     * 房屋热度
     */

    @TableField(value = "fangwu_clicknum")
    private Integer fangwuClicknum;


    /**
     * 房屋面积
     */

    @TableField(value = "fangwu_mianji")
    private Double fangwuMianji;


    /**
     * 总价(万)
     */

    @TableField(value = "fangwu_jiage")
    private Double fangwuJiage;


    /**
     * 房屋状态
     */

    @TableField(value = "fangwuzhuangtai_types")
    private Integer fangwuzhuangtaiTypes;


    /**
     * 房屋介绍
     */

    @TableField(value = "fangwu_content")
    private String fangwuContent;


    /**
     * 小区介绍
     */

    @TableField(value = "fangwu_xiaoqu_content")
    private String fangwuXiaoquContent;


    /**
     * 周边配套
     */

    @TableField(value = "fangwu_peitao_content")
    private String fangwuPeitaoContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "fangwu_delete")
    private Integer fangwuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：房屋名称
	 */
    public String getFangwuName() {
        return fangwuName;
    }


    /**
	 * 获取：房屋名称
	 */

    public void setFangwuName(String fangwuName) {
        this.fangwuName = fangwuName;
    }
    /**
	 * 设置：房屋编号
	 */
    public String getFangwuUuidNumber() {
        return fangwuUuidNumber;
    }


    /**
	 * 获取：房屋编号
	 */

    public void setFangwuUuidNumber(String fangwuUuidNumber) {
        this.fangwuUuidNumber = fangwuUuidNumber;
    }
    /**
	 * 设置：房屋照片
	 */
    public String getFangwuPhoto() {
        return fangwuPhoto;
    }


    /**
	 * 获取：房屋照片
	 */

    public void setFangwuPhoto(String fangwuPhoto) {
        this.fangwuPhoto = fangwuPhoto;
    }
    /**
	 * 设置：房屋位置
	 */
    public String getFangwuAddress() {
        return fangwuAddress;
    }


    /**
	 * 获取：房屋位置
	 */

    public void setFangwuAddress(String fangwuAddress) {
        this.fangwuAddress = fangwuAddress;
    }
    /**
	 * 设置：楼层
	 */
    public String getFangwuLouceng() {
        return fangwuLouceng;
    }


    /**
	 * 获取：楼层
	 */

    public void setFangwuLouceng(String fangwuLouceng) {
        this.fangwuLouceng = fangwuLouceng;
    }
    /**
	 * 设置：单元
	 */
    public String getFangwuDanyuan() {
        return fangwuDanyuan;
    }


    /**
	 * 获取：单元
	 */

    public void setFangwuDanyuan(String fangwuDanyuan) {
        this.fangwuDanyuan = fangwuDanyuan;
    }
    /**
	 * 设置：房号
	 */
    public String getFangwuFanghao() {
        return fangwuFanghao;
    }


    /**
	 * 获取：房号
	 */

    public void setFangwuFanghao(String fangwuFanghao) {
        this.fangwuFanghao = fangwuFanghao;
    }
    /**
	 * 设置：房屋类型
	 */
    public Integer getFangwuTypes() {
        return fangwuTypes;
    }


    /**
	 * 获取：房屋类型
	 */

    public void setFangwuTypes(Integer fangwuTypes) {
        this.fangwuTypes = fangwuTypes;
    }
    /**
	 * 设置：楼盘
	 */
    public Integer getFangwuLoupanTypes() {
        return fangwuLoupanTypes;
    }


    /**
	 * 获取：楼盘
	 */

    public void setFangwuLoupanTypes(Integer fangwuLoupanTypes) {
        this.fangwuLoupanTypes = fangwuLoupanTypes;
    }
    /**
	 * 设置：户型
	 */
    public String getHuxing() {
        return huxing;
    }


    /**
	 * 获取：户型
	 */

    public void setHuxing(String huxing) {
        this.huxing = huxing;
    }
    /**
	 * 设置：房屋结构
	 */
    public String getFangwuJiegou() {
        return fangwuJiegou;
    }


    /**
	 * 获取：房屋结构
	 */

    public void setFangwuJiegou(String fangwuJiegou) {
        this.fangwuJiegou = fangwuJiegou;
    }
    /**
	 * 设置：建筑结构
	 */
    public String getFangwuJianzhujiegou() {
        return fangwuJianzhujiegou;
    }


    /**
	 * 获取：建筑结构
	 */

    public void setFangwuJianzhujiegou(String fangwuJianzhujiegou) {
        this.fangwuJianzhujiegou = fangwuJianzhujiegou;
    }
    /**
	 * 设置：装修情况
	 */
    public String getFangwuZhuangxiu() {
        return fangwuZhuangxiu;
    }


    /**
	 * 获取：装修情况
	 */

    public void setFangwuZhuangxiu(String fangwuZhuangxiu) {
        this.fangwuZhuangxiu = fangwuZhuangxiu;
    }
    /**
	 * 设置：房屋用途
	 */
    public String getFangwuYongtu() {
        return fangwuYongtu;
    }


    /**
	 * 获取：房屋用途
	 */

    public void setFangwuYongtu(String fangwuYongtu) {
        this.fangwuYongtu = fangwuYongtu;
    }
    /**
	 * 设置：房本
	 */
    public Integer getFangwuFangbenTypes() {
        return fangwuFangbenTypes;
    }


    /**
	 * 获取：房本
	 */

    public void setFangwuFangbenTypes(Integer fangwuFangbenTypes) {
        this.fangwuFangbenTypes = fangwuFangbenTypes;
    }
    /**
	 * 设置：房屋热度
	 */
    public Integer getFangwuClicknum() {
        return fangwuClicknum;
    }


    /**
	 * 获取：房屋热度
	 */

    public void setFangwuClicknum(Integer fangwuClicknum) {
        this.fangwuClicknum = fangwuClicknum;
    }
    /**
	 * 设置：房屋面积
	 */
    public Double getFangwuMianji() {
        return fangwuMianji;
    }


    /**
	 * 获取：房屋面积
	 */

    public void setFangwuMianji(Double fangwuMianji) {
        this.fangwuMianji = fangwuMianji;
    }
    /**
	 * 设置：总价(万)
	 */
    public Double getFangwuJiage() {
        return fangwuJiage;
    }


    /**
	 * 获取：总价(万)
	 */

    public void setFangwuJiage(Double fangwuJiage) {
        this.fangwuJiage = fangwuJiage;
    }
    /**
	 * 设置：房屋状态
	 */
    public Integer getFangwuzhuangtaiTypes() {
        return fangwuzhuangtaiTypes;
    }


    /**
	 * 获取：房屋状态
	 */

    public void setFangwuzhuangtaiTypes(Integer fangwuzhuangtaiTypes) {
        this.fangwuzhuangtaiTypes = fangwuzhuangtaiTypes;
    }
    /**
	 * 设置：房屋介绍
	 */
    public String getFangwuContent() {
        return fangwuContent;
    }


    /**
	 * 获取：房屋介绍
	 */

    public void setFangwuContent(String fangwuContent) {
        this.fangwuContent = fangwuContent;
    }
    /**
	 * 设置：小区介绍
	 */
    public String getFangwuXiaoquContent() {
        return fangwuXiaoquContent;
    }


    /**
	 * 获取：小区介绍
	 */

    public void setFangwuXiaoquContent(String fangwuXiaoquContent) {
        this.fangwuXiaoquContent = fangwuXiaoquContent;
    }
    /**
	 * 设置：周边配套
	 */
    public String getFangwuPeitaoContent() {
        return fangwuPeitaoContent;
    }


    /**
	 * 获取：周边配套
	 */

    public void setFangwuPeitaoContent(String fangwuPeitaoContent) {
        this.fangwuPeitaoContent = fangwuPeitaoContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFangwuDelete() {
        return fangwuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setFangwuDelete(Integer fangwuDelete) {
        this.fangwuDelete = fangwuDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
