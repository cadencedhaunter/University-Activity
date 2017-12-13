import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import json_weather.OpenWeatherMap;


public class Runner {

	private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?id=703448&appid=a7d55e8f5adc9e1eac83a0ae5f20f1e1";
	private static final String WEATHER_ICO = "http://openweathermap.org/img/w/";
	
	public static void main(String[] args) throws Exception {

		String shortJson = new Scanner(new URL(WEATHER_URL).openStream()).nextLine();
	    		        
	    OpenWeatherMap weatherMap = new Gson().fromJson(shortJson,  OpenWeatherMap.class);
 
	    StringBuilder widgetContent = new StringBuilder();
	    htmlBuild(widgetContent, null, "html", null);
	    htmlBuild(widgetContent, "html", "body", null);
	    htmlBuild(widgetContent, "body", null,"<img src=\"" + WEATHER_ICO + weatherMap.getWeather()[0].getIcon() + ".png" + "\"/>");
	    htmlBuild(widgetContent, "body", "li", "Visibility: " + weatherMap.getClouds().getAll());
	    htmlBuild(widgetContent, "body", "li", "Wind speed: " + weatherMap.getWind().getSpeed());
	    htmlBuild(widgetContent, "body", "li", "Temp(min): " + weatherMap.getMain().getTemp_min());
	    htmlBuild(widgetContent, "body", "li", "Temp(max): " + weatherMap.getMain().getTemp_max());
	    htmlBuild(widgetContent, "body", "li", "Humidity: " + weatherMap.getMain().getHumidity());
	    htmlBuild(widgetContent, "body", "li", "Preassure: " + weatherMap.getMain().getPressure());
	    htmlBuild(widgetContent, "body", "li", "Temperature: " + weatherMap.getMain().getTemp());
	    htmlBuild(widgetContent, "body", "li", "Description: " + weatherMap.getWeather()[0].getDescription());
	    htmlBuild(widgetContent, "body", "li", "Weather: " + weatherMap.getWeather()[0].getMain());
	    htmlBuild(widgetContent, "body", "li", "City cod: " + weatherMap.getCod());
	    htmlBuild(widgetContent, "body", "li", "City name: " + weatherMap.getName());
	    htmlBuild(widgetContent, "body", "p", "Based on Json.");
	    htmlBuild(widgetContent, "body", "h1", "Simple HTML Weather Wighet");
	    htmlBuild(widgetContent, "html", "head", null);
	    htmlBuild(widgetContent, "head", "title", "HTML Weather Simple widget");
	    
	    
	    try (BufferedWriter outStream = new BufferedWriter(new FileWriter("widget.html"))) {
			outStream.write(widgetContent.toString());
			} catch (IOException e) {}
	     
	}

	static final String TAG_START = "<", TAG_END = ">";
	
	static void htmlBuild(StringBuilder sb, String destTag, String tag, String content) {
	
		if(tag==null) {
			sb.insert(sb.indexOf(destTag)+destTag.length()+1, content);
			return;
		}
		if(destTag==null) {
			sb.append(simpleTag(tag)).append("</"+tag + TAG_END+ "\n");
		}else {
			sb.insert(sb.indexOf(destTag)+destTag.length()+1, simpleTag(tag) + (content==null?"":content) + "</"+tag + TAG_END + "\n");
		}
	}
	
	static String simpleTag(String tagText) {
		return TAG_START + tagText + TAG_END;
	}
}
