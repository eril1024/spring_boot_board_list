package edu.bit.ex.service;

import java.util.List;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;

public interface BoardService {

	public List<BoardVO> getList();

	public List<BoardVO> list(Criteria cri);

	public int getTotal(Criteria cri);

	public BoardVO getContent(BoardVO boardVO);

	public BoardVO getReplyView(BoardVO boardVO);

	public void reply(BoardVO boardVO);

	public void delete(BoardVO boardVO);

	public void modify(BoardVO boardVO);
}
