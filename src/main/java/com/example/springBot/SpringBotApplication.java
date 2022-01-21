package com.example.springBot;

import com.example.springBot.updateHandlers.MyProjectHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramBot;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringBotApplication {
	public static void main(String[] args) {
		ApiContextInitializer.init();
		//여기서 오류 났었는데 버전 문제인듯 ㅠㅠ 젠장 오래 걸렸다....
		TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
		try {
			telegramBotsApi.registerBot(new MyProjectHandler());
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}//end catch()
	}
}
