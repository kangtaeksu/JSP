package kosta.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sumSurvlet")
public class sumSurvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public sumSurvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1")); //문자열로 보이는거 형변환
		 //이렇게 하면 폼에서 데이터 다받아옴
		int result2 =0;
		for (int i=0; i<=num1;i++) {
			result2 += i;
		}
		
		//System.out.println(result);=>이런거 왠만해서 하지말고 JSP로 출력 이렇게하는걸 dispatcher
		request.setAttribute("result2", result2); //result 값 가져오는 역할
		//디스패쳐 하기 
		RequestDispatcher re=
				request.getRequestDispatcher("/basic/sumResult.jsp");
		re.forward(request, response); //이렇게하면 디스패쳐해서 체이지 이동
	

	}}
