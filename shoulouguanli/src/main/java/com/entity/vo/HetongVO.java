package com.entity.vo;

import com.entity.HetongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 合同
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("hetong")
public class HetongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 房屋
     */

    @TableField(value = "fangwu_id")
    private Integer fangwuId;


    /**
     * 合同编号
     */

    @TableField(value = "hetong_uuid_number")
    private String hetongUuidNumber;


    /**
     * 合同名称
     */

    @TableField(value = "hetong_name")
    private String hetongName;


    /**
     * 合同文件
     */

    @TableField(value = "hetong_file")
    private String hetongFile;


    /**
     * 签订地点
     */

    @TableField(value = "hetong_address")
    private String hetongAddress;


    /**
     * 合同类型
     */

    @TableField(value = "hetong_types")
    private Integer hetongTypes;


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "qianding_time")
    private Date qiandingTime;


    /**
     * 合同介绍
     */

    @TableField(value = "hetong_content")
    private String hetongContent;


    /**
     * 是否同意
     */

    @TableField(value = "yonghu_tongyi_types")
    private Integer yonghuTongyiTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "hetong_delete")
    private Integer hetongDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：房屋
	 */
    public Integer getFangwuId() {
        return fangwuId;
    }


    /**
	 * 获取：房屋
	 */

    public void setFangwuId(Integer fangwuId) {
        this.fangwuId = fangwuId;
    }
    /**
	 * 设置：合同编号
	 */
    public String getHetongUuidNumber() {
        return hetongUuidNumber;
    }


    /**
	 * 获取：合同编号
	 */

    public void setHetongUuidNumber(String hetongUuidNumber) {
        this.hetongUuidNumber = hetongUuidNumber;
    }
    /**
	 * 设置：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }


    /**
	 * 获取：合同名称
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 设置：合同文件
	 */
    public String getHetongFile() {
        return hetongFile;
    }


    /**
	 * 获取：合同文件
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 设置：签订地点
	 */
    public String getHetongAddress() {
        return hetongAddress;
    }


    /**
	 * 获取：签订地点
	 */

    public void setHetongAddress(String hetongAddress) {
        this.hetongAddress = hetongAddress;
    }
    /**
	 * 设置：合同类型
	 */
    public Integer getHetongTypes() {
        return hetongTypes;
    }


    /**
	 * 获取：合同类型
	 */

    public void setHetongTypes(Integer hetongTypes) {
        this.hetongTypes = hetongTypes;
    }
    /**
	 * 设置：签订时间
	 */
    public Date getQiandingTime() {
        return qiandingTime;
    }


    /**
	 * 获取：签订时间
	 */

    public void setQiandingTime(Date qiandingTime) {
        this.qiandingTime = qiandingTime;
    }
    /**
	 * 设置：合同介绍
	 */
    public String getHetongContent() {
        return hetongContent;
    }


    /**
	 * 获取：合同介绍
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getYonghuTongyiTypes() {
        return yonghuTongyiTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setYonghuTongyiTypes(Integer yonghuTongyiTypes) {
        this.yonghuTongyiTypes = yonghuTongyiTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getHetongDelete() {
        return hetongDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setHetongDelete(Integer hetongDelete) {
        this.hetongDelete = hetongDelete;
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
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
