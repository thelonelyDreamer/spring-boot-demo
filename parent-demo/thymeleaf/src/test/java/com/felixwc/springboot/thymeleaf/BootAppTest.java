package com.felixwc.springboot.thymeleaf;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.felixwc.springboot.thymeleaf.pojo.test.UserVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootAppTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void test1() throws JsonProcessingException {
        UserVO userVO = new UserVO().setName("扎桑");
        System.out.println(objectMapper.writer().writeValueAsString(userVO));
        UserVO userVO1 = objectMapper.readValue("{\"id\":0,\"name\":\"扎桑\",\"password\":null}", UserVO.class);
        System.out.println(userVO1);
    }

}