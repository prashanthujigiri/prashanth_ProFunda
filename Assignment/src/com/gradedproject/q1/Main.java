package com.gradedproject.q1;

public class Main {

	public static void main(String[] args) {

		AdminDepartment admdept = new AdminDepartment();
		System.out.println(admdept.departmentName());
		System.out.println(admdept.getTodaysWork());
		System.out.println(admdept.getWorkDeadline());
		System.out.println(admdept.isTodayAHoliday());

		System.out.println();

		HrDepartment hrdept = new HrDepartment();
		System.out.println(hrdept.departmentName());
		System.out.println(hrdept.doActivity());
		System.out.println(hrdept.getTodaysWork());
		System.out.println(hrdept.getWorkDeadline());
		System.out.println(hrdept.isTodayAHoliday());

		System.out.println();

		TechDepartment techdept = new TechDepartment();
		System.out.println(techdept.departmentName());
		System.out.println(techdept.getTodaysWork());
		System.out.println(techdept.getWorkDeadline());
		System.out.println(techdept.getTechStackInformation());
		System.out.println(techdept.isTodayAHoliday());
	}
}
