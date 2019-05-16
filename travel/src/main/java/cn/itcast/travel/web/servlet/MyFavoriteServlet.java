package cn.itcast.travel.web.servlet;

import cn.itcast.travel.domain.MyFavoriteRid;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.User;
import cn.itcast.travel.service.MyFavoriteService;
import cn.itcast.travel.service.impl.MyFavoriteServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * ClassName:${NAME}
 * Package:${PACKAGE_NAME}
 * Description:
 *
 * @date:2019/5/11 20:17
 * @author:liwang
 */
@WebServlet("/myFavoriteServlet")
public class MyFavoriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("myFavoriteServlet");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        int uid = user.getUid();
        MyFavoriteService myFavoriteService =new MyFavoriteServiceImpl();

        List<MyFavoriteRid>list = myFavoriteService.findRidByUid(uid);


        List<Route> route = myFavoriteService.findRouteByRid(list);




        ObjectMapper mapper =new ObjectMapper();
        String s = mapper.writeValueAsString(route);
        System.out.println(s);
        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),route);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
