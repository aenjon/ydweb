package net.yuan.nova.weather;

import java.io.Serializable;

/**
 * 天气指数
 * 
 * @author Administrator
 *
 */
public class WeatherIndex implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private String zs;
	private String tipt;
	private String des;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = zs;
	}

	public String getTipt() {
		return tipt;
	}

	public void setTipt(String tipt) {
		this.tipt = tipt;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}
