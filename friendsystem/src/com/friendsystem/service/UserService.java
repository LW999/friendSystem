package com.friendsystem.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.friendsystem.mapper.AttentionPeopleMapper;
import com.friendsystem.pojo.AttentionPeople;
import com.friendsystem.pojo.AttentionPeopleExample;
import com.friendsystem.pojo.AttentionPeopleExample.Criteria;
import com.friendsystem.util.BuildUuid;
import com.friendsystem.util.TimeUtil;
import com.friendsystem.pojo.User;

/**
 * 用户的一些操作
 * 
 * @author LW
 *
 */
@Controller
@Service("userService")
public class UserService {
	@Resource
	private AttentionPeopleMapper aPeopleMapper;// 关注的人DAO

	/**
	 * 根据用户传回来的ID查询是否需要关注其他用户
	 * 
	 * @param userId
	 * @param userSession
	 * @return
	 */
	public String getMessage(String userId, User userSession) {
		if (userId != null && userId.trim().length() > 0) {
			// 根据传回来的用户ID和 自身ID查询是否关注了此人
			AttentionPeopleExample attentionPeopleExample = new AttentionPeopleExample();
			Criteria criteria = attentionPeopleExample.createCriteria();
			criteria.andAttentionPeopleUserOneEqualTo(userSession.getUserId());
			criteria.andAttentionPeopleUserTwoEqualTo(userId);
			List<AttentionPeople> listAP = aPeopleMapper.selectByExample(attentionPeopleExample);
			if (listAP.size() > 0) {
				// 已经关注，现在取消关注
				aPeopleMapper.deleteByPrimaryKey(listAP.get(0).getAttentionPeopleId());
				return "cancelAttention";
			} else {
				AttentionPeople attentionPeople = new AttentionPeople();
				attentionPeople.setAttentionPeopleId(BuildUuid.getUuid());
				attentionPeople.setAttentionPeopleUserOne(userSession.getUserId());
				attentionPeople.setAttentionPeopleUserTwo(userId);
				attentionPeople.setAttentionPeopleCreatetime(TimeUtil.getStringSecond());
				attentionPeople.setAttentionPeopleModifytime(TimeUtil.getStringSecond());
				aPeopleMapper.insert(attentionPeople);
				return "success";
			}
		}

		return "error";
	}

}
