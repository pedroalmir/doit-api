/**
 * 
 */
package com.pedroalmir.doit.api;

import java.util.Map;

/**
 * @author Pedro Almir
 *
 */
public interface ApplicationPlugin {
	/**
	 * @return plugin name
	 */
	String getName();
	/**
	 * @return plugin description
	 */
	String getDescription();
	/**
	 * Execute any routine in web, with HttpUnitDriver
	 * or URL methods.
	 * 
	 * @param inputs
	 * 				A map with key and value as string, so convert to correct type.
	 */
	Map<String, Object> execute(Map<String, String> inputs);
}
