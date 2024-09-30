/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author kevin
 */
@RestController
@RequestMapping("/api")
public class UsuarioController1 {

    @Override
    public String toString() {
        return "UsuarioController1 []";
    }

    /**
     * @return
     */
    @RequestMapping(value = "/firstrequest", method = RequestMethod.GET)

public ResponseEntity<List<Usuario>> usuarios(){
    List response = new ArrayList<Usuario>();
    Usuario fabricante = new Usuario();

    String connectionUrl = "jdbc:sqlserver://aiwoodworks.database.windows.net:1433;database=aiwoodworks;user=kevin@aiwoodworks;password=$TecS4kev$;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    
    Connection con;
    try {
        con = DriverManager.getConnection(connectionUrl);
        Statement stmt = con.createStatement();
        String SQL = "select * from usuario where tipo_usuario = 'fabricante';";
        ResultSet rs = stmt.executeQuery(SQL);

        while(rs.next()){
            fabricante = new Usuario();
            fabricante.setNombre(rs.getString("nombre"));
            fabricante.setCorreo(rs.getString("correo"));
            fabricante.setTipo(rs.getString("tipo_usuario"));
            response.add(fabricante);
        }

        con.close();

    } catch (SQLException e) {
        // TODO Auto-generated catch block
        fabricante.setNombre(e.toString());
        response.add(fabricante);
        return new ResponseEntity<List<Usuario>>(response, HttpStatus.INTERNAL_SERVER_ERROR); 
    }
    
    



    return new ResponseEntity<List<Usuario>>(response, HttpStatus.OK);    
}
}
