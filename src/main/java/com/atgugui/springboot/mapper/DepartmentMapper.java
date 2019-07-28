package com.atgugui.springboot.mapper;

import com.atgugui.springboot.bean.Department;
import org.apache.ibatis.annotations.Select;

/**
 * @author jeff
 * @create 2019-07-14
 */
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);
}
