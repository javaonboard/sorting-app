package com.utd.se3345.project1.sortingapp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.jutils.jhardware.HardwareInfo;
import org.jutils.jhardware.model.ProcessorInfo;

import com.utd.se3345.project1.sortingapp.model.SysInfo;

public class SystemInfo {
	
	
	public Map<String,String> getsysInfo() {
		Map<String,String> map = new HashMap<>();
		SysInfo si = new SysInfo();
		ProcessorInfo info = HardwareInfo.getProcessorInfo();
	    //Get named info
	    System.out.println("Cache size: " + info.getCacheSize());        
	    System.out.println("Family: " + info.getFamily());
	    System.out.println("Speed (Mhz): " + info.getMhz());
	    //[...]
	    

	    //Get all info from map
	    Set<Entry<String, String>> fullInfos = info.getFullInfo().entrySet();
	    StringBuilder sb = new StringBuilder();    
	    
	   
	    for (final Entry<String, String> fullInfo : fullInfos) {
	        map.put(fullInfo.getKey(),fullInfo.getValue());
	    }
	    
	    return map;
	}

}
