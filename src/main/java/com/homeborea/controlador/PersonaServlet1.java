/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homeborea.controlador;

import com.hombeborea.modelo.HomePersonas;
import com.homeborea.dao1.PersonasDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author javam2019
 */
public class PersonaServlet1 extends HttpServlet {
    
    HomePersonas homePersonas = new HomePersonas();
    PersonasDao dao = new PersonasDao();
    private String mensaje = null;
    HomePersonas personaNueva = new HomePersonas();
    private int codigo;
    private String nombre;
    private String apellido;
    private int dpi;
    

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
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
            out.println("<h1>Example heading <span class=\"badge badge-secondary\">Gracias por Registrarte en Home </span></h1> ");
            String boton = request.getParameter("btnAccion");
            out.println("<br><h1> Gracias por registrarte en Home </h1>" + boton + "<br>");
            if (boton.equals("Enviar")) {
                guardarPersona(request);  
                out.println(mensaje);
            }
        }
       
    }
    
    public void guardarPersona (HttpServletRequest request) {
        homePersonas.setNombrePersona(request.getParameter("txtNombre"));
        homePersonas.setApellidoPersona(request.getParameter("txtApellido"));
        homePersonas.setDpiPersona(Integer.parseInt(request.getParameter("txtDpi")));
        homePersonas.setCorreoPersona(request.getParameter("txtCorreo"));
        
        System.out.println("CONTROLADOR Persona: " + homePersonas);
        mensaje = dao.agregarPersona(homePersonas);
        
        
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
