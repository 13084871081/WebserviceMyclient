/**
 * HelloserviceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

public class HelloserviceServiceLocator extends org.apache.axis.client.Service implements demo.HelloserviceService {

    public HelloserviceServiceLocator() {
    }


    public HelloserviceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloserviceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloservicePort
    private java.lang.String HelloservicePort_address = "http://localhost:8093/webservice";

    public java.lang.String getHelloservicePortAddress() {
        return HelloservicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloservicePortWSDDServiceName = "HelloservicePort";

    public java.lang.String getHelloservicePortWSDDServiceName() {
        return HelloservicePortWSDDServiceName;
    }

    public void setHelloservicePortWSDDServiceName(java.lang.String name) {
        HelloservicePortWSDDServiceName = name;
    }

    public demo.Helloservice getHelloservicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloservicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloservicePort(endpoint);
    }

    public demo.Helloservice getHelloservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            demo.HelloservicePortBindingStub _stub = new demo.HelloservicePortBindingStub(portAddress, this);
            _stub.setPortName(getHelloservicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloservicePortEndpointAddress(java.lang.String address) {
        HelloservicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (demo.Helloservice.class.isAssignableFrom(serviceEndpointInterface)) {
                demo.HelloservicePortBindingStub _stub = new demo.HelloservicePortBindingStub(new java.net.URL(HelloservicePort_address), this);
                _stub.setPortName(getHelloservicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloservicePort".equals(inputPortName)) {
            return getHelloservicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo/", "HelloserviceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo/", "HelloservicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloservicePort".equals(portName)) {
            setHelloservicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
