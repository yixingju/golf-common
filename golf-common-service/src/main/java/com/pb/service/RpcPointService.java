package com.pb.service;

import com.github.pagehelper.PageInfo;
import com.pb.pojo.Point;
import org.apache.ibatis.annotations.Param;

public interface RpcPointService {
    /*
     * @Author: sunmingjun
     * @Description:查询所有积分
     * @param :
     * @Date: 15:05 2019/2/23
     */
    PageInfo<Point> findAll();

    /*
     * @Author: sunmingjun
     * @Description:按id查询积分
     * @param :mr_id
     * @Date: 15:06 2019/2/23
     */
    Point findById(@Param("m_id") Integer m_id);

    /*
     * @Author: sunmingjun
     * @Description:修改积分
     * @param :mr_id
     * @Date: 15:09 2019/2/23
     */
    boolean updatePoint(@Param("m_id") Integer m_id);

    /*
     * @Author: sunmingjun
     * @Description:个人积分清0
     * @param :mr_id
     * @Date: 15:12 2019/2/23
     */
    boolean zeroPoint(@Param("m_id") Integer m_id);

    /*
     * @Author: sunmingjun
     * @Description:所有人积分清0
     * @param :
     * @Date: 16:02 2019/2/23
     */
    boolean zeroAll();
}
