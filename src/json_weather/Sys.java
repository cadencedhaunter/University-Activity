package json_weather;

public class Sys
{
    private String message;
    private String id;
    private String sunset;
    private String sunrise;
    private String type;
    private String country;

    public String getMessage () { return message; }
    public String getId () { return id; }
    public String getSunset () { return sunset; }
    public String getSunrise () { return sunrise; }
    public String getType () { return type; }
    public String getCountry () { return country; }

    public void setMessage (String message) { this.message = message; }
    public void setId (String id) { this.id = id; }
    public void setSunset (String sunset) { this.sunset = sunset; }
    public void setSunrise (String sunrise) { this.sunrise = sunrise; }
    public void setType (String type) { this.type = type; }
    public void setCountry (String country) { this.country = country; }

    @Override
    public String toString() { return "Sys [message = "+message+", id = "+id+", sunset = "+sunset+", sunrise = "+sunrise+", type = "+type+", country = "+country+"]"+ "\n"; }
}