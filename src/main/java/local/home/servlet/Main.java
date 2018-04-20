package local.home.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 1. Создать jsp-страницы для отдельного товара, корзины, оформления заказа, страницы о компании.
 * 2. В созданных в предыдущем ДЗ сервлетах использовать объект RequestDispatcher для перехода на созданные JSP-страницы.
 * 3. Добавить html-верстку на JSP-страницы
 * 4. На страницу с каталогом добавить 9 статических товаров.
 */

@WebServlet(urlPatterns = "/main")
public class Main extends HttpServlet {
    final static String namePage = "Main page";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do GET");
        response.setContentType("text/html");
        request.setAttribute("namePage", namePage);
        request.getRequestDispatcher("main.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doPost(req, resp);
        // Set response content type
        System.out.println("do POST");


    }

}