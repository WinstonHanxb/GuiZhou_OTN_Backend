package com.otn.webservice.com.inspur;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "ResourceServiceDelegate", targetNamespace = "http://inspur.com/")
public interface ResourceServiceDelegate {

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getChannel", targetNamespace = "http://inspur.com/", className = "com.inspur.GetChannel")
	@ResponseWrapper(localName = "getChannelResponse", targetNamespace = "http://inspur.com/", className = "com.inspur.GetChannelResponse")
	public String getChannel();

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAllEquip", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquip")
	@ResponseWrapper(localName = "getAllEquipResponse", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquipResponse")
	public String getAllEquip();

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAllEquipLink", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquipLink")
	@ResponseWrapper(localName = "getAllEquipLinkResponse", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquipLinkResponse")
	public String getAllEquipLink();

	/**
	 * 
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "getAllEquipCardByAmp", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquipCardByAmp")
	@ResponseWrapper(localName = "getAllEquipCardByAmpResponse", targetNamespace = "http://inspur.com/", className = "com.inspur.GetAllEquipCardByAmpResponse")
	public String getAllEquipCardByAmp();

	/**
	 * 
	 * @param arg0
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "fileUp", targetNamespace = "http://inspur.com/", className = "com.inspur.FileUp")
	@ResponseWrapper(localName = "fileUpResponse", targetNamespace = "http://inspur.com/", className = "com.inspur.FileUpResponse")
	public String fileUp(@WebParam(name = "arg0", targetNamespace = "")
	String arg0);

}
