package com.klab.java8features;

public enum CFFConstraintVolumesFileColumnIndex {

	PPV_CODE(0), PTVL_CODE(1), MODEL_YEAR(2), MARKET_WERS_CODE(3), CHANNEL_WERS_CODE(4), CONTROLLABLE_FEATURE(5), BUILD_WEEK(6), 
	CONSTRAINT_EXPRESSION(7), OPERATOR(8), VOLUME(9), PRIORITY(10), AS_OF_DATE(11), PLANT_CODE(12);

	private int value;

	CFFConstraintVolumesFileColumnIndex(final int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
