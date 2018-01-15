package com.neo;

import com.neo.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {


    @Autowired
    private MailService mailService;
    private static final String[] RECIPIENTS = {"874822608@qq.com"};
    private static final String SUBJECT = "proba";

    @Test
    public void contextLoads() {
        System.out.println("hello world");
    }

    @Test
    public void sendNormalTextMessage() {
        try {
            mailService.sendSimpleMail("874822608@qq.com", SUBJECT, "Ez egy lev�l t�rzs");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Test
    public void sendHtmlTemplateMessage() {
        String[] messages = {"Ez egy �zenet�������", "Valami", "m�sik", "Harmadik"};
        Map<String, Object> datas = new HashMap<>();
        datas.put("messages", messages);
        try {
//            mailService.sendHtmlMail("874822608@qq.com", SUBJECT, "MailTemplate1");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


}
