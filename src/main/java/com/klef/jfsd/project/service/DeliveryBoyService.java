package com.klef.jfsd.project.service;

import com.klef.jfsd.project.model.DeliveryBoy;

public interface DeliveryBoyService {
	public String addUser(DeliveryBoy e);
	public DeliveryBoy loginvalidate(String uname);
	
	public String updateprofile(DeliveryBoy c);
}
