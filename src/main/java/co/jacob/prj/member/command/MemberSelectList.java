package co.jacob.prj.member.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jacob.prj.comm.Command;
import co.jacob.prj.member.service.MemberService;
import co.jacob.prj.member.service.MemberVO;
import co.jacob.prj.member.serviceImpl.MemberServiceImpl;

public class MemberSelectList implements Command {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) {
		// 회원 전체 목록
		MemberService memberDao = new MemberServiceImpl();
		List<MemberVO> members = memberDao.memberSelectList(); //전체회원목록을 가져온다.
		request.setAttribute("members", members);
		
		
		return "memberSelectList.jsp";
	}

}
