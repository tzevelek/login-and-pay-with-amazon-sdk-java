package com.amazon.payments.lpa.exceptions;

import com.amazon.payments.lpa.response.autogenerated.model.HttpResponseObject;

public class AmazonClientException extends RuntimeException {
    
    private String message;
    private int statusCode;
    private String serviceResponseXML;
    
    public AmazonClientException(HttpResponseObject response , String message , Throwable t) {
        super("Client Exception: " + message , t);
        this.serviceResponseXML = response.getData();
        this.statusCode = response.getStatusCode();
    }

    public AmazonClientException(String message , Throwable t) {
        super(message , t);
        this.message = message;
    }
    
    public AmazonClientException(String message) {
        this.message = message;
    }
    
    public int getStatusCode() {
        return statusCode;
    }

    public String getServiceResponseXML() {
        return serviceResponseXML;
    }
    
    public String getMessage() {
        return message;
    }
    
}