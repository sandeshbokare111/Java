package demo2;

public class Address {
	 private String landmark;
	    private String city;
	    private String state;
	    public String getLandmark() {
	        return landmark;
	    }
	    public void setLandmark(String landmark) {
	        this.landmark = landmark;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public Address(String landmark, String city, String state) {
	        super();
	        this.landmark = landmark;
	        this.city = city;
	        this.state = state;
	    }
	    @Override
	    public String toString() {
	        return "Address [landmark=" + landmark + ", city=" + city + ", state=" + state + "]";
	    }
	    public Address() {
	        super();
	    }

}
