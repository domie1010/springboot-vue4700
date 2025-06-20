package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 合同
 *
 * @author 
 * @email
 */
@TableName("hetong")
public class HetongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HetongEntity() {

	}

	public HetongEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 员工
     */
    @ColumnInfo(comment="员工",type="int(11)")
    @TableField(value = "yuangong_id")

    private Integer yuangongId;


    /**
     * 房屋
     */
    @ColumnInfo(comment="房屋",type="int(11)")
    @TableField(value = "fangwu_id")

    private Integer fangwuId;


    /**
     * 合同编号
     */
    @ColumnInfo(comment="合同编号",type="varchar(200)")
    @TableField(value = "hetong_uuid_number")

    private String hetongUuidNumber;


    /**
     * 合同名称
     */
    @ColumnInfo(comment="合同名称",type="varchar(200)")
    @TableField(value = "hetong_name")

    private String hetongName;


    /**
     * 合同文件
     */
    @ColumnInfo(comment="合同文件",type="varchar(200)")
    @TableField(value = "hetong_file")

    private String hetongFile;


    /**
     * 签订地点
     */
    @ColumnInfo(comment="签订地点",type="varchar(200)")
    @TableField(value = "hetong_address")

    private String hetongAddress;


    /**
     * 合同类型
     */
    @ColumnInfo(comment="合同类型",type="int(11)")
    @TableField(value = "hetong_types")

    private Integer hetongTypes;


    /**
     * 签订时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="签订时间",type="timestamp")
    @TableField(value = "qianding_time")

    private Date qiandingTime;


    /**
     * 合同介绍
     */
    @ColumnInfo(comment="合同介绍",type="longtext")
    @TableField(value = "hetong_content")

    private String hetongContent;


    /**
     * 是否同意
     */
    @ColumnInfo(comment="是否同意",type="int(11)")
    @TableField(value = "yonghu_tongyi_types")

    private Integer yonghuTongyiTypes;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "hetong_delete")

    private Integer hetongDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 设置：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }
    /**
	 * 设置：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 获取：房屋
	 */
    public Integer getFangwuId() {
        return fangwuId;
    }
    /**
	 * 设置：房屋
	 */

    public void setFangwuId(Integer fangwuId) {
        this.fangwuId = fangwuId;
    }
    /**
	 * 获取：合同编号
	 */
    public String getHetongUuidNumber() {
        return hetongUuidNumber;
    }
    /**
	 * 设置：合同编号
	 */

    public void setHetongUuidNumber(String hetongUuidNumber) {
        this.hetongUuidNumber = hetongUuidNumber;
    }
    /**
	 * 获取：合同名称
	 */
    public String getHetongName() {
        return hetongName;
    }
    /**
	 * 设置：合同名称
	 */

    public void setHetongName(String hetongName) {
        this.hetongName = hetongName;
    }
    /**
	 * 获取：合同文件
	 */
    public String getHetongFile() {
        return hetongFile;
    }
    /**
	 * 设置：合同文件
	 */

    public void setHetongFile(String hetongFile) {
        this.hetongFile = hetongFile;
    }
    /**
	 * 获取：签订地点
	 */
    public String getHetongAddress() {
        return hetongAddress;
    }
    /**
	 * 设置：签订地点
	 */

    public void setHetongAddress(String hetongAddress) {
        this.hetongAddress = hetongAddress;
    }
    /**
	 * 获取：合同类型
	 */
    public Integer getHetongTypes() {
        return hetongTypes;
    }
    /**
	 * 设置：合同类型
	 */

    public void setHetongTypes(Integer hetongTypes) {
        this.hetongTypes = hetongTypes;
    }
    /**
	 * 获取：签订时间
	 */
    public Date getQiandingTime() {
        return qiandingTime;
    }
    /**
	 * 设置：签订时间
	 */

    public void setQiandingTime(Date qiandingTime) {
        this.qiandingTime = qiandingTime;
    }
    /**
	 * 获取：合同介绍
	 */
    public String getHetongContent() {
        return hetongContent;
    }
    /**
	 * 设置：合同介绍
	 */

    public void setHetongContent(String hetongContent) {
        this.hetongContent = hetongContent;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getYonghuTongyiTypes() {
        return yonghuTongyiTypes;
    }
    /**
	 * 设置：是否同意
	 */

    public void setYonghuTongyiTypes(Integer yonghuTongyiTypes) {
        this.yonghuTongyiTypes = yonghuTongyiTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getHetongDelete() {
        return hetongDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setHetongDelete(Integer hetongDelete) {
        this.hetongDelete = hetongDelete;
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
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Hetong{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", yuangongId=" + yuangongId +
            ", fangwuId=" + fangwuId +
            ", hetongUuidNumber=" + hetongUuidNumber +
            ", hetongName=" + hetongName +
            ", hetongFile=" + hetongFile +
            ", hetongAddress=" + hetongAddress +
            ", hetongTypes=" + hetongTypes +
            ", qiandingTime=" + DateUtil.convertString(qiandingTime,"yyyy-MM-dd") +
            ", hetongContent=" + hetongContent +
            ", yonghuTongyiTypes=" + yonghuTongyiTypes +
            ", hetongDelete=" + hetongDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
