package cn.weeego.mapper;

import java.util.List;

public interface StudentMapper {

    String findUsername(int id);

    List<String> findUsernames();
}
