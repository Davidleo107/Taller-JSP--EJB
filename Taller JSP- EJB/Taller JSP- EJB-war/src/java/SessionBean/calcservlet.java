    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author David Reinoso
 */

@WebServlet(name = "calcservlet", urlPatterns = {"/calcservlet"})    
public class calcservlet extends HttpServlet {

    @EJB
    private calcbeanLocal calcbean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calcservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            int num1 = Integer.parseInt(request.getParameter("t1"));
            int num2 = Integer.parseInt(request.getParameter("t2"));
            String operacion = request.getParameter("action");
            
            if(operacion.equals("suma")){
            out.println("<h1>La suma de " + num1 + " + " + num2 + " = " +(num1+num2)+ "</h1>");
            out.print("<h1> "+ calcbean.suma(num1, num2) + "</h1>");
            }else if(operacion.equals("resta")){
            out.println("<h1>La resta de " + num1 + " - " + num2 + " = " +(num1-num2)+"</h1>");
            out.print("<h1> "+ calcbean.resta(num1, num2) + "</h1>");
            }else if(operacion.equals("multiplicacion")){
            out.println("<h1>La multiplicación de " + num1 + " * " + num2 + " = "+ +(num1*num2)+"</h1>");
            out.print("<h1> "+ calcbean.multiplicacion(num1, num2) + "</h1>");
            }else if(operacion.equals("division")){
            out.println("<h1>La división de " + num1 + " / " + num2 + " = " +(num1/num2)+"</h1>");    
            out.print("<h1> "+ calcbean.division(num1, num2) + "</h1>");
            }else if(operacion.equals("modulo")){
            out.println("<h1>El módulo de " + num1 + " % " + num2 + " = " +(num1%num2)+ "</h1>"); 
            out.print("<h1> "+ calcbean.modulo(num1, num2) + "</h1>");
            }else if(operacion.equals("potencia")){
            out.println("<h1>La potencia de " + num1 + " a la 2 = " +(num1*num1)+ "</h1>");
            out.print("<h1> "+ calcbean.potencia(num1) + "</h1>");
            }
            out.println("</body>");
            out.println("</html>");
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
