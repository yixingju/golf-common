package com.pb.repository;

import com.pb.pojo.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName MemberRepository
 * @Description TODO
 * @Author 侨居
 * @Date 2019/2/21 14:33
 */
@Mapper
public interface MemberRepository {
    /**
     * 获取所有会员
     * @return
     */
    List<Member> findAll();

    /**
     * 根据真实姓名搜索（模糊查询）
     * @param realName
     * @return
     */
    List<Member> findMenberByrealNameLike(@Param("realName") String realName);

    /**
     * 根据id获取会员
     * @param id
     * @return
     */
    Member findMemberById(@Param("id") Long id);


    /**
     * 添加会员
     * @param member
     * @return
     */
//    int insertMember(Member member);

    /**
     * 编辑会员
     * @param member
     * @return
     */
//    int updateMember(Member member);

    /**
     * 删除会员
     * @param id
     * @return
     */
    int deleteMemberById(@Param("id") Long id);

    /**
     * 禁用会员
     * @param id
     * @return
     */
//    int setMemberClose(@Param("id") Long id);

    /**
     * 启动会员
     * @param id
     * @return
     */
//    int setMemberOpen(@Param("id") Long id);

    /**
     * 根据用户名获取用户
     * @param username
     * @return
     */
    Member findMemberByUsername(@Param("username") String username);

    /**
     * 按性别搜索用户（带分页）
     * @param sex
     * @return
     */
    List<Member> findMembersBySex(@Param("sex") String sex);
}
