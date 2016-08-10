package com.batchly.extension.response;


public interface IResponse   
{
    String getID();

    void setID(String value);
    
    ResponseStatus getStatus();
    
    void setStatus(ResponseStatus status);
}





