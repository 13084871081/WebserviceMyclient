package demo;

public class HelloserviceProxy implements demo.Helloservice {
  private String _endpoint = null;
  private demo.Helloservice helloservice = null;
  
  public HelloserviceProxy() {
    _initHelloserviceProxy();
  }
  
  public HelloserviceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloserviceProxy();
  }
  
  private void _initHelloserviceProxy() {
    try {
      helloservice = (new demo.HelloserviceServiceLocator()).getHelloservicePort();
      if (helloservice != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloservice)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloservice != null)
      ((javax.xml.rpc.Stub)helloservice)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public demo.Helloservice getHelloservice() {
    if (helloservice == null)
      _initHelloserviceProxy();
    return helloservice;
  }
  
  public java.lang.String hello(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloservice == null)
      _initHelloserviceProxy();
    return helloservice.hello(arg0);
  }
  
  
}