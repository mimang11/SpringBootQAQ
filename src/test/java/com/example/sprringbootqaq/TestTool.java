package com.example.sprringbootqaq;


import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
/**
 * @Author he
 * @Date 2022/11/10 6:48
 * @Version 1.0
 */
@SpringBootTest
public class TestTool {

    @Test
    public  void  testDemo(){
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("ammQAQ");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("qq121212");
        System.out.println("username: " + username);
        System.out.println("password:" + password);
    }
}
