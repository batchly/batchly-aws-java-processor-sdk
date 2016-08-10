package com.batchly.extension.request;

import java.util.Arrays;
import java.util.Map;

public class DelimitedFileRequest implements IRequest 
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
		 * fields contain the individual columns of a delimiter row
		 */
		private String[] fields;
		
		/**
		* Path for loading additional content - Path to container from where code is executed
		*/
		private String contentPath ;

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

		public String[] getFields() {
			return fields;
		}

		public void setFields(String[] fields) {
			this.fields = fields;
		}

		public String getContentPath() {
			return contentPath;
		}

		public void setContentPath(String contentPath) {
			this.contentPath = contentPath;
		}

		@Override
		public String toString() {
			return "DelimitedFileRequest [ID=" + ID + ", Parameters="
					+ parameters + ", Fields=" + Arrays.toString(fields)
					+ ", ContentPath=" + contentPath + "]";
		}

				
}
