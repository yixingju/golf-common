package com.pb.service;

import com.github.pagehelper.PageInfo;
import com.pb.pojo.Course;

/**
 * @InterfaceName RpcCourseService
 * @Description TODO
 * @Author 侨居
 * @Date 2019/2/20 14:35
 */
public interface RpcCourseService{

    /**
     * 获取所有球场信息（带分页）
     * @return
     */
    PageInfo<Course> findAllCourse();


    /**
     * 根据球场名字模糊查询（带分页）
     * @param name
     * @return
     */
    PageInfo<Course> findCourseByNameLike(String name);

    /**
     * 根据id 获取球场对象
     * @param id
     * @return
     */
    Course findCourseById(Long id);

    /**
     * 根据地区查询球场
     * @param address
     * @return
     */
    PageInfo<Course> findCourseByAddress(String address);

    /**
     * 开启球场
     * @return
     */
    Boolean setCourseOpen();

    /**
     * 关闭球场
     * @return
     */
    Boolean setCourseClose();

    /**
     * 修改球场信息
     * @param course
     * @return
     */
    Boolean updateCourse(Course course);

    /**
     * 根据id 删除球场
     * @param id
     * @return
     */
    Boolean deleteCourseById(Long id);

}
