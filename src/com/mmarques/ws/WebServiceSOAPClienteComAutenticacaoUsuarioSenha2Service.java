
package com.mmarques.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service", targetNamespace = "http://controller.mmarques.com/", wsdlLocation = "http://localhost:8080/AplicaoWebModeloWebServiceSOAP/WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service?WSDL")
public class WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service
    extends Service
{

    private final static URL WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_EXCEPTION;
    private final static QName WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_QNAME = new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AplicaoWebModeloWebServiceSOAP/WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_WSDL_LOCATION = url;
        WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_EXCEPTION = e;
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service() {
        super(__getWsdlLocation(), WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_QNAME);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_QNAME, features);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_QNAME);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_QNAME, features);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceSOAPClienteComAutenticacaoUsuarioSenha2
     */
    @WebEndpoint(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port")
    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2 getWebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port() {
        return super.getPort(new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port"), WebServiceSOAPClienteComAutenticacaoUsuarioSenha2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSOAPClienteComAutenticacaoUsuarioSenha2
     */
    @WebEndpoint(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port")
    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha2 getWebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port"), WebServiceSOAPClienteComAutenticacaoUsuarioSenha2.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_EXCEPTION!= null) {
            throw WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_EXCEPTION;
        }
        return WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHA2SERVICE_WSDL_LOCATION;
    }

}