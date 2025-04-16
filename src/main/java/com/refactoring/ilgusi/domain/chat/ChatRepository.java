package com.refactoring.ilgusi.domain.chat;

import com.refactoring.ilgusi.domain.favorite.Favorite;
import com.refactoring.ilgusi.domain.member.Member;
import com.refactoring.ilgusi.domain.service.Service;
import com.refactoring.ilgusi.domain.service.ServiceInfo;
import com.refactoring.ilgusi.domain.service.ServiceTrade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ChatRepository {

    // (소현)찜한 서비스 불러오기
    ArrayList<Service> chatHeartList(int mNo);

    // (소현)서비스 정보 불러오기
    ArrayList<ServiceInfo> selectService(int sNo);

    // (소현)채팅방 생성
    void createChat(HashMap<String, Object> room);

    // (소현)일반회원아이디로 채팅방 불러오기
    ArrayList<Chat> selectRoomList(HashMap<String, String> myInfo);

    // (소현)채팅방 불러오기
    Chat selectOneRoom(HashMap<String, Object> room);

    // (소현)보낸메세지 저장
    void insertChat(HashMap<String, Object> message);

    // (소현)채팅방 삭제
    void deleteChat(int cNo);

    // (소현)문의 시작한 서비스 찜리스트에서 삭제
    void deleteOneFavorite(Favorite oneFavorite);

    // (소현)해당 번호 채팅방에서 대화 불러오기
    ArrayList<ChatContent> chatContentList(int roomNo);

    // (소현)아이디로 회원 불러오기
    Member selectOneMember(String userId);

    // (소현)serviceTrade에 insert
    void startTrade(HashMap<String, Object> tradeInfo);

    // (소현)service working_conut 1증가
    void updateWorkingCount(int sNo);

    // (소현)일반회원-프리랜서 전환
    void switchAccount(HashMap<String, Object> map);

    //상대가 보낸 메세지 읽음 처리
    void updateReadStatus(HashMap<String, Object> roomAndId);

    //거래내역 불러와서 견적서 작성여부 확인
    ArrayList<ServiceTrade> tradeList(HashMap<String, Integer> tradeInfo);

    //(소현)메세지 삭제
    void deleteMsg(int ccNo);


}
