/**
 * 
 */
package accidentpack;

/**
 * Object representing a physical address
 * @author CHWinkelman
 */
class Address {
	
	private String street;
	private String city;
	private String county;
	private String state;

	/**
	 * @param street
	 * @param city
	 * @param county
	 * @param state
	 */
	public Address(String street, String city, String county, String state) {
		this.street = street;
		this.city = city;
		this.county = county;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return String.format("%s, %s, %s County, %s", street, city, county, state);
	}
}
