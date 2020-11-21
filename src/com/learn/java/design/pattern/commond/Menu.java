package com.learn.java.design.pattern.commond;

import java.util.HashMap;
import java.util.Map;

/** 
 * Inoker object which holds the commond object and invokes methods**/
public class Menu {

	Map<String,Commond> menuItems=new HashMap<String, Commond>();
	
	public void setCommond(String operation,Commond cmd)
	{
		menuItems.put(operation, cmd);
	}
	
	public void runCommond(String operation)
	{
		menuItems.get(operation).execute();
	}
	
}
