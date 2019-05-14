<%@page import="java.sql.*" %>
<%
    String sem=request.getParameter("sem");
    String course_id=request.getParameter("course_id");
    String course_name=request.getParameter("course_name");
    String degree=request.getParameter("degree");
    String providedby=request.getParameter("providedby");
    String des=request.getParameter("des");
    String lec=request.getParameter("lec");
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openelective","root", "");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into course_list(course_id,course_name,degree,sem,providedby,des,lec) values ('" +course_id + "','" + course_name + "','" +degree + "','"+sem+"','"+providedby+"','"+des+"','" + lec + "')");
    out.println("Inserted");
    }catch(Exception e){
        e.printStackTrace();
    }
%>