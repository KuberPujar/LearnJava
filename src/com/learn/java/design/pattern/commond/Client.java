package com.learn.java.design.pattern.commond;
public class Client {
//private static final Logger log=LoggerFactory.getLogger(Client.class);

public static void main(String [] args)
{
	Menu menu=new Menu();
	menu.setCommond("create", new CreateCommond());
	menu.setCommond("delete", new DeleteCommond());
	menu.runCommond("create");
	menu.runCommond("delete");
}
}
