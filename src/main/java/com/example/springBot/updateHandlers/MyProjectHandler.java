package com.example.springBot.updateHandlers;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyProjectHandler extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "nohingBot";
    }

    @Override
    public String getBotToken() {
        return "5043745385:AAFdbOE4W51NVLNnxO5WEdDHEWlRMcrZ0hM";
    }

    @Override
    public void onUpdateReceived(Update update) {
//check if the update has a message
        if(update.hasMessage()){
            Message message = update.getMessage();

            //check if the message has text. it could also  contain for example a location ( message.hasLocation() )
            if(message.hasText()){

                //create a object that contains the information to send back the message
                SendMessage sendMessageRequest = new SendMessage();
                sendMessageRequest.setChatId(message.getChatId().toString()); //who should get the message? the sender from which we got the message...
                sendMessageRequest.setText("you said: " + message.getText());
                System.out.println(sendMessageRequest);//at the end, so some magic and send the message ;)

                try {
                    execute(sendMessageRequest);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }//end if()
        }//end  if()
    }
}
