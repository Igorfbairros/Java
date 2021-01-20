package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	
	public HourContract() {
		
	}
	
	public void HouerContract(Date date, Double valueHour, Integer hours, Double valuePerHour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
		
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerhour(Double valuePerHour) {
		 this.valuePerHour = valuePerHour;
	}
	
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public double totalValue() {
		return valuePerHour * hours;
	}


}
