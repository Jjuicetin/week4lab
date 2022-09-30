
package servlets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import models.Note;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//JUICED

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { //clicking links etc
        
       String query = request.getQueryString();
        if (query != null && query.contains("edit")) {
            //directs to editnote.jsp when u click the link
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

        } else {
            String path = getServletContext().getRealPath("/WEB-INF/KeeperofNotes.txt");
            String title;
            String contents;
            
            // read the file
            BufferedReader reader = new BufferedReader(new FileReader(new File(path)));

            title = reader.readLine();
            contents = reader.readLine();

            Note note = new Note(title, contents);

            request.setAttribute("note", note);

            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");

        String path = getServletContext().getRealPath("/WEB-INF/KeeperofNotes.txt");

        PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));

        write.println(title);
        write.println(contents);
        write.close();

        response.sendRedirect("note");
}
}
