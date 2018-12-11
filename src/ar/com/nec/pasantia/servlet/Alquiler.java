package ar.com.nec.pasantia.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import ar.com.nec.blockbuster.entities.Pelicula;

/**
 * Servlet implementation class Alquiler
 */
@WebServlet("/Alquiler")
public class Alquiler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Alquiler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pelicula pelicula = null;
		String action = request.getParameter("action");
		if("get".equals(action)) {
			pelicula = new Pelicula("batman","accion");
		}
		JSONObject json = new JSONObject();
		if(pelicula!=null) {
			json.put("nombre", pelicula.getNombre());
			json.put("genero", pelicula.getGenero());
		}
		response.getWriter().append(json.toJSONString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
