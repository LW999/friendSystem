package com.friendsystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.friendsystem.pojo.User;
import com.friendsystem.pojo.UserExample;

public interface UserMapper {
	int countByExample(UserExample example);

	int deleteByExample(UserExample example);

	int deleteByPrimaryKey(String userId);

	int insert(User record);

	int insertSelective(User record);

	List<User> selectByExample(UserExample example);

	User selectByPrimaryKey(String userId);

	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	/**
	 * 
	 * @param id
	 * @return User 根据账号查询User对象
	 */
	User selectUserByAccount(String account);

	/**
	 * 
	 * @param code
	 *            根据code查询User对象
	 * @return
	 */
	User selectUserByCode(String code);

	/**
	 * 根据Mail查询User对象
	 */
	User selectUserByMail(String mail);

	/**
	 * 随机查询5个推荐用户
	 * 
	 * @return listUser
	 */
	List<User> getRandomUsers();

	/**
	 * 随机查询12个推荐用户
	 * 
	 * @returnList<User>
	 */
	List<User> getMoreRandomUsers();

	/**
	 * 随机查询5个作者，没有自己
	 * 
	 * @param userId
	 * @return
	 */
	List<User> getRandomUsersNoOneSelft(List<String> list);

}