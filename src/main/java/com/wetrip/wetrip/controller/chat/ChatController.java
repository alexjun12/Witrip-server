package com.wetrip.wetrip.controller.chat;

import com.wetrip.wetrip.domain.ChatRoom;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ChatController {
    public ChatRoom createRoom(String name);
    public List<ChatRoom> findAllRoom();
}
