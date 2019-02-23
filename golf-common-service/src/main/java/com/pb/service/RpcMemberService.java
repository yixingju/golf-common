package com.pb.service;

import com.github.pagehelper.PageInfo;
import com.pb.pojo.Member;

/**
 * @InterfaceName RpcMemberService
 * @Description TODO
 * @Author 侨居
 * @Date 2019/2/21 15:15
 */
public interface RpcMemberService{

    /**
     *
     * @param username
     * @param password
     * @return
     */
    Member login(String username,String password);

    /**
     * 获取全部会员（含分页）
     * @param pageSize
     * @param pageNum
     * @return
     */
    PageInfo<Member> findAllMembers(int pageSize,int pageNum);


    /**
     * TODO 1，获取所有会员（分页）
     2，根据真实姓名搜索（模糊查询）
     3，根据id获取会员
     4，添加会员
     5，编辑会员
     6，删除会员
     7，禁用会员
     8，启动会员
     9，生成会员卡号--->util
     10，会员注册
     11，会员登陆
     */
}
