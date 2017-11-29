/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.Cliente;
import Modelo.Vehiculo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jairo
 */
@WebServlet(name = "ListaDB", urlPatterns = {"/ListaDB"})
public class ListaDB extends HttpServlet {

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
       
            /* TODO output your page here. You may use following sample code. */
            List<Cliente> clientes = getAll();
            List<Vehiculo> vehiculos = getAllVehicle();
            request.setAttribute("clientes", clientes);
            request.setAttribute("vehiculos", vehiculos);
            request.getRequestDispatcher("lista.jsp").forward(request, response);
        }
        
    
    private List<Cliente> getAll()
    {
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("TrafficControl-WebPU");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Cliente> clientes = em.createNamedQuery("Cliente.findAll").getResultList();
        em.getTransaction().commit();
        em.close();
        return clientes;
    
    }
    private List<Vehiculo> getAllVehicle()
    {
        EntityManager em;
        EntityManagerFactory emf;
        emf=Persistence.createEntityManagerFactory("TrafficControl-WebPU");
        em=emf.createEntityManager();
        em.getTransaction().begin();
        List<Vehiculo> vehiculo = em.createNamedQuery("Vehiculo.findAll").getResultList();
        em.getTransaction().commit();
        em.close();
        return vehiculo;
    
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
