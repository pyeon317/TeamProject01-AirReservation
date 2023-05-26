package project;

import java.util.Date;

public class InternationalVO {

	private String airplane;
	private String filght_Num;
	private String departure_Airport;
	private String arrival_Airport;
	private String departure_Time;
	private String arrival_Time;
	private String operation_Date;
	private Date start_Date;
	private Date end_Date;
	private String sortation;
	private String int_Num;
	private String model;
	
	public InternationalVO() {
		super();
	}

	public InternationalVO(String airplane, String filght_Num, String departure_Airport, String arrival_Airport,
			String departure_Time, String arrival_Time, String operation_Date, Date start_Date, Date end_Date,
			String sortation, String int_Num, String model) {
		super();
		this.airplane = airplane;
		this.filght_Num = filght_Num;
		this.departure_Airport = departure_Airport;
		this.arrival_Airport = arrival_Airport;
		this.departure_Time = departure_Time;
		this.arrival_Time = arrival_Time;
		this.operation_Date = operation_Date;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
		this.sortation = sortation;
		this.int_Num = int_Num;
		this.model = model;
	}

	
	public String getAirplane() {
		return airplane;
	}
	

	public void setAirplane(String airplane) {
		this.airplane = airplane;
	}
	

	public String getFilght_Num() {
		return filght_Num;
	}
	

	public void setFilght_Num(String filght_Num) {
		this.filght_Num = filght_Num;
	}
	

	public String getDeparture_Airport() {
		return departure_Airport;
	}
	

	public void setDeparture_Airport(String departure_Airport) {
		this.departure_Airport = departure_Airport;
	}
	

	public String getArrival_Airport() {
		return arrival_Airport;
	}
	

	public void setArrival_Airport(String arrival_Airport) {
		this.arrival_Airport = arrival_Airport;
	}
	

	public String getDeparture_Time() {
		return departure_Time;
	}
	

	public void setDeparture_Time(String departure_Time) {
		this.departure_Time = departure_Time;
	}
	

	public String getArrival_Time() {
		return arrival_Time;
	}
	

	public void setArrival_Time(String arrival_Time) {
		this.arrival_Time = arrival_Time;
	}
	

	public String getOperation_Date() {
		return operation_Date;
	}
	

	public void setOperation_Date(String operation_Date) {
		this.operation_Date = operation_Date;
	}
	

	public Date getStart_Date() {
		return start_Date;
	}
	

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}
	

	public Date getEnd_Date() {
		return end_Date;
	}
	

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}
	

	public String getSortation() {
		return sortation;
	}
	

	public void setSortation(String sortation) {
		this.sortation = sortation;
	}
	

	public String getInt_Num() {
		return int_Num;
	}
	

	public void setInt_Num(String int_Num) {
		this.int_Num = int_Num;
	}
	

	public String getModel() {
		return model;
	}
	

	public void setModel(String model) {
		this.model = model;
	}

}
