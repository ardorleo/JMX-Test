package com.my.config.app_loader;


public class AppLoader {
	
	private volatile AppResourceLocationMBean appLocationMBean;

	public void setAppLocationMBean(AppResourceLocationMBean appLocationMBean) {
		System.out.println("Setting appLocationBean in setter >>>>>>>>>>>>>>>");
		this.appLocationMBean = appLocationMBean;
	}

	public void init() throws Exception {
		System.out.println(":::::::Inside init()");
		String appLocation = null;
	    appLocation = this.appLocationMBean.getLocation();
		System.out.println(":::::::Location is: " + appLocation);

	}
}
