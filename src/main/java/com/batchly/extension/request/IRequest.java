package com.batchly.extension.request;

import java.util.Map;


public interface IRequest   
{
    /**
    * ID for the Unit of Work
    */
    String getID();

    void setID(String value);

    /**
    * Values for parameters configured via UI
    */
    Map<String, String> getParameters();

    void setParameters(Map<String, String> value);

    /**
    * Path for loading additional content - Path to container from where code is executed
    */
    String getContentPath();

    void setContentPath(String value);

}


