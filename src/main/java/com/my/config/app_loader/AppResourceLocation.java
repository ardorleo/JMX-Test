package com.my.config.app_loader;

import org.springframework.jmx.export.annotation.ManagedAttribute;

public class AppResourceLocation implements AppResourceLocationMBean {

    private volatile String location = "classpath:**/app-resource/**/";

    @ManagedAttribute(description="Get location ")
	public String getLocation()  { 
		System.out.println(":::::::::::::: getLocation() called");
		return location;
	}

    @ManagedAttribute(description="Set location")
	public void setLocation(String location) {
		System.out.println(":::::::::::::: setLocation() called");
		this.location = location;
	}
    

}
