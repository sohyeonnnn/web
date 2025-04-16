package com.refactoring.ilgusi.application.notice;

import com.refactoring.ilgusi.common.ResultData;
import com.refactoring.ilgusi.domain.notice.Notice;
import com.refactoring.ilgusi.domain.notice.NoticePageData;
import com.refactoring.ilgusi.domain.notice.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Map;

@Transactional
@RequiredArgsConstructor
@Service
public class NoticeService {
    final NoticeRepository noticeRepository;

    public ResultData<NoticePageData> selectNoticeList(Map<String, Object> paramMap){
        /*NoticePageData npd = noticeRepository.findBy;*/
        NoticePageData npd = new NoticePageData();

        int reqPage = (Integer)paramMap.get("reqPage");
        String keyword = (String)paramMap.get("keyword");

        int numPerPage = 12;
        int end = reqPage*numPerPage;
        int start = (end-numPerPage) +1;

        int totalCount = noticeRepository.totalCount();

        int totalPage = 0;
        if(totalCount%numPerPage == 0) {
            totalPage = totalCount/numPerPage;
        }else {
            totalPage = totalCount/numPerPage+1;
        }

        //페이지 네비
        int pageNaviSize = 5;
        int pageNo = ((reqPage-1)/pageNaviSize)*pageNaviSize +1;
        String pageNavi = "<ul class='pagination justify-content-center'>";

        //이전 버튼
        if(pageNo != 1) {
            pageNavi += "<li class='page-item'><a class='page-link' href='/noticeList?reqPage="+(pageNo-1)+"&keyword="+keyword+"'>pre</a></li>";
        }
        //페이지 네비 버튼
        for(int i =0; i<pageNaviSize; i++) {
            if(reqPage == pageNo) {
                pageNavi += "<li class='page-item'>"
                        + "<span class='page-link selected'>"+pageNo+"</span></li>";
            }else {
                pageNavi += "<li class='page-item'>"
                        + "<a class='page-link' href='/noticeList?reqPage="+(pageNo)+"&keyword="+keyword+"'>"+pageNo+"</a></li>";
            }
            pageNo++;

            if(pageNo > totalPage) {
                break;
            }
        }

        if(reqPage <= (totalPage/pageNaviSize)) {
            pageNavi += "<li class='page-item'>"
                    + "<a class='page-link' href='/noticeList.do?reqPage="+(pageNo+1)+"&keyword="+keyword+"'> next </a></li>";
        }

        if(totalCount <= numPerPage) {
            pageNavi = "</ul>";
        }

        ArrayList<Notice> list = null;//noticeRepository.selectNoticeList(start,end,keyword);
        npd.setList(list);
        npd.setPageNavi(pageNavi);



        return ResultData.success(npd, null);
    }

}
