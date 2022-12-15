package edu.global.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.global.ex.mapper.BoardMapper;
import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;

	// 글 전체목록
	@Override
	public List<BoardVO> getList() {
		log.info("getList()..");
		return boardMapper.getList();
	}

	@Override
	public void register(BoardVO boardVO) {
		log.info("register()..");
		boardMapper.insert(boardVO);
	}

	@Override
	public BoardVO read(int bid) {
		log.info("read()..");

		return boardMapper.read(bid);
	}

	@Override
	public int remove(BoardVO board) {
		log.info("remove()..");
		return boardMapper.delete(board);
	}

	@Transactional
	@Override
	public void registerReply(BoardVO board) {
		log.info("registerReply() ..");

		// 핵심
		boardMapper.updateShape(board); // 답글위치
		boardMapper.insertReply(board); // 답글등록
	}

	@Override
	public int getTotal() {
		log.info("getTotal() ..");

		return boardMapper.getTotalCount();
	}

	@Override
	public List<BoardVO> getList(Criteria criteria) {
		log.info("getList(Criteria criteria) ..");

		return boardMapper.getListWithPaging(criteria);
	}
}
