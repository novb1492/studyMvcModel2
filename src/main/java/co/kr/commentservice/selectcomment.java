package co.kr.commentservice;

import java.util.ArrayList;

import co.kr.comment.commentbao;
import co.kr.comment.commentvo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class selectcomment implements icommentservice {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		commentbao dao=commentbao.getinstance();
		ArrayList<commentvo>array=dao.select(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("array", array);

	}

}
