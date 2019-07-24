package wyc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import wyc.pojo.Users;
import wyc.service.UsersService;
import wyc.service.impl.UsersServiceImpl;

/**
 * 用户登录Servlet
 * @author Yicheng Wang
 */
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	/**
	 * Spring容器管理的userService，在此使用显示代码初始化
	 * 也可以用注解来初始化，直接在声明代码前 @Resource 即可
	 */
	private UsersService usersService;

	/**
	 * 初始化bean
	 */
	@Override
	public void init() throws ServletException {
		ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		usersService = ac.getBean("usersService", UsersServiceImpl.class);
	}

	/**
	 * 业务
	 */
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String code = req.getParameter("code");
		String codeSession = req.getSession().getAttribute("code").toString();
		if (codeSession.equals(code)) {
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			Users users = new Users();
			users.setPassword(password);
			users.setUsername(username);
			Users user = usersService.login(users);
			if (user != null) {
				resp.sendRedirect("main.jsp");
			} else {
				req.setAttribute("error", "用户名密码不正确");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		} else {
			req.setAttribute("error", "验证码不正确");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
	
}
