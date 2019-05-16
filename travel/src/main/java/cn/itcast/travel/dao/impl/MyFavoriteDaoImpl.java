package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.MyFavoriteDao;
import cn.itcast.travel.domain.MyFavoriteRid;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * ClassName:MyFavoriteDaoImpl
 * Package:cn.itcast.travel.dao.impl
 * Description:
 *
 * @date:2019/5/11 20:35
 * @author:liwang
 */
public class MyFavoriteDaoImpl implements MyFavoriteDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<MyFavoriteRid> findRidByUid(int uid) {
        String sql = "select * from tab_favorite where uid=?";
        try {
            return   template.query(sql,new BeanPropertyRowMapper<MyFavoriteRid>(MyFavoriteRid.class),uid);
        } catch (DataAccessException e) {
            return null;
        }
    }

    @Override
    public Route findRouteByRid(Integer rid) {
        String sql = "select * from tab_route where rid in (?) ";
        try {
            return template.queryForObject(sql, new BeanPropertyRowMapper<Route>(Route.class), rid);
        } catch (DataAccessException e) {
            return null;
        }
    }


}
