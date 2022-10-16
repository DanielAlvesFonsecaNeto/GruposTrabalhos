/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package io.github.danielalvesfonsecaneto.grupostrabalhos.servelets;

import io.github.danielalvesfonsecaneto.grupostrabalhos.pessoa.PessoaBeanLocal;
import io.github.danielalvesfonsecaneto.grupostrabalhos.util.Util;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Month;
import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;



/**
 *
 * @author Daniel Alves<gatosfofos3 at gmail.com>
 */
@Transactional
@WebServlet(name = "Relatorio", urlPatterns = {"/relatorio"})
public class Relatorio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    Jsonb jsonb = JsonbBuilder.create();
    
    @Inject
    private PessoaBeanLocal pessoaBeanLocal;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("<!DOCTYPE html>");
            sb.append("<html>");
            sb.append("<head>");
            sb.append("<title>Servlet Consultas</title>");            
            sb.append("</head>");
            sb.append("<body>");
            sb.append("<h1>Consultas</h1>");
            
            sb.append("<h2>1.A -  Query: </h2>");
            sb.append("<pre>");
            sb.append(pessoaBeanLocal.pessoaQuerryTodas());
            //out.print(jsonb.toJson(pessoaBeanLocal.pessoaQuerryTodas()));
            sb.append("</pre>");
            
            
            
            
            sb.append("</body>");
            sb.append("</html>");
            out.print(sb.toString());
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
