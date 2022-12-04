package com.wetrip.wetrip.WebSocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wetrip.wetrip.domain.ChatRoom;
import com.wetrip.wetrip.dto.ChatMessage.ChatMessageDto;
import com.wetrip.wetrip.service.chat.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@RequiredArgsConstructor
@Component
public class WebSocketHandler extends TextWebSocketHandler {
    private final ObjectMapper objcetMapper;
    private final ChatService chatService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception{
        String payload = message.getPayload();
        ChatMessageDto chatMessage = objcetMapper.readValue(payload, ChatMessageDto.class);

        ChatRoom chatRoom = chatService.findRoomById(chatMessage.getRoomId());
        chatRoom.handlerActions(session, chatMessage, chatService);
    }
}
