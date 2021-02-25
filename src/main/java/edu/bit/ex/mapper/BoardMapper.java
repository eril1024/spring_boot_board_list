package edu.bit.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> list();

	public List<BoardVO> listWithPaging(Criteria cri);

	public int getTotal();

	public BoardVO contentView(BoardVO boardVO);

	public BoardVO replyView(BoardVO boardVO);

	public void reply(BoardVO boardVO);

	public void replyShape(BoardVO boardVO);

	public void delete(BoardVO boardVO);

	public void modify(BoardVO boardVO);

}
