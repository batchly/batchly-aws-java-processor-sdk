package com.batchly.extension.response;

import java.util.List;


public class FileResponse   implements IResponse
{
    /**
    * Unique Identifier for Unit of Work
    */
	private String ID ;
    
    /**
    * Status of the processing
    */
	private ResponseStatus status ;
    
	/**
    * Locations of the ouptut files on disk.
    * One full path per output file.  Disk File Name is used as file name for response.
    * E.g.:- C:\Processed\Output\File1.png - Saved to storage as File.Png
    */
	private List<String> locations;
	

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public ResponseStatus getStatus() {
		return status;
	}

	public void setStatus(ResponseStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "FileResponse [ID=" + ID + ", status=" + status + ", locations="
				+ locations + "]";
	}
			   
}


