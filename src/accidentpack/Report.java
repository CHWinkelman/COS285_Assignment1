/**
 * 
 */
package accidentpack;

import java.time.LocalDateTime;

/**
 * Object representing an accident report
 * @
 */
public class Report {

	private String 			id;
	private int 			severity;
	private LocalDateTime 	startTime;
	private LocalDateTime 	endTime;
	private Address			location;
	private int 			tempurature;
	private int 			huimidity;
	private int 			visibility;
	private String 			weather;
	private Boolean 		crossing;
	private String			timeOfDay;
	
	
}
