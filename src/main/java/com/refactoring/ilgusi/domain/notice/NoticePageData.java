package com.refactoring.ilgusi.domain.notice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class NoticePageData {
	private ArrayList<Notice> list;
	private String pageNavi;
}
