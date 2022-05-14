package zzangmin.practice.service;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TempServiceTest {

    @Autowired
    private TempService tempService;


    @Test
    @DisplayName("autowired 제대로 되는지 실험")
    void saveTest() {
        tempService.save();
    }


}
