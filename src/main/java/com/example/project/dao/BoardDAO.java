package com.example.project.dao;

import com.example.project.vo.BoardVO;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface BoardDAO {
    public List selectAllArticlesList() throws DataAccessException;

    public int insertArticle(BoardVO boardVO) throws DataAccessException;

    public int deleteArticle(String articleNO) throws DataAccessException;

    // 수정
    public int maxArticleNum() throws DataAccessException;

    public BoardVO selectArticle(String articleNO) throws DataAccessException;

    public int updateArticle(BoardVO boardVO) throws DataAccessException;
}
