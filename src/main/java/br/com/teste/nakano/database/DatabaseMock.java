package br.com.teste.nakano.database;

import java.util.HashMap;
import java.util.Map;

import br.com.teste.nakano.messenger.model.Message;
import br.com.teste.nakano.messenger.model.Profile;

public class DatabaseMock {
	
	//Não é threadsafe, pois é um mock para aprendizagem
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profile = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	
	public static Map<Long, Profile> getProfile() {
		return profile;
	}	
}
