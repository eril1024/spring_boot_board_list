package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	public BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {

		return mapper.list();
	}

	@Override
	public List<BoardVO> list(Criteria cri) {

		return mapper.listWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {

		return mapper.getTotal();
	}

}
