
package com.mmarques.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceSOAPClienteComAutenticacaoUsuarioSenha2", targetNamespace = "http://resource.mmarques.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceSOAPClienteComAutenticacaoUsuarioSenha2 {


    /**
     * 
     * @param password
     * @param parameters
     * @param username
     * @return
     *     returns com.mmarques.ws.EcoResponse
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(name = "ecoResponse", targetNamespace = "http://resource.mmarques.com/", partName = "result")
    @Action(input = "http://resource.mmarques.com/WebServiceSOAPClienteComAutenticacaoUsuarioSenha2/ecoRequest", output = "http://resource.mmarques.com/WebServiceSOAPClienteComAutenticacaoUsuarioSenha2/ecoResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://resource.mmarques.com/WebServiceSOAPClienteComAutenticacaoUsuarioSenha2/eco/Fault/Exception")
    })
    public EcoResponse eco(
        @WebParam(name = "eco", targetNamespace = "http://resource.mmarques.com/", partName = "parameters")
        Eco parameters,
        @WebParam(name = "Username", targetNamespace = "http://resource.mmarques.com/", header = true, partName = "Username")
        String username,
        @WebParam(name = "Password", targetNamespace = "http://resource.mmarques.com/", header = true, partName = "Password")
        String password)
        throws Exception_Exception
    ;

}
