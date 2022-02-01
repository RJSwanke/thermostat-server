package edu.snhu.robert.swanke.thermostat.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * represents a request to update a thermostat
 * 
 * <pre>
 * {
 *     "desiredTemperature": 23.0
 * }
 * </pre>
 * 
 * @author <a href="mailto:robert.swanke@snhu.edu">Robert Swanke</a>
 */
public class UpdateThermostatRequest {

	private final Float desiredTemperature;

	/**
	 * creates a new instance with the given desired temperature
	 * 
	 * @param desiredTemperature the desired temperature to set, in degrees celsius
	 */
	@JsonCreator
	public UpdateThermostatRequest(@JsonProperty("desiredTemperature") Float desiredTemperature) {
		this.desiredTemperature = desiredTemperature;
	}

	/**
	 * gets the desired temperature to set
	 * 
	 * @return the desired temperature in degrees celsius
	 */
	public Float getDesiredTemperature() {
		return desiredTemperature;
	}
}
