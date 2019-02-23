package com.pb.repository;

import com.pb.pojo.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @InterfaceName CourseRepository
 * @Description TODO
 * @Author 侨居
 * @Date 2019/2/20 13:53
 */
@Mapper
public interface CourseRepository{

    /**
     * 获取所有球场
     * @return
     */
    List<Course> findAllCourse();

    /**
     * 按球场名字模糊查询
     * @param name
     * @return
     */
    List<Course> findCourseByNameLike(@Param("name") String name);

    /**
     * 根据球场名字查询球场
     * @param name
     * @return
     */
    Course findCouserByName(@Param("name") String name);

    /**
     * 根据球场id获得球场对象
     * @param id
     * @return
     */
    Course findCouserById(@Param("id") Long id);

    /**
     * 根据地区获取球场信息
     * @param address
     * @return
     */
    List<Course> findCouserByAddress(@Param("address") String address);

    /**
     * 设置球场状态为启用
     * @return
     */
    int setCourseOpen(@Param("id") Long id);

    /**
     * 设置球场状态关闭
     * @return
     */
    int setCourseClose(@Param("id") Long id);

    /**
     * 修改球场状态
     * @param course
     * @return
     */
    int updateCourse(Course course);

    /**
     * 根据id 删除球场
     * @param id
     * @return
     */
    int deleteCouserByName(@Param("id") Long id);

    /**
     * 添加球场
     * @param course
     * @return
     */
    int saveCourse(Course course);

}
