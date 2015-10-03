package com.mindforger.shiftsolver.shared.model;

import java.util.ArrayList;
import java.util.List;

public class PeriodSolution {

	private int year;
	private int month; 
	private List<DaySolution> days;
	
	public PeriodSolution(int year, int month) {
		this.year=year;
		this.month=month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public List<DaySolution> getDays() {
		return days;
	}

	public void setDays(List<DaySolution> days) {
		this.days = days;
	}
	
	public List<ShiftSolution> getShifts() {
		List<ShiftSolution> result=new ArrayList<ShiftSolution>();
		for(DaySolution day:days) {
			result.add(day.getMorning());
			result.add(day.getAfternoon());
			result.add(day.getNight());
		}
		return result;
	}
}