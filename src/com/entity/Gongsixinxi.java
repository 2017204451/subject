﻿package com.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gongsixinxi {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	private String gongsibianhao;
    private String addtime;

    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
	
	public String getGongsibianhao() {
        return gongsibianhao;
    }
    public void setGongsibianhao(String gongsibianhao) {
        this.gongsibianhao = gongsibianhao == null ? null : gongsibianhao.trim();
    }
        return mima;
    }
    public void setMima(String mima) {
        this.mima = mima == null ? null : mima.trim();
    }
        return youxiang;
    }
    public void setYouxiang(String youxiang) {
        this.youxiang = youxiang == null ? null : youxiang.trim();
    }
        return gongsimingcheng;
    }
    public void setGongsimingcheng(String gongsimingcheng) {
        this.gongsimingcheng = gongsimingcheng == null ? null : gongsimingcheng.trim();
    }
        return leixing;
    }
    public void setLeixing(String leixing) {
        this.leixing = leixing == null ? null : leixing.trim();
    }
        return xingye;
    }
    public void setXingye(String xingye) {
        this.xingye = xingye == null ? null : xingye.trim();
    }
        return guimo;
    }
    public void setGuimo(String guimo) {
        this.guimo = guimo == null ? null : guimo.trim();
    }
        return jianjie;
    }
    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }
	
	
    public String getAddtime() {
        return addtime;
    }
    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
//   设置字段信息