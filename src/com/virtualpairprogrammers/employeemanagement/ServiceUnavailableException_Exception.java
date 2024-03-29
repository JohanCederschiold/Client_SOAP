
package com.virtualpairprogrammers.employeemanagement;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ServiceUnavailableException", targetNamespace = "http://employeemanagement.virtualpairprogrammers.com/")
public class ServiceUnavailableException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ServiceUnavailableException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ServiceUnavailableException_Exception(String message, ServiceUnavailableException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ServiceUnavailableException_Exception(String message, ServiceUnavailableException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.virtualpairprogrammers.employeemanagement.ServiceUnavailableException
     */
    public ServiceUnavailableException getFaultInfo() {
        return faultInfo;
    }

}
