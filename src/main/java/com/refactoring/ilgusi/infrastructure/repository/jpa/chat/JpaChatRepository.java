package com.refactoring.ilgusi.infrastructure.repository.jpa.chat;

import com.refactoring.ilgusi.domain.chat.Chat;
import com.refactoring.ilgusi.domain.chat.ChatContent;
import com.refactoring.ilgusi.domain.chat.ChatRepository;
import com.refactoring.ilgusi.domain.favorite.Favorite;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.service.Service;
import com.refactoring.ilgusi.domain.service.ServiceInfo;
import com.refactoring.ilgusi.domain.service.ServiceTrade;

import java.util.ArrayList;
import java.util.HashMap;

public class JpaChatRepository implements ChatRepository {
    private final SpringDataChatRepository jpaRepository;

    public JpaChatRepository(SpringDataChatRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public ArrayList<Service> chatHeartList(int mNo) {
        return null;
    }

    @Override
    public ArrayList<ServiceInfo> selectService(int sNo) {
        return null;
    }

    @Override
    public void createChat(HashMap<String, Object> room) {

    }

    @Override
    public ArrayList<Chat> selectRoomList(HashMap<String, String> myInfo) {
        return null;
    }

    @Override
    public Chat selectOneRoom(HashMap<String, Object> room) {
        return null;
    }

    @Override
    public void insertChat(HashMap<String, Object> message) {

    }

    @Override
    public void deleteChat(int cNo) {

    }

    @Override
    public void deleteOneFavorite(Favorite oneFavorite) {

    }

    @Override
    public ArrayList<ChatContent> chatContentList(int roomNo) {
        return null;
    }

    @Override
    public Member selectOneMember(String userId) {
        return null;
    }

    @Override
    public void startTrade(HashMap<String, Object> tradeInfo) {

    }

    @Override
    public void updateWorkingCount(int sNo) {

    }

    @Override
    public void switchAccount(HashMap<String, Object> map) {

    }

    @Override
    public void updateReadStatus(HashMap<String, Object> roomAndId) {

    }

    @Override
    public ArrayList<ServiceTrade> tradeList(HashMap<String, Integer> tradeInfo) {
        return null;
    }

    @Override
    public void deleteMsg(int ccNo) {

    }
}
