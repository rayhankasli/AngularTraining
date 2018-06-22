package com.selenium.global;

public class GlobalData {

	static int employee_id;
	static String username;

	public static int getEmployee_id() {
		return employee_id;
	}

	public static void setEmployee_id(int employee_id) {
		GlobalData.employee_id = employee_id;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		GlobalData.username = username;
	}

}
