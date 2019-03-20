package studentdetails;

public class Address {
	
	private String houseNo;
	private String streetname;
	private String cityname;
	private String statename;
	private int zipcode;

	public String getHouseNo() {
		return this.houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo=houseNo;
	}
	
	public String getStreetName() {
		return this.streetname;
	}
	public void setStreetName(String streetname) {
		this.streetname=streetname;
	}
	public String getCityName() {
		return this.cityname;
	}
	public void setCityName(String cityname) {
		this.cityname=cityname;
	}
	public String getStateName() {
		return this.statename;
	}
	public void setStateName(String statename) {
		this.statename=statename;
	}
	public int getZipcode() {
		return this.zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode=zipcode;
	}
	@Override
	public String toString() {
		return "Address [House No=" + houseNo + ", streetname=" + streetname + ", cityname=" + cityname + ", statename="
				+ statename + ", zipcode=" + zipcode + "]";
	}
	
	
}

