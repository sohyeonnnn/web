package com.refactoring.ilgusi.domain.member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_no")
	private Integer mNo;
	@Column(nullable=false)
	private String mId;
	@Column(nullable=false)
	private String mPw;
	@Column(nullable=false)
	private String mName;
	@Column(nullable=false)
	private String mEmail;
	@Column
	private String mPhone;
	@Enumerated(EnumType.STRING)
	@Column
	private RoleEnum mGrade;
	@Column
	private Integer warningCount;
	@Column
	private String introduce;
	@Column
	private String enrollDate;
	@Column
	private String brandName;
	@Column
	private String contactTime;
	@Column
	private Integer buyingCount;
	@Column
	private Integer sellingCount;
	// 줄바꿈
	public String getIntroduceBr() {
		return introduce.replaceAll("\r\n", "<br>");
	}

}
