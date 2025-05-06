/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grillo.itson.mx.entities;

import grillo.itson.mx.enums.Weatherstatus;
import java.util.List;

/**
 *
 * @author alumnog
 */
public class Weather {
    
    private String city;
    private int temperature;
    private int humidity;
    private Weatherstatus status;
    //@SerialisedName("wind_speed")
    private double windSpeed;
    private List<Forecast> forecast;
    
}
