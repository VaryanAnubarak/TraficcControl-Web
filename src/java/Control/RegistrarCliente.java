/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jairo
 */
public class RegistrarCliente extends HttpServlet {

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
            String nombre = request.getParameter("nombre");
            String identificacion = request.getParameter("identificacion");
            String fechaEntradaPeaje = request.getParameter("fechaEntradaPeaje");
            String horaEntradaPeaje = request.getParameter("horaEntradaPeaje");
            String tipoPagoStr = request.getParameter("tipoPago");
            int tipoPago = 0;
            if(tipoPagoStr != "" && !tipoPagoStr.equalsIgnoreCase(null)){
                tipoPago = Integer.parseInt(tipoPagoStr);
            }
            String pagoPeaje = request.getParameter("pagoPeaje");
            String matricula = request.getParameter("matricula");
            String tipoVehiculo = request.getParameter("tipoVehiculo");
            Cliente cliente = new Cliente(hashCode() ,nombre, identificacion, fechaEntradaPeaje, horaEntradaPeaje, tipoPago, pagoPeaje, matricula, tipoVehiculo);
            EntityManagerFactory emf=Persistence.createEntityManagerFactory("TrafficControl-WebPU");
        EntityManager em=emf.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(cliente);
        em.flush();
        em.getTransaction().commit();
        
        response.sendRedirect("index.jsp");
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
