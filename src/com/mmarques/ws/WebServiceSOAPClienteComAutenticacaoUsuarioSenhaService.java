
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
@WebServiceClient(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService", targetNamespace = "http://controller.mmarques.com/", wsdlLocation = "http://localhost:8080/AplicaoWebModeloWebServiceSOAP/WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService?WSDL")
public class WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService
    extends Service
{

    private final static URL WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_EXCEPTION;
    private final static QName WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_QNAME = new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AplicaoWebModeloWebServiceSOAP/WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_WSDL_LOCATION = url;
        WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_EXCEPTION = e;
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService() {
        super(__getWsdlLocation(), WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_QNAME);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_QNAME, features);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_QNAME);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_QNAME, features);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceSOAPClienteComAutenticacaoUsuarioSenha
     */
    @WebEndpoint(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort")
    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha getWebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort() {
        return super.getPort(new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort"), WebServiceSOAPClienteComAutenticacaoUsuarioSenha.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSOAPClienteComAutenticacaoUsuarioSenha
     */
    @WebEndpoint(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort")
    public WebServiceSOAPClienteComAutenticacaoUsuarioSenha getWebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://controller.mmarques.com/", "WebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort"), WebServiceSOAPClienteComAutenticacaoUsuarioSenha.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_EXCEPTION!= null) {
            throw WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_EXCEPTION;
        }
        return WEBSERVICESOAPCLIENTECOMAUTENTICACAOUSUARIOSENHASERVICE_WSDL_LOCATION;
    }

}
