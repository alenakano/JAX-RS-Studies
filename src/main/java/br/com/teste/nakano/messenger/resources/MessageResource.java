package br.com.teste.nakano.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.teste.nakano.messenger.model.Message;
import br.com.teste.nakano.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {

	MessageService messageService = new MessageService();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML + "; charset=UTF-8")
	public List<Message> retorno () {
		return this.messageService.getAllMessages();
	}
	
}
