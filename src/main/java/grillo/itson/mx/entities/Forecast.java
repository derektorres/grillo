/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grillo.itson.mx.entities;

import com.google.gson.annotations.SerializedName;
import grillo.itson.mx.enums.Weatherstatus;
import java.util.Date;

/**
 *
 * @author alumnog
 */
public class Forecast {
    private Date day;
    @SerializedName("max_temperature")
    private int maxTemperature;
    @SerializedName("min_temperature")
    private int minTemperature;
    private Weatherstatus status;

}
