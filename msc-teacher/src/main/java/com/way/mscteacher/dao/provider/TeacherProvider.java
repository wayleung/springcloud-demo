package com.way.mscteacher.dao.provider;

import com.way.mscteacher.dao.entity.Teacher;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class TeacherProvider {
    public final static String TABLE_NAME="teacher";

    public String insertSelective(final Teacher teacher){
        return new SQL(){{
            INSERT_INTO(TABLE_NAME);
            VALUES("tid",teacher.getTid());
            if (StringUtils.isNotBlank(teacher.getTname())) {
                VALUES("tname", teacher.getTname());
            }
        }

        }.toString();
    }

    public String updateSelectiveByTid(final Teacher teacher){
        return new SQL(){{
            UPDATE(TABLE_NAME);
            if (StringUtils.isNotBlank(teacher.getTname())) {
                SET("tname=#{tname}");
            }
            WHERE("tid=#{tid}");

        }}.toString();
    }

}
