package com.klab.java8features;
import java.sql.Timestamp;

import lombok.Data;

@Data
public class BEntity {
	
	private int cffConstraintsKey;

	private String ppvCode;

	private String ptvl;

	private int modelYear;

	private String marketWersCode;

	private String channelWersCode;

	private int buildWeek;

	private String controllableFeature;

	private String constraintExpression;

	private String operatorCode;

	private int volume;

	private int priority;

	private String plantCode;

	private String createdUser;

	private Timestamp createdTimeStamp;

	private String lastUpdatedUser;

	private Timestamp lastUpdatedTimeStamp;

	private int asOfDate;


}
