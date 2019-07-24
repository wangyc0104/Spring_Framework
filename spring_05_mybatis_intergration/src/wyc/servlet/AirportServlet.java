package wyc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import wyc.service.AirportService;
import wyc.service.impl.AirportServiceImpl;

/**
 * 机场信息处理Servlet
 * @author Yicheng Wang
 */
@SuppressWarnings("serial")
@WebServlet("/airport")
public class AirportServlet extends HttpServlet {
	
	private AirportService airportService;

	/**
	 * Servlet初始化
	 */
	@Override
	public void init() throws ServletException {
		// spring和web整合后所有信息都存放在webApplicationContext
		ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		airportService = ac.getBean("airportService", AirportServiceImpl.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("list", airportService.show());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
