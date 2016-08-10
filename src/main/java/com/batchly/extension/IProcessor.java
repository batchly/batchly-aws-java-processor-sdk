package com.batchly.extension;


/**
* Interface for writing extensions for batchly.
* This interface has a single method which needs to be implemented with Unit of Work (UoW) code.
*/
public interface IProcessor<Request, Response>   
{
    /**
    * Process method should be implemented in a stateless manner to ensure fault tolerance.
    * Once implemented, the compiled output along with necessary dependencies should be compressed into a zip folder and uploaded into batchly portal to create a new processor.
    * While uploading the processor, you need to configure the right request/response parameters for ensuring the right bootstrapping during operations.
    * You can consider the parameters as Idempotent as long as you configure the same on portal.  The parameters will be assigned automatically during Job run.
    * 
    *  @param request 
    * 
    * Supports the following implementations.
    * 
    * 1. QueueRequest - The unique identifier for UoW will be assigned and sent to processor. Actual usage is completely within the processor Implementation.
    * 2. FileRequest - Built for file storage input sources.  The file would be downloaded from storage and saved to local disk.
    * 3. DelimitedFileRequest - Built for file storage input sources.
    * 4. DbRequest - Records would be retrieved from the given database/table connectionString
    * 
    *  @return 
    * 
    * Supports the following implementations.
    * 
    * 1. StatusResponse - Share the status of your processing.
    * 2. FileResponse - Built for file storage output.  Allows processor to share the location of response files that need to be saved to storage.
    * 3. DbResponse - updates the database for the process input DbRequest record.
    */
	Response process(Request request) throws Exception;

}


