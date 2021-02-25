package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import jdk.internal.org.jline.utils.Log;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	public BoardMapper mapper;

	@Override
	public List<BoardVO> getList() {
		log.info("s.getList()");
		return mapper.list();
	}

	@Override
	public List<BoardVO> list(Criteria cri) {
		log.info("s.lits()");
		return mapper.listWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		log.info("s.getTotal()");
		return mapper.getTotal();
	}

	@Override
	public BoardVO getContent(BoardVO boardVO) {
		log.info("s.getContent()");
		return mapper.contentView(boardVO);
	}

}
