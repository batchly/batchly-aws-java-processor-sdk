package com.batchly.extension.request;

import java.sql.ResultSet;
import java.util.Map;
import javax.sql.rowset.CachedRowSet;
import com.sun.rowset.CachedRowSetImpl;

public class DbRequest implements IRequest
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
		* Connection String for connecting to database
		*/
		private String connectionString;
		
		/**
		* Dataset of data required to process unit of work.
		* If the configured query returns multiple record sets, each record set is a table within the dataset.
		*/
		private CachedRowSet data ;
	    
	    /**
	    * Content of the request if Job is configured to send more than just the ID
	    */
		private String contentType ;
	    
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

		public String getConnectionString() {
			return connectionString;
		}

		public void setConnectionString(String connectionString) {
			this.connectionString = connectionString;
		}

		public ResultSet getData() {
			return data;
		}

		public void setData(CachedRowSet data) {
			this.data = data;
		}

		public String getContentType() {
			return contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getContentPath() {
			return contentPath;
		}

		public void setContentPath(String contentPath) {
			this.contentPath = contentPath;
		}

		@Override
		public String toString() {
			return "TableDataRequest [ID=" + ID + ", Parameters=" + parameters
					+ ", ConnectionString=" + connectionString + ", Data="
					+ data + ", ContentType=" + contentType + ", ContentPath="
					+ contentPath + "]";
		}

}


