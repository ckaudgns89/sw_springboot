package com.smhrd.web.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.smhrd.web.entity.Board;
import com.smhrd.web.entity.SearchCriteria;

@Mapper
public interface BoardMapper {

	// 게시글 전체 조회 메소드
	public ArrayList<Board> selectBoard();
	
	// 게시글 추가 메소드
	public void insertBoard(Board board);
	
	// 게시글 하나 조회 메소드
	@Select("select * from board where bnum=#{bnum}")
	public Board selectOne(int bnum);
	
	@Update("update board set bcnt=bcnt+1  where bnum = #{bnum}")
	public void count(int bnum);
	
	// 기준이 내용아러고 가정하고 검색한 글자가 "포함"되어있는 모든 게시글을 조회해주는 쿼리
	// --> .xml 파일에 작성해주기
	public List<Board> search(SearchCriteria cri);
	
}
