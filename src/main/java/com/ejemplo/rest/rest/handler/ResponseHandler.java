package com.ejemplo.rest.rest.handler;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Exchange;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;
import com.ejemplo.rest.rest.dto.ResponseDTO;

/**
 * 
 * @author Assert Solutions S.A.S <info@assertsolutions.com> <br/>
 *         Date: 9/04/2018 8:11:28 a.m.
 *
 */
@Component
public class ResponseHandler {

	@Handler
	public void createResponse(Exchange exchange) {
		// Create Entity for Response

		Object json =  exchange.getIn().getBody();
		exchange.getOut().setBody(json);
		exchange.getOut().setHeader(Exchange.ACCEPT_CONTENT_TYPE, "application/json; charset=UTF-8");
		exchange.getOut().setHeader(Exchange.CONTENT_TYPE, "application/json; charset=UTF-8");
	}

}
