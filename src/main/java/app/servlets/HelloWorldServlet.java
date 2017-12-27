package app.servlets;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.OutputStream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class HelloWorldServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    private ServletConfig config;
    @Override
    public void init (ServletConfig config) throws ServletException
    {
        this.config = config;
    }
    @Override
    public void destroy() {}
    @Override
    public ServletConfig getServletConfig()
    {
        return config;
    }
    @Override
    public String getServletInfo()
    {
        return "A Simple Servlet";
    }
    public void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType( "text/html" );
        String text = "<!DOCTYPE html PUBLIC " +
                "\"-//W3C//DTD HTML 4.01 Transitional//EN\" " +
                "\"http://www.w3.org/TR/html4/loose.dtd\"> " +
                "<html><head>" +
                "<meta http-equiv=\"Content-Type\" " +
                "content=\"text/html; charset=UTF-8\"> " +
                "<title>Пример сервлета!</title>" +
                "</head>" +
                "<body>" +
                "<h1>Здравствуй, %s %s!</h1>" +
                "</body></html>";
        text = String.format(text, config.getInitParameter("name"),
                config.getInitParameter("mname"));
        OutputStream outStream = response.getOutputStream();
        outStream.write(text.getBytes("UTF-8"));
        outStream.flush();
        outStream.close();
    }
}
