<%-- 
    Document   : index
    Created on : 14.okt.2016, 12:28:09
    Author     : Henrik
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@ page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TrollTours homepage</title>
    </head>
    <body>
        <h1>Welcome to TrollTours homepage blabla</h1>
        <%ResultSet resultset = null;%>
        <%
            try {
    //Class.forName("com.mysql.jdbc.Driver").newInstance();
               //Connection c = DriverManager.getConnection("jdbc:sqlserver://158.38.101.112:1433;databaseName=Hobbyhuset","Henke","troll123");
                Connection c = DriverManager.getConnection("jdbc:sqlserver://158.38.101.112:1433;databaseName=Hobbyhuset","Henke   ","troll123");
               
                Statement st = c.createStatement();
                Statement st2 = c.createStatement();
                ResultSet rs = st.executeQuery(
                        "select AnsNr from Ansatt");
               ResultSet rs2 = st2.executeQuery("select Fornavn from Ansatt");
                
        %>

    <center>
        <h1> Drop down box or select element</h1>
        <select>
            <%  while (rs.next()) {%>
            <option><%= rs.getString(1)%></option>
            <% } %>
        </select>
    </center>
           
    <left>
        <h1> Drop down box or select element</h1>
        <select>
            <%  while (rs2.next()) {%>
            <option><%= rs2.getString(1)%></option>
            <% } %>
        </select>
    </left>
            
    <%
    //**Should I input the codes here?**
        } catch (Exception e) {
            out.println("wrong entry: " + e);
        }
    %>
    
    
    
    
</body>
</html>

