package com.friendsystem.DTO;

import java.util.List;

/**
 * 关键字搜索DTO
 * 
 * @author LW
 *
 */
public class KeywordDTO {
	/**
	 * 搜索出的作者
	 * 
	 */
	private List<UserAttentionDTO> listU;
	/**
	 * 搜索出的文章
	 */
	private List<Article_DetailsDTO> listA;

	public List<UserAttentionDTO> getListU() {
		return listU;
	}

	public void setListU(List<UserAttentionDTO> listU) {
		this.listU = listU;
	}

	public List<Article_DetailsDTO> getListA() {
		return listA;
	}

	public void setListA(List<Article_DetailsDTO> listA) {
		this.listA = listA;
	}

	@Override
	public String toString() {
		return "KeywordDTO [listU=" + listU + ", listA=" + listA + "]";
	}

}
