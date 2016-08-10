package com.batchly.extension.request;

import java.util.Map;


public class QueueRequest implements IRequest
{
    /**
    * Unique ID of the Unit of Work
    */
	private String ID ;
    
    /**
    * Parameters that has been configured in portal
    */
	private Map<String, String> parameters ;
    
    /**
    * Content of the request if Job is configured to send more than just the ID
    */
	private String content ;
    
    /**
    * Path for loading additional content - Path to container from where code is executed
    */
	private String contentPath ;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public void setParameters(Map<String, String> parameters) {
		this.parameters = parameters;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContentPath() {
		return contentPath;
	}

	public void setContentPath(String contentPath) {
		this.contentPath = contentPath;
	}

	@Override
	public String toString() {
		return "DefaultRequest [ID=" + ID + ", Parameters=" + parameters
				+ ", Content=" + content + ", ContentPath=" + contentPath + "]";
	}
	   
}


