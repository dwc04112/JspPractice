package kr.ac.daegu.jsppractice;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//HttpServlet : 웹어플리케이션(역할)을 만들수 있게 해준다
@WebServlet(name = "helloServlet", value = "/hello-servlet")
//annotation (Controller)
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        
        // Hello
        PrintWriter out = response.getWriter();
        out.    println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}