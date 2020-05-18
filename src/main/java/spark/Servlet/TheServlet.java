package spark.Servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import spark.Server;
import spark.IO.sqlRepo;

public class TheServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().println("Hello, Welcome to my Project 1");
        resp.getWriter().println();
        resp.getWriter().println();
        resp.getWriter().println();
        resp.getWriter().println();


        String category = req.getParameter("category");


        
        

        String getStmt = "Select * from Project1Table";

        HashMap<String, String> table = new HashMap<>();
        sqlRepo reader = new sqlRepo();


        if (category == null) {
                // Server.sqlStucture.entrySet().forEach(entry->{
                // try {
                //     resp.getWriter().println("The average " + entry.getKey() + " for the tumors are " + entry.getValue());
                // } catch (IOException e) {
                //     e.printStackTrace();
                // }
                // });

                table =  sqlRepo.readAll(getStmt);
                table.entrySet().forEach(entry->{
                    try {
                       resp.getWriter().println("The " + entry.getKey() + " are " + entry.getValue());
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
                });
            } else {
                resp.getWriter().println("The average " + category + " for the tumors are " + table.get(category));
             }

        
	

        }
 

}
