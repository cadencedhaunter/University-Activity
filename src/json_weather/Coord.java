package json_weather;

public class Coord{ 
	private String lon;
    private String lat;

    public void setLat (String lat){ this.lat = lat; }
    public void setLon (String lon){ this.lon = lon; }

    public String getLon (){ return lon; }
    public String getLat (){ return lat; }

    @Override
    public String toString(){ return "Coord [lon = "+lon+", lat = "+lat+"]"+ "\n"; }
}