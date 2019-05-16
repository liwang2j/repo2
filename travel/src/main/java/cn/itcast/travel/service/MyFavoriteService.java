package cn.itcast.travel.service;

import cn.itcast.travel.domain.MyFavoriteRid;
import cn.itcast.travel.domain.Route;

import java.util.List;

/**
 * ClassName:MyFavoriteService
 * Package:cn.itcast.travel.service
 * Description:
 *
 * @date:2019/5/11 20:31
 * @author:liwang
 */
public interface MyFavoriteService {
    public  List<MyFavoriteRid> findRidByUid(int uid);
    public List<Route> findRouteByRid( List<MyFavoriteRid> rid);
}
