package cn.travel.dao;

import java.util.List;

import cn.travel.domain.Route;

public interface RouteDao {

    /**
     * 根据cid查询总记录数
     */
    public int findTotalCount(int cid);

    /**
     * 根据cid，start,pageSize查询当前页的数据集合
     */
    public List<Route> findByPage(int cid , int start , int pageSize);
    
    //搜索旅游路线名称
    public int findTotalCount(int cid,String rname);
    
    public List<Route> findByPage(int cid, int start, int pageSize,String rname);
    
    /**
     * 根据id查询
     * @param rid
     * @return
     */
    public Route findOne(int rid);
    
}
