package com.way.mscstudent.dao.provider;

import com.way.mscstudent.dao.entity.Student;
import com.way.mscstudent.dao.entity.Student;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.stereotype.Component;

@Component
public class StudentProvider {
    public final static String TABLE_NAME="student";

    public String insertSelective(final Student student){
        return new SQL(){{
            INSERT_INTO(TABLE_NAME);
            VALUES("sit",student.getSid());
            if (StringUtils.isNotBlank(student.getSname())) {
                VALUES("sname", student.getSname());
            }
            if (StringUtils.isNotBlank(student.getSage())) {
                VALUES("sage", student.getSage());
            }
            if (StringUtils.isNotBlank(student.getSsex())) {
                VALUES("ssex", student.getSsex());
            }

        }

        }.toString();
    }

    public String updateSelectiveBySid(final Student student){
        return new SQL(){{
            UPDATE(TABLE_NAME);
            if (StringUtils.isNotBlank(student.getSname())) {
                VALUES("sname", student.getSname());
            }
            if (StringUtils.isNotBlank(student.getSage())) {
                VALUES("sage", student.getSage());
            }
            if (StringUtils.isNotBlank(student.getSsex())) {
                VALUES("ssex", student.getSsex());
            }
            WHERE("sid=#{sid}");

        }}.toString();
    }

}
