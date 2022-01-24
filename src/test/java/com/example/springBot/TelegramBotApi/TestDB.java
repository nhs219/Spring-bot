package com.example.springBot.TelegramBotApi;

import com.example.springBot.jpa.TestEntity;
import com.example.springBot.jpa.TestRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TestDB {

    @Autowired
    TestRepository testRepository;

    @Test
    void save() {
        TestEntity entity = TestEntity.builder()
                .id(3)
                .name("test3")
                .build();

        testRepository.save(entity);
    }

    @Test
    void select() {
        TestEntity entity = testRepository.findByIdAndName(1, "test");
        Assertions.assertThat(entity.getId()).isEqualTo(1);
    }
}
