/**
 * HelloserviceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package demo;

public interface HelloserviceService extends javax.xml.rpc.Service {
    public java.lang.String getHelloservicePortAddress();

    public demo.Helloservice getHelloservicePort() throws javax.xml.rpc.ServiceException;

    public demo.Helloservice getHelloservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
