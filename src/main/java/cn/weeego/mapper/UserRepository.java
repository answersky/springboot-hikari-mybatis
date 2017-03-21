package cn.weeego.mapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by liuf on 2017/3/21.
 */
@Repository
public class UserRepository {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Map<String, Object>> findAll() {
        return jdbcTemplate.queryForList("select name from user limit 10");
    }

}
