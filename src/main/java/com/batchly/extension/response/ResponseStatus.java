package com.batchly.extension.response;

public enum ResponseStatus {
	 SUCCESS(1), FAILED(2), SKIPPED(3);
	    
	    private final int value;
	    private ResponseStatus(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
}