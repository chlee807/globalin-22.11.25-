package edu.global.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.global.ex.page.Criteria;
import edu.global.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	public List<BoardVO> getList();
	BoardVO read(int bid);		//글조회
	void insert(BoardVO board);	//글쓰기
	int delete(BoardVO board);	//글삭제
	
	//답글관련
	void updateShape(BoardVO boardVO);	//답글위치
	void insertReply(BoardVO boardVO);	//답글등록
	
	//paging 관련
	int getTotalCount();
	public List<BoardVO> getListWithPaging(Criteria cri);
}
