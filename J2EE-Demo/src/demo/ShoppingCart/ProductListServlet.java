package demo.ShoppingCart;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		List<Product> products = new ProductDAO().getProductList();
    		req.setAttribute("products", products);
    		req.getRequestDispatcher("shoppingCartDemo/listProduct.jsp").forward(req, resp);
    }
}
