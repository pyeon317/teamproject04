package com.team04.air.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Non_MemberVO {
	
	private Integer reservation_num; //예약번호
	
	private String nonmember_num; //비회원번호
	private String nonmember_name; //비회원이름
	private String nonmember_registNum; //주민번호
	private String nonmember_email; //이메일
	private String nonmember_phoneNum; //연락처
	
}
