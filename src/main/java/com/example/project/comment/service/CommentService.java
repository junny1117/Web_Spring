package com.example.project.comment.service;

import com.example.project.comment.vo.CommentVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface CommentService {
    public List commentList(String parentsNO) throws DataAccessException;

    public int addComment(CommentVO commentVO) throws DataAccessException;

    public int removeComment(String commentNO) throws DataAccessException;

    public int modifyComment(CommentVO commentVO) throws DataAccessException;

}
