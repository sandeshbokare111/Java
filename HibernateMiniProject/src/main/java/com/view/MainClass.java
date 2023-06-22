package com.view;

import com.entities.MenuHandler;

public class MainClass {

	public static void main(String[] args) {
		MenuHandler mn = new MenuHandler();
//		mn.DisplayAdminOperation();
		mn.admin_handleMenu();
	}
}