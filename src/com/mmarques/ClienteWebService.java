package com.mmarques;

import com.mmarques.ws.Eco;
import com.mmarques.ws.EcoResponse;
import com.mmarques.ws.Exception_Exception;
import com.mmarques.ws.WebServiceSOAPClienteComAutenticacaoUsuarioSenha;
import com.mmarques.ws.WebServiceSOAPClienteComAutenticacaoUsuarioSenha2;
import com.mmarques.ws.WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service;
import com.mmarques.ws.WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService;
import com.mmarques.ws.WebServiceSOAPEnviaRecebeArquivoService;
import com.mmarques.ws.WebServiceSOAPEnviaRecebeArquivo;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.handler.MessageContext;


public class ClienteWebService {
    public static void main(String [] args){
        //Servico 1
        WebServiceSOAPClienteComAutenticacaoUsuarioSenha ws = 
        new WebServiceSOAPClienteComAutenticacaoUsuarioSenhaService().getWebServiceSOAPClienteComAutenticacaoUsuarioSenhaPort();
        
        //Início - Autenticação do serviço
        Map<String,Object> req_ctx = ((BindingProvider)ws).getRequestContext();
        Map<String,List<String>> headers = new HashMap<String,List<String>>();
        headers.put("Username",Collections.singletonList("marcos"));
        headers.put("Password",Collections.singletonList("123"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
        //Fim - Autenticação do serviço
        
        try {
            ws.listar().forEach((cliente) -> {
                System.out.println(cliente.getCodigo() + " - " + cliente.getNome());
            });
        } catch (Exception_Exception ex) {
            Logger.getLogger(ClienteWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Servico 2 - outra forma de autenticar
        WebServiceSOAPClienteComAutenticacaoUsuarioSenha2 ws2 = 
        new WebServiceSOAPClienteComAutenticacaoUsuarioSenha2Service().getWebServiceSOAPClienteComAutenticacaoUsuarioSenha2Port();
       
        
        Eco eco = new Eco();
        eco.setParametro1("Olá");
        
        try {
            EcoResponse retorno =  ws2.eco(eco, "marcos", "123");
            System.out.println(retorno.getReturn());
        } catch (Exception_Exception ex) {
            Logger.getLogger(ClienteWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Envia arquivo
        WebServiceSOAPEnviaRecebeArquivo ws3 = new WebServiceSOAPEnviaRecebeArquivoService().getWebServiceSOAPEnviaRecebeArquivoPort();
        
        String filePath = "d:/temp/arquivo.txt";
        
        File file = new File(filePath);
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            BufferedInputStream inputStream = new BufferedInputStream(fis);
            byte[] fileBytes = new byte[(int) file.length()];
            inputStream.read(fileBytes);
            inputStream.close();
            ws3.upload("arquivoenviado.txt", fileBytes);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClienteWebService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClienteWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Recebe arquivo
        filePath = "d:/temp/arquivobaixado.txt";
        try{
            FileOutputStream fos = new FileOutputStream(filePath);
            BufferedOutputStream outputStream = new BufferedOutputStream(fos);
            outputStream.write(ws3.download("arquivo.txt"));
            outputStream.close();
        }catch(IOException e){
            System.err.println(e);
            throw new WebServiceException(e);
        }
        
    }
}
