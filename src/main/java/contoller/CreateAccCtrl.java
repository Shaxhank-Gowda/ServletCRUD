package contoller;

import java.io.IOException;

import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/donut")
public class CreateAccCtrl extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	int id=Integer.parseInt(req.getParameter("user-id"));
	String name=req.getParameter("name");
	String email =req.getParameter("email");
	String pwd=req.getParameter("password");
	String dob=req.getParameter("date-of-birth");
	String nat=req.getParameter("nationality");
	String gen=req.getParameter("gender");
	String terms=req.getParameter("terms-and-conditions");
		
	Dto d=new Dto();
	d.setId(id);
	d.setName(name);
	d.setMail(email);
	d.setPwd(pwd);
	
	d.setDob(dob);
	d.setCountry(nat);
	d.setGender(gen); 
	d.setTerms(terms);
		
		Dao di=new Dao();
		resp.getWriter().print(di.add(d));
		
	}
	
	

}
