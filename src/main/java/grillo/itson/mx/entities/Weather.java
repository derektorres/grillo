/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grillo.itson.mx.entities;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import grillo.itson.mx.enums.Weatherstatus;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Weather {

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the status
     */
    public Weatherstatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Weatherstatus status) {
        this.status = status;
    }

    /**
     * @return the windSpeed
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed the windSpeed to set
     */
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return the forecast
     */
    public List<Forecast> getForecast() {
        return forecast;
    }

    /**
     * @param forecast the forecast to set
     */
    public void setForecast(List<Forecast> forecast) {
        this.forecast = forecast;
    }
    
    private String city;
    private int temperature;
    private int humidity;
    private Weatherstatus status;
    @SerializedName("wind_speed")
    private double windSpeed;
    private List<Forecast> forecast;
    
    /**
     * 
     * @param json 
     * @return 
     */
    public static Weather deserialiser(String json){
        Weather w = new Weather();
        
        try{
            Gson gson = new Gson();
            w = gson.fromJson(json, Weather.class);
        }catch(Exception ex){
            System.err.println("error");
        }
        return w;
        
    }
            
        
    
            
}
