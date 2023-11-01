import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "/form")
public class controller extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServletException {
        String action = request.getParameter("action");
        if(action == null) {
            doGet_Index(request,response);
        }
    }

    public void doGet_Index(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ServletException {
       request.getRequestDispatcher("/views/index.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        if(action.equals("login")) {
            doPost_Login(request,response);
        }
    }

    public void doPost_Login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String email = request.getParameter("email").trim();
        String pass = request.getParameter("password").trim();
        if(email.equals("test@gmail.com") && pass.equals("123")) {
            request.setAttribute("success","Đăng nhập thành công");
            request.getRequestDispatcher("/views/index.jsp").forward(request,response);
        } else {
            request.setAttribute("error","Email hoặc password không hợp lệ");
            request.setAttribute("email",email);
            request.getRequestDispatcher("/views/index.jsp").forward(request,response);
        }

    }

}
