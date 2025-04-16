package com.refactoring.ilgusi.application.chat;


import com.refactoring.ilgusi.domain.chat.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@RequiredArgsConstructor
@Service
public class ChatService {
    private final ChatRepository chatRepository;


}
