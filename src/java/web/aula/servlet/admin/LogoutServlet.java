package web.aula.servlet.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getSession().invalidate();
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Logout";
    }

}
