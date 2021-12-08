package co.jacob.prj.home.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jacob.prj.comm.Command;

public class HomeCommand implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return "home.jsp"; //메인 페이지
	}

}
