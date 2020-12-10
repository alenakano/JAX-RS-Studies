package br.com.teste.nakano.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.teste.nakano.database.DatabaseMock;
import br.com.teste.nakano.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseMock.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1, "Oi do Java", "Ale"));
		messages.put(2L, new Message(2, "Oiee, Java", "Ale"));
	}
	
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message deleteMessage(long id) {
		return messages.remove(id);
	}
	
}
