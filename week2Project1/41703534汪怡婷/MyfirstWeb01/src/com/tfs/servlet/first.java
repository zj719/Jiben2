package com.tfs.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class first
 */
@WebServlet("/first")
public class first extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<Integer, String> cityMap=new HashMap();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public first() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("<h1>Hello"+cityMap.get(001)+"的同学</h1>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
		System.out.println("service.....");
	}
	
	@Override
	public void destroy(){
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("destory...");
	}
	
	@Override
	public void init() throws ServletException{
		super.init();
		System.out.println("init.....");
		long start=System.currentTimeMillis();
		System.out.println("dsjfsjfdsf");
		try {
			Thread.sleep(20000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		};
		cityMap.put(001,"北京");
		cityMap.put(002,"上海");
		System.out.println(System.currentTimeMillis()-start);
	}
	                         
}
