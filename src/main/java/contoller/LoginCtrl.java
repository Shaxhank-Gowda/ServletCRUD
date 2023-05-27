package contoller;

import java.io.IOException;

import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCtrl extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);

	String email =req.getParameter("email");
	String pwd=req.getParameter("password");
	
		
	Dto d=new Dto();

	d.setMail(email);
	d.setPwd(pwd);
	
	
		
		Dao di=new Dao();
		Dto db=di.find(email);
		
		if(db!=null)
		{
			if(db.getPwd().equals(pwd)) {
				
				
			}
			else {
				
			}
			
		}
		else {
			

			resp.getWriter().print("<h2>New User? <a href=\"http://localhost:8080/project_donut/\"></a></h2>");
		}
		
	}
	}
