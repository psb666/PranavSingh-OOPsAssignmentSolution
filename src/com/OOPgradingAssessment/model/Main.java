package com.OOPgradingAssessment.model;


public class Main {

	public static void main(String[] args) {
	adminDepartment admin = new adminDepartment();
	hrDepartment hr = new hrDepartment();
	techDepartment tech = new techDepartment();
		
		admin.departmentName();
		admin.getTodaysWork();
		admin.getWorkDeadline();
		admin.isTodayAHoliday();
		System.out.println("");
		hr.departmentName();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.doActivity();
		hr.isTodayAHoliday();
		System.out.println("");
		tech.departmentName();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();
		tech.isTodayAHoliday();
	}
}