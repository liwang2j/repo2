package cn.itcast.travel.domain;

import java.util.Date;

/**
 * ClassName:MyFavoriteRid
 * Package:cn.itcast.travel.domain
 * Description:
 *
 * @date:2019/5/11 21:12
 * @author:liwang
 */
public class MyFavoriteRid {
    private int rid;
    private Date date;
    private int uid;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public MyFavoriteRid() {
    }

    public MyFavoriteRid(int rid) {
        this.rid = rid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "MyFavoriteRid{" +
                "rid=" + rid +
                '}';
    }
}
