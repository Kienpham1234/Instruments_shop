/*Done by: Nathan Trowers*/
package net.javaguides.Houseofsound1.servlet;
import net.javaguides.Houseofsound1.beans.Product;
import net.javaguides.Houseofsound1.utils.DBUtils;
import net.javaguides.Houseofsound1.utils.MyUtils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CustomerProductList
 */
@WebServlet(description = "Controller for the customer's viewing, buying, and returning of products.", 
urlPatterns = { "/CustomerProductList" })
public class CustomerProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerProductList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
		Connection connection = MyUtils.getStoredConnection(request);
		
		/*BEGIN**Variable Declaration*/
		String errorString = null;
		List<Product> productList = null;
		/*END**Variable Declaration*/
		
		
		try
		{
			productList = DBUtils.queryProduct(connection);		//Get product info from the databasse.
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			errorString = e.getMessage();
		}
		
		//Cache the variables for use in the '.jsp' file.
		request.setAttribute("errorString", errorString);	
		request.setAttribute("productList", productList);
		
		//Display products to the customers.
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/views/ShoppersProductListView.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
