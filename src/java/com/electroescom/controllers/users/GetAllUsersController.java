package com.electroescom.controllers.users;

import com.electroescom.models.dao.UsuarioDAO;
import com.electroescom.models.pojos.modelos.Usuario;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAllUsersController extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                    UsuarioDAO udao=new UsuarioDAO();
        Gson g=new Gson();
        List<Usuario> usuarios=udao.getUsuarios();
        String r=g.toJson(usuarios);
        out.append(r);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                response.setContentType("text/json;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GetAllUsersServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GetAllUsersServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    

}
