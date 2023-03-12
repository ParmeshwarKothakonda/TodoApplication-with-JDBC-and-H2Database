
package com.example.todo.model;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;


public class TodoRowMapper implements RowMapper<Todo>{
    public Todo mapRow(ResultSet rs, int rowNum) throws SQLException{
        return new Todo(
            rs.getInt("id"),
            rs.getString("todo"),
            rs.getString("priority"),
            rs.getString("status")
        );

    }
}
