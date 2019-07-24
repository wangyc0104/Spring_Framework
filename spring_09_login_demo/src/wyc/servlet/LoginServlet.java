package wyc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import wyc.pojo.Users;
import wyc.service.UsersService;
import wyc.service.impl.UsersServiceImpl;

/**
 * 用户登录验证Servlet
 * @author Yicheng Wang
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private UsersService usersService;

	/**
	 * 初始化bean
	 */
	@Override
	public void init() throws ServletException {
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		usersService = wac.getBean("usersService", UsersServiceImpl.class);
	}

	/**
	 * 登录业务
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		Users users = new Users();
		users.setUsername(req.getParameter("username"));
		users.setPassword(req.getParameter("password"));
		Users user = usersService.login(users);
		if (user != null) {
			resp.sendRedirect("main.jsp");
		} else {
			resp.sendRedirect("login.jsp");
		}
	}
	
}
