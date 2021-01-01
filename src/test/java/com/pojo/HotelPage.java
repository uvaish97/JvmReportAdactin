package com.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.LibGlobal;

public class HotelPage extends LibGlobal {
	public HotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotel;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement txtDateIn;
	
	@FindBy(id="datepick_out")
	private WebElement txtDateOut;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdult;
	
	@FindBy(id="child_room")
	private WebElement dDnChild;
	
	


	
	public void hotel(String location, String hotel, String roomType, String noOfRooms, String CheckInDate, String CheckOutDate, String adults, String child) {
		
		selectbyVisibletext(dDnlocation, location);
		
		selectbyVisibletext(dDnhotel, hotel);
		
		selectbyVisibletext(dDnRoomtype, roomType);
		
		selectbyVisibletext(dDnRoomNo, noOfRooms);
		
		selectbyVisibletext(dDnAdult, adults);
		
		selectbyVisibletext(dDnChild, child);
		
		clear(txtDateIn);
		type(txtDateIn, CheckInDate);
		
		clear(txtDateOut);
		type(txtDateOut, CheckOutDate);
		
	
		
		

	}

}
