package com.sunshine.model;
/**
 * 居民安全-流量单位表 t_flux_unit
 * @author 云和数据-边晓鹏
 *
 * Administrator
 */
public class FluxUnit {

	//该表id
	private String id;
	//时间单位
	private int timeUnit ;
	//单位名称
	private String unitName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTimeUnit() {
		return timeUnit;
	}
	public void setTimeUnit(int timeUnit) {
		this.timeUnit = timeUnit;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public String toString() {
		return "FluxUnit [id=" + id + ", timeUnit=" + timeUnit + ", unitName=" + unitName + "]";
	}
	
}
