package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment{

	public String departmentName() {
		return "Welcome to Hr Department";
	}

	public String doActivity() {
		return "team lunch";
	}

	public String getTodaysWork() {
		return "Fill today's marksheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

}
