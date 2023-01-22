package org.example;

import org.example.controller.WebSocketSever;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class WebSocket {
    public static void main(String[] args) {
        SpringApplication.run(WebSocket.class,args);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                WebSocketSever.sendAllMessage(new Date().toString());
            }
        },new Date(),1000);
    }
}