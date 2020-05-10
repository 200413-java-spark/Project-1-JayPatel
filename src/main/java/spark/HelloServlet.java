package spark;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{


	List<String> names;

	@Override
	public void init() throws ServletException {
		names = new ArrayList<>();
		names.add("Mehrab");
		names.add("Sutter");
		names.add("Jermey");
		names.add("Daniel");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String name = req.getParameter("name");
		
		if(name != null) {
			names.add(name);
			names.set(0, name);
			resp.getWriter().println("Hello " + name);

		} 

		// for (String n : names) {
		// 	resp.getWriter().println(n);
		// }

		names.forEach((n) -> {
			try {
				resp.getWriter().println(n);
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	
	}









}
