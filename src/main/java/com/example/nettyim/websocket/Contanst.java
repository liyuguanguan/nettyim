package com.example.nettyim.websocket;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/5 下午5:41
 */
public class Contanst {

    public static ConcurrentHashMap<String, ChannelHandlerContext> map = new ConcurrentHashMap<>();

    public static ConcurrentHashMap<String, ChannelHandlerContext> getMap() {
        return map;
    }

    public static void setMap(String remoteAddress,ChannelHandlerContext channel) {
        map.put(remoteAddress, channel);
    }

    public static void remove(String remoteAddress) {
        map.remove(remoteAddress);
    }
}
