package com.jsh.erp.service.depot;

import com.alibaba.fastjson.JSONObject;
import com.jsh.erp.service.ICommonQuery;
import com.jsh.erp.utils.Constants;
import com.jsh.erp.utils.QueryUtils;
import com.jsh.erp.utils.StringUtil;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

@Service(value = "depot_component")
@DepotResource
public class DepotComponent implements ICommonQuery {

    @Resource
    private DepotService depotService;

    @Override
    public Object selectOne(Long id) throws Exception {
        return depotService.getDepot(id);
    }

    @Override
    public List<?> select(Map<String, String> map)throws Exception {
        return getDepotList(map);
    }

    private List<?> getDepotList(Map<String, String> map)throws Exception {
        String search = map.get(Constants.SEARCH);
        String name = StringUtil.getInfo(search, "name");
        Integer type = StringUtil.parseInteger(StringUtil.getInfo(search, "type"));
        String remark = StringUtil.getInfo(search, "remark");
        String order = QueryUtils.order(map);
        return depotService.select(name, type, remark, QueryUtils.offset(map), QueryUtils.rows(map));
    }

    @Override
    public Long counts(Map<String, String> map)throws Exception {
        String search = map.get(Constants.SEARCH);
        String name = StringUtil.getInfo(search, "name");
        Integer type = StringUtil.parseInteger(StringUtil.getInfo(search, "type"));
        String remark = StringUtil.getInfo(search, "remark");
        return depotService.countDepot(name, type, remark);
    }

    @Override
    public int insert(JSONObject obj, HttpServletRequest request) throws Exception{
        return depotService.insertDepot(obj, request);
    }

    @Override
    public int update(JSONObject obj, HttpServletRequest request)throws Exception {
        return depotService.updateDepot(obj, request);
    }

    @Override
    public int delete(Long id, HttpServletRequest request)throws Exception {
        return depotService.deleteDepot(id, request);
    }

    @Override
    public int deleteBatch(String ids, HttpServletRequest request)throws Exception {
        return depotService.batchDeleteDepot(ids, request);
    }

    @Override
    public int checkIsNameExist(Long id, String name)throws Exception {
        return depotService.checkIsNameExist(id, name);
    }

}
