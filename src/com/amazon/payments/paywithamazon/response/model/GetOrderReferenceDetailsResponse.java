package com.amazon.payments.paywithamazon.response.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getOrderReferenceDetailsResult",
    "responseMetadata"
})
@XmlRootElement(name = "GetOrderReferenceDetailsResponse")
public class GetOrderReferenceDetailsResponse {

    @XmlElement(name = "GetOrderReferenceDetailsResult", required = true)
    protected GetOrderReferenceDetailsResult getOrderReferenceDetailsResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadata responseMetadata;

    public GetOrderReferenceDetailsResponse() {
        super();
    }
    
    public GetOrderReferenceDetailsResult getGetOrderReferenceDetailsResult() {
        return getOrderReferenceDetailsResult;
    }

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }
    
    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderReferenceDetails"
    })
    @XmlRootElement(name = "GetOrderReferenceDetailsResult")
    public static class GetOrderReferenceDetailsResult {

        @XmlElement(name = "OrderReferenceDetails")
        protected OrderReferenceDetails orderReferenceDetails;

        public GetOrderReferenceDetailsResult() {
            super();
        }

        public OrderReferenceDetails getOrderReferenceDetails() {
            return orderReferenceDetails;
        }
    }
}