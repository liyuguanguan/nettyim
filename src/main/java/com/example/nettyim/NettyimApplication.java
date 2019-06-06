package com.example.nettyim;

import com.example.nettyim.websocket.WebSocketServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyimApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettyimApplication.class, args);
    }

    /**
     * 实现CommandLineRunner 项目启动之后执行
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        WebSocketServer webSocketServer = new WebSocketServer();
        webSocketServer.run();
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                webSocketServer.destory();
            }
        });
    }
}
