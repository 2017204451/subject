﻿package com.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Yonghuzhuce {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Integer id;
	private String yonghuming;
    private String addtime;

	
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getYonghuming() {
        return yonghuming;
    }
    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming == null ? null : yonghuming.trim();
    }
        return mima;
    }
    public void setMima(String mima) {
        this.mima = mima == null ? null : mima.trim();
    }
        return xingming;
    }
    public void setXingming(String xingming) {
        this.xingming = xingming == null ? null : xingming.trim();
    }
        return xingbie;
    }
    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }
        return chushengnianyue;
    }
    public void setChushengnianyue(String chushengnianyue) {
        this.chushengnianyue = chushengnianyue == null ? null : chushengnianyue.trim();
    }
        return QQ;
    }
    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }
        return youxiang;
    }
    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang == null ? null : youxiang.trim();
    }
        return shouji;
    }
    public void setShouji(String shouji) {
        this.shouji = shouji == null ? null : shouji.trim();
    }
        return shenfenzheng;
    }
    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng == null ? null : shenfenzheng.trim();
    }
        return touxiang;
    }
    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang == null ? null : touxiang.trim();
    }
        return dizhi;
    }
    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }
        return beizhu;
    }
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
        return issh;
    }
    public void setIssh(String issh) {
        this.issh = issh == null ? null : issh.trim();
    }
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息