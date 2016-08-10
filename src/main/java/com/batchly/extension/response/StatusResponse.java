package com.batchly.extension.response;


public class StatusResponse implements IResponse
{
    /**
    * Unique Identifier for Unit of Work
    */
	private String ID ;
    
	 /**
	  * Status of the processing
	  */
	private ResponseStatus status ;
	

	public String getID() {
		return ID;
	}

	public void setID(String id) {
		this.ID = id;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "StatusResponse [ID=" + ID + ", status=" + status + "]";
	}

}


