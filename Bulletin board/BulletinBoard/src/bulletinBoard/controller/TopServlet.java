package bulletinBoard.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bulletinBoard.beans.Comment;
import bulletinBoard.beans.Message;
import bulletinBoard.service.CommentService;
import bulletinBoard.service.MessageService;

@WebServlet(urlPatterns = { "/index.jsp"})
public class TopServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet (HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{

			List<Message> messages = new MessageService().getMessage();
			List<Comment> comment = new CommentService().getComment();
			request.setAttribute("messages",messages);
			request.setAttribute("comment",comment);

			request.getRequestDispatcher("/top.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
	}
}
