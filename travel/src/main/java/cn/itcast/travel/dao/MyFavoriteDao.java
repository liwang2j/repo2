package cn.itcast.travel.dao;

import cn.itcast.travel.domain.MyFavoriteRid;
import cn.itcast.travel.domain.Route;

import java.util.List;

/**
 * ClassName:MyFavoriteDao
 * Package:cn.itcast.travel.dao
 * Description:
 *
 * @date:2019/5/11 20:35
 * @author:liwang
 */
public interface MyFavoriteDao {
    public List<MyFavoriteRid> findRidByUid(int uid);

    public Route findRouteByRid(Integer rid);
}
