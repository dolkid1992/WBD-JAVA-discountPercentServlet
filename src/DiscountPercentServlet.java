import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountPercentServlet",urlPatterns = "/discount")
public class DiscountPercentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("ProductDescription");
        int price = Integer.parseInt(request.getParameter("ListPrice"));
        int discount = Integer.parseInt(request.getParameter("DiscountPercent"));
        int discountAmount = price*discount/100;
        int discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("<h1>Discount Description: "+ description+"</h1>");
        writer.println("<h1>Price: "+ price+"</h1>");
        writer.println("<h1>Discount Percent:"+ discount+"</h1>");
        writer.println("<h1>Discount Amount:"+discountAmount+"</h1>");
        writer.println("<h1>Discount Price:"+discountPrice+"</h1>");
        }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
