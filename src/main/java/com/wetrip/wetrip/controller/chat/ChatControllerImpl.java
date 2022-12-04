package com.wetrip.wetrip.controller.chat;

import com.wetrip.wetrip.domain.ChatRoom;
import com.wetrip.wetrip.service.chat.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatControllerImpl implements ChatController{
    private final ChatService chatService;


    @Override
    @PostMapping
    public ChatRoom createRoom(@RequestBody String name) {
        return chatService.createRoom(name);
    }

    @Override
    @GetMapping
    public List<ChatRoom> findAllRoom() {
        return chatService.findAllRoom();
    }
}
