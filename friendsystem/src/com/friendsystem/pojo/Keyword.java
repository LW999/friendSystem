package com.friendsystem.pojo;

/**
 * �ؼ�������
 * 
 * @author LW
 *
 */
public class Keyword {
	/**
	 * �ؼ���ID
	 */
	private String keywordId;
	/**
	 * �ؼ�������
	 */
	private String keywordContent;
	/**
	 * �ؼ���ʹ�ô���
	 */
	private Integer keywordNumber;
	/**
	 * �ؼ��ִ���ʱ��
	 */
	private String keywordCreatetime;
	/**
	 * �ؼ����޸�ʱ��
	 */
	private String keywordModifytime;

	public String getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(String keywordId) {
		this.keywordId = keywordId == null ? null : keywordId.trim();
	}

	public String getKeywordContent() {
		return keywordContent;
	}

	public void setKeywordContent(String keywordContent) {
		this.keywordContent = keywordContent == null ? null : keywordContent.trim();
	}

	public Integer getKeywordNumber() {
		return keywordNumber;
	}

	public void setKeywordNumber(Integer keywordNumber) {
		this.keywordNumber = keywordNumber;
	}

	public String getKeywordCreatetime() {
		return keywordCreatetime;
	}

	public void setKeywordCreatetime(String keywordCreatetime) {
		this.keywordCreatetime = keywordCreatetime == null ? null : keywordCreatetime.trim();
	}

	public String getKeywordModifytime() {
		return keywordModifytime;
	}

	public void setKeywordModifytime(String keywordModifytime) {
		this.keywordModifytime = keywordModifytime == null ? null : keywordModifytime.trim();
	}

	@Override
	public String toString() {
		return "Keyword [keywordId=" + keywordId + ", keywordContent=" + keywordContent + ", keywordNumber="
				+ keywordNumber + ", keywordCreatetime=" + keywordCreatetime + ", keywordModifytime="
				+ keywordModifytime + "]";
	}
	
}