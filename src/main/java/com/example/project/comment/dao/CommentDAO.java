package com.example.project.comment.dao;

import com.example.project.comment.vo.CommentVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface CommentDAO {
    public List selectAllComment(String parentsNO) throws DataAccessException;

    public int insertComment(CommentVO commentVO) throws DataAccessException;

    public int deleteComment(String commentNO) throws DataAccessException;

    public int updateComment(CommentVO commentVO) throws DataAccessException;

    public int maxCommentNO() throws DataAccessException;

}
