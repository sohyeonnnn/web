package com.refactoring.ilgusi.application.notice;

import com.refactoring.ilgusi.domain.notice.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class NoticeService {
    final NoticeRepository noticeRepository;

}
