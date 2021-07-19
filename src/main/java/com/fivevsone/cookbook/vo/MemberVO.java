package com.fivevsone.cookbook.vo;

import java.io.Serializable;
import java.util.Date;

public class MemberVO implements Serializable {
private static final long serialVersionUID = 1L;

private int memCode;
private String memId;
private String memPwd;
private String memName;
private String memNickName;
private String memEmail;
private String memGender;
private int memGrade;
private Date regDate;
private Date conDate;
private String bookMark;
private String memIntroduce;
private int memState;

// 흥미 
private String sitCode;
private String natCode;
//

public int getMemCode() {
	return memCode;
}
public void setMemCode(int memCode) {
	this.memCode = memCode;
}
public String getMemId() {
	return memId;
}
public void setMemId(String memId) {
	this.memId = memId;
}
public String getMemPwd() {
	return memPwd;
}
public void setMemPwd(String memPwd) {
	this.memPwd = memPwd;
}
public String getMemName() {
	return memName;
}
public void setMemName(String memName) {
	this.memName = memName;
}
public String getMemNickName() {
	return memNickName;
}
public void setMemNickName(String memNickName) {
	this.memNickName = memNickName;
}
public String getMemEmail() {
	return memEmail;
}
public void setMemEmail(String memEmail) {
	this.memEmail = memEmail;
}
public String getMemGender() {
	return memGender;
}
public void setMemGender(String memGender) {
	this.memGender = memGender;
}
public int getMemGrade() {
	return memGrade;
}
public void setMemGrade(int memGrade) {
	this.memGrade = memGrade;
}
public Date getRegDate() {
	return regDate;
}
public void setRegDate(Date regDate) {
	this.regDate = regDate;
}
public Date getConDate() {
	return conDate;
}
public void setConDate(Date conDate) {
	this.conDate = conDate;
}
public String getBookMark() {
	return bookMark;
}
public void setBookMark(String bookMark) {
	this.bookMark = bookMark;
}
public String getMemIntroduce() {
	return memIntroduce;
}
public void setMemIntroduce(String memIntroduce) {
	this.memIntroduce = memIntroduce;
}
public int getMemState() {
	return memState;
}
public void setMemState(int memState) {
	this.memState = memState;
}
public String getSitCode() {
	return sitCode;
}
public void setSitCode(String sitCode) {
	this.sitCode = sitCode;
}
public String getNatCode() {
	return natCode;
}
public void setNatCode(String natCode) {
	this.natCode = natCode;
}

@Override
public String toString() {
	return "MemberVO [memCode=" + memCode + ", memId=" + memId + ", memPwd=" + memPwd + ", memName=" + memName
			+ ", memNickName=" + memNickName + ", memEmail=" + memEmail + ", memGender=" + memGender + ", memGrade="
			+ memGrade + ", regDate=" + regDate + ", conDate=" + conDate + ", bookMark=" + bookMark + ", memIntroduce="
			+ memIntroduce + ", memState=" + memState + ", sitCode=" + sitCode + ", natCode=" + natCode + "]";
}

public MemberVO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bookMark == null) ? 0 : bookMark.hashCode());
	result = prime * result + ((conDate == null) ? 0 : conDate.hashCode());
	result = prime * result + memCode;
	result = prime * result + ((memEmail == null) ? 0 : memEmail.hashCode());
	result = prime * result + ((memGender == null) ? 0 : memGender.hashCode());
	result = prime * result + memGrade;
	result = prime * result + ((memId == null) ? 0 : memId.hashCode());
	result = prime * result + ((memIntroduce == null) ? 0 : memIntroduce.hashCode());
	result = prime * result + ((memName == null) ? 0 : memName.hashCode());
	result = prime * result + ((memNickName == null) ? 0 : memNickName.hashCode());
	result = prime * result + ((memPwd == null) ? 0 : memPwd.hashCode());
	result = prime * result + memState;
	result = prime * result + ((natCode == null) ? 0 : natCode.hashCode());
	result = prime * result + ((regDate == null) ? 0 : regDate.hashCode());
	result = prime * result + ((sitCode == null) ? 0 : sitCode.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MemberVO other = (MemberVO) obj;
	if (bookMark == null) {
		if (other.bookMark != null)
			return false;
	} else if (!bookMark.equals(other.bookMark))
		return false;
	if (conDate == null) {
		if (other.conDate != null)
			return false;
	} else if (!conDate.equals(other.conDate))
		return false;
	if (memCode != other.memCode)
		return false;
	if (memEmail == null) {
		if (other.memEmail != null)
			return false;
	} else if (!memEmail.equals(other.memEmail))
		return false;
	if (memGender == null) {
		if (other.memGender != null)
			return false;
	} else if (!memGender.equals(other.memGender))
		return false;
	if (memGrade != other.memGrade)
		return false;
	if (memId == null) {
		if (other.memId != null)
			return false;
	} else if (!memId.equals(other.memId))
		return false;
	if (memIntroduce == null) {
		if (other.memIntroduce != null)
			return false;
	} else if (!memIntroduce.equals(other.memIntroduce))
		return false;
	if (memName == null) {
		if (other.memName != null)
			return false;
	} else if (!memName.equals(other.memName))
		return false;
	if (memNickName == null) {
		if (other.memNickName != null)
			return false;
	} else if (!memNickName.equals(other.memNickName))
		return false;
	if (memPwd == null) {
		if (other.memPwd != null)
			return false;
	} else if (!memPwd.equals(other.memPwd))
		return false;
	if (memState != other.memState)
		return false;
	if (natCode == null) {
		if (other.natCode != null)
			return false;
	} else if (!natCode.equals(other.natCode))
		return false;
	if (regDate == null) {
		if (other.regDate != null)
			return false;
	} else if (!regDate.equals(other.regDate))
		return false;
	if (sitCode == null) {
		if (other.sitCode != null)
			return false;
	} else if (!sitCode.equals(other.sitCode))
		return false;
	return true;
}




	
	
}