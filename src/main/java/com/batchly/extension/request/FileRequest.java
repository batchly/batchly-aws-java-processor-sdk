package com.batchly.extension.request;

import java.util.Map;

public class FileRequest implements IRequest
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
	    * Path for loading additional content - Path to container from where code is executed
	    */
		private String contentPath ;
		
		/**
		 * Location of the file on disk
		 */
		private String location ;
		

		public String getID() {
			return ID;
		}

		public void setID(String id) {
			this.ID = id;
		}

		public Map<String, String> getParameters() {
			return parameters;
		}

		public void setParameters(Map<String, String> parameters) {
			this.parameters = parameters;
		}

		public String getContentPath() {
			return contentPath;
		}

		public void setContentPath(String contentPath) {
			this.contentPath = contentPath;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		@Override
		public String toString() {
			return "DiskFileRequest [id=" + ID + ", parameters=" + parameters
					+ ", contentPath=" + contentPath
					+ ", location=" + location + "]";
		}
		
}


