package json_weather;

public class Weather
{
    private String id;
    private String icon;
    private String description;
    private String main;

    public String getId () { return id; }
    public String getIcon () { return icon; }
    public String getDescription () { return description; }
    public String getMain () { return main; }

    public void setId (String id) { this.id = id; }
    public void setIcon (String icon) { this.icon = icon; }
    public void setDescription (String description) { this.description = description; }
    public void setMain (String main) { this.main = main; }

    @Override
    public String toString() { return "Weather [id = "+id+", icon = "+icon+", description = "+description+", main = "+main+"]"+ "\n"; }
 
}