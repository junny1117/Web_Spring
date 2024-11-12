package com.example.project.common.service;

import com.example.project.common.dao.CommonDAO;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Resource(name = "commonDAO")
    private CommonDAO commonDAO;

    @Override
    public Map<String,Object> selectFileInfo(Map<String,Object> map) throws Exception {
        return commonDAO.selectFileInfo(map);
    }

    @Override
    public void deleteFile(Map<String, Object> map) throws DataAccessException {
        commonDAO.deleteFile(map);
    }
}
