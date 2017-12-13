package json_weather;

public class OpenWeatherMap
{
    private String id;
    private String dt;
    private Clouds clouds;
    private Coord coord;
    private Wind wind;
    private String cod;
    private String visibility;
    private Sys sys;
    private String name;
    private String base;
    private Weather[] weather;
    private Main main;

    public String getId () { return id; }
    public String getDt () { return dt; }
    public Clouds getClouds () { return clouds; }
    public Coord getCoord () { return coord; }
    public Wind getWind () { return wind; }
    public String getCod () { return cod; }
    public String getVisibility () { return visibility; }
    public Sys getSys () { return sys; }
    public String getName () { return name; }
    public String getBase () { return base; }
    public Weather[] getWeather () { return weather; }
    public Main getMain () { return main; }

    
    public void setId (String id) { this.id = id; }
    public void setDt (String dt) { this.dt = dt; }
    public void setClouds (Clouds clouds) { this.clouds = clouds; }
    public void setCoord (Coord coord) { this.coord = coord; }
    public void setWind (Wind wind) { this.wind = wind; }
    public void setCod (String cod) { this.cod = cod; }
    public void setVisibility (String visibility) { this.visibility = visibility; }
    public void setSys (Sys sys) { this.sys = sys; }
    public void setName (String name) { this.name = name; }
    public void setBase (String base) { this.base = base; }
    public void setWeather (Weather[] weather) { this.weather = weather; }
    public void setMain (Main main) { this.main = main; }

    @Override
    public String toString() { return "OpenWeatherMap [id = "+id+", dt = "+dt+", clouds = "+clouds+", coord = "+coord+", wind = "+wind+", cod = "+cod+", visibility = "+visibility+", sys = "+sys+", name = "+name+", base = "+base+", weather = "+weather+", main = "+main+"]"; }
}	