package amm.progetto.Servlet;
import amm.progetto.Classi.*;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Bacheca extends HttpServlet 
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);
        
        //se la sessione esiste ed esiste anche l'attributo loggedIn impostato a true
        if(session!=null && 
           session.getAttribute("loggedIn")!=null &&
           session.getAttribute("loggedIn").equals(true))
        {
            
            
            String user = request.getParameter("user");
            int userID;
            
            if(user != null)
                userID = Integer.parseInt(user);
            else
            {
                Integer loggedUserID = (Integer)session.getAttribute("loggedUserID");
                userID = loggedUserID;
            }

            User utente = UserFactory.getInstance().getUserId(userID);
            if(utente != null)
            {
                request.setAttribute("user", utente);
                List <String> nPersone=UserFactory.getInstance().getUsersName();
                request.setAttribute("amici", nPersone);
                List <String> nGruppi=GruppiFactory.getInstance().getGruppiName();
                request.setAttribute("gruppi", nGruppi);
                List <Post> posts;
                int idbacheca = Integer.parseInt(request.getParameter("idBacheca"));
                if(idbacheca!=(int)session.getAttribute("loggedUserID"))
                {
                    User u = UserFactory.getInstance().getUserId(idbacheca);
                    posts = PostFactory.getInstance().getPostList(u);
                }
                else
                    posts = PostFactory.getInstance().getPostList(utente);
                request.setAttribute("post", posts);
                
                
                if(request.getAttribute("newPost").equals("true"))
                {
                    String msg;
                    msg=("Hai scritto un post di tipo "+ request.getAttribute("postType"));
                    msg=msg+("sulla bacheca di "+ request.getAttribute("destinatario"));
                    request.setAttribute("rsp", msg);
                }
                else
                    request.setAttribute("rsp", null);
                request.getRequestDispatcher("bacheca.jsp?id="+(Integer)session.getAttribute("idBacheca")).forward(request, response);
            } 
            else 
            {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
        }
        else{
            request.getRequestDispatcher("Login").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
