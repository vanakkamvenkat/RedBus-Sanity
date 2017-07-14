package pageObjects;

/*This class is created to collect all the objects in the Homepage */
public class HomePageObjects {
	//URLs present in the website
	public String baseURL = "https://www.redbus.in/";
	public String hotelURL = "https://www.redbus.in/hotels/";
	public String busHireURL = "https://www.redbus.in/bushire/?utm_source=website&utm_medium=referral&utm_campaign=Homepage_bushire_banner";
	public String pilgrimageURL = "https://www.redbus.in/pilgrimages/";
	
	//Links present in the top menu bar
	public String busTicketLink = "html/body/div[1]/div/div[1]/nav/ul/li[1]/a";
	public String hotelLink = ".//*[@href='https://www.redbus.in/hotels/']";
	public String busHireLink = ".//*[@href='https://www.redbus.in/bushire?utm_source=website&utm_medium=referral&utm_campaign=Homepage_bushire_banner']";
	public String pilgrimagesLink = ".//*[@title='pilgrimages']";
	
	//Home Page - Bus ticket booking elements
	public String busTicketFromTextBox = ".//*[@id='src']";
	public String busTicketDestTextBox = ".//*[@id='dest']";
	public String busTicketFromDateButton = ".//*[@id='onward_cal']";
	public String busTicketFromCalendar = ".//*[@id='rb-calendar_onward_cal']/table";
	public String busTicketSubmitButton = ".//button[@id='search_btn']";
		
}
