package com.batchly.extension.response;

import java.util.Map;


public class DbResponse implements IResponse {
	/**
	 * Unique Identifier for Unit of Work
	 */
	private String ID;


	 /**
	  * Status of the processing
	  */
	private ResponseStatus status ;

	/**
	 * Parameter Name and Data pair for each parameter of the SQL Query that is
	 * run on successful processing. The query is configured as part of Batchly
	 * Portal and is run in sequence to ensure successful writes to the
	 * database.
	 */
	private Map<String, String> parameterValues;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public Map<String, String> getParameterValues() {
		return parameterValues;
	}

	public void setParameterValues(Map<String, String> parameterValues) {
		this.parameterValues = parameterValues;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DbResponse [ID=" + ID + ", status=" + status
				+ ", parameterValues=" + parameterValues + "]";
	}
	
		
}
