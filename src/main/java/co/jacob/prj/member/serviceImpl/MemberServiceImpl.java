package co.jacob.prj.member.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jacob.prj.comm.DataSource;
import co.jacob.prj.member.service.MemberService;
import co.jacob.prj.member.service.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true); // datasource 연결
	private MemberService map = sqlSession.getMapper(MemberService.class); // mapper 연결
	@Override
	public List<MemberVO> memberSelectList() {
		// TODO Auto-generated method stub
		return map.memberSelectList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberUpdate(vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return map.memberDelete(vo);
	}

}
