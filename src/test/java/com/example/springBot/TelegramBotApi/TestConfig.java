package com.example.springBot.TelegramBotApi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestConfig {
    @Value("${telegram.bot.name}")
    private String botName;

    @Test
    void testGetConf() {
        Assertions.assertThat(botName).isEqualTo("nohingBot");
    }
}
