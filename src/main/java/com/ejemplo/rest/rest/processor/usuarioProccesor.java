package com.ejemplo.rest.rest.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.ejemplo.rest.rest.dto.RequestDTO;

public class usuarioProccesor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
        RequestDTO  usuario = new RequestDTO();
		exchange.getIn().setBody(usuario);
		
	}

}
