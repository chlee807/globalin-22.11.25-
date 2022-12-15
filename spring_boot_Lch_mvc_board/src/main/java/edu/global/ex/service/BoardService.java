package edu.global.ex.service;

import java.util.List;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getList();
	public void register(BoardVO boardVO);
	BoardVO read(int bid);
	int remove(BoardVO board);
	
	void registerReply(BoardVO board);	//댓글쓰기
	int getTotal();
	List<BoardVO> getList(Criteria criteria);
}
