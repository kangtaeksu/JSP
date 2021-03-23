package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalsServlet") 
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CalsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 =0;
		int num2 = 0;
		
		//한글안깨지게 하기 
		request.setCharacterEncoding("utf-8");
		
		String s1 = request.getParameter("num1");
		String s2 = request.getParameter("num2");
		String name = request.getParameter("userName");
		
		if(s1 == null) {
			s1 = "0";
		}
		
		num1 = Integer.parseInt(s1);
		num2 = Integer.parseInt(s2);
		
		// => 이걸통해서 null 일때 에러 해결함
		// 같은원리로 문자열도 데이터 받아다가 활용
		
		Integer.parseInt(request.getParameter("num1")); //문자열로 보이는거 형변환
		Integer.parseInt(request.getParameter("num2")); //이렇게 하면 폼에서 데이터 다받아옴
		
		
		int result = num1+ num2;
		
		//System.out.println(result);=>이런거 왠만해서 하지말고 JSP로 출력 
		//이렇게하는걸 dispatcher 밑에부터 디스패쳐하는 과정
		request.setAttribute("result", result); //result 값 가져오는 역할
		request.setAttribute("userName", name); //키밸류 형식으로 데이터 저장
		
		//디스패쳐 하기  : 자 이제 JSP로 가자
		RequestDispatcher re=
				request.getRequestDispatcher("/basic/result.jsp");
		re.forward(request, response); //이렇게하면 디스패쳐해서 체이지 이동
		
	}

}
