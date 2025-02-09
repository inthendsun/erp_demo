package com.jsh.erp.service.userBusiness;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.constants.BusinessConstants;
import com.jsh.erp.service.ICommonQuery;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service(value = "userBusiness_component")
@UserBusinessResource
public class UserBusinessComponent implements ICommonQuery {

    @Resource
    private UserBusinessService userBusinessService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return userBusinessService.getUserBusiness(id);
    }

    @Override
    public List<?> select(Map<String, String> map)throws Exception {
        return getUserBusinessList(map);
    }

    private List<?> getUserBusinessList(Map<String, String> map)throws Exception {
        return null;
    }

    @Override
    public Long counts(Map<String, String> map)throws Exception {
        return BusinessConstants.DEFAULT_LIST_NULL_NUMBER;
    }

    @Override
    public int insert(JSONObject obj, HttpServletRequest request) throws Exception {
        return userBusinessService.insertUserBusiness(obj, request);
    }

    @Override
    public int update(JSONObject obj, HttpServletRequest request)throws Exception {
        return userBusinessService.updateUserBusiness(obj, request);
    }

    @Override
    public int delete(Long id, HttpServletRequest request)throws Exception {
        return userBusinessService.deleteUserBusiness(id, request);
    }

    @Override
    public int deleteBatch(String ids, HttpServletRequest request)throws Exception {
        return userBusinessService.batchDeleteUserBusiness(ids, request);
    }

    @Override
    public int checkIsNameExist(Long id, String name)throws Exception {
        return userBusinessService.checkIsNameExist(id, name);
    }

}
