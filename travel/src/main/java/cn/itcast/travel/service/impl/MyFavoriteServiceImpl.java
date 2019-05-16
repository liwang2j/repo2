package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.MyFavoriteDao;
import cn.itcast.travel.dao.impl.MyFavoriteDaoImpl;
import cn.itcast.travel.domain.MyFavoriteRid;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.service.MyFavoriteService;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:MyFavoriteServiceImpl
 * Package:cn.itcast.travel.service.impl
 * Description:
 *
 * @date:2019/5/11 20:32
 * @author:liwang
 */
public class MyFavoriteServiceImpl implements MyFavoriteService {
    MyFavoriteDao myFavoriteDao = new MyFavoriteDaoImpl();
    @Override
    public List<MyFavoriteRid> findRidByUid(int uid) {

        return   myFavoriteDao.findRidByUid( uid);
    }
    @Override
    public List<Route> findRouteByRid( List<MyFavoriteRid> rid){
        if (rid!=null && rid.size()>0){
            List<Route> list = new ArrayList<Route>();
        for (MyFavoriteRid m : rid) {
            int i = m.getRid();
            Route route = myFavoriteDao.findRouteByRid(i);
            list.add(route);
        }
            return  list;
        }
        return  null;
    }
}
