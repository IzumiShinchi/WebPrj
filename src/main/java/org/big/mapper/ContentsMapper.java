package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.big.dto.ContentsDTO;
import org.big.dto.ContentsFileDTO;

@Mapper
public interface ContentsMapper {
	
	List<ContentsDTO> contentsList() throws Exception;
	
	List<ContentsDTO> movieList() throws Exception;
	
	List<ContentsDTO> kMovieList() throws Exception;
	
	List<ContentsDTO> fMovieList() throws Exception;
	
	List<ContentsDTO> tAniList() throws Exception;
	
	List<ContentsDTO> dramaList() throws Exception;
	
	List<ContentsDTO> kDramaList() throws Exception;
	
	List<ContentsDTO> fDramaList() throws Exception;
	
	List<ContentsDTO> aniList() throws Exception;
	
	void registContent(ContentsDTO contents) throws Exception;
	
	void registContentFileList(List<ContentsFileDTO> list) throws Exception;
		
	List<ContentsFileDTO> contentsFileList() throws Exception;
	
	List<ContentsFileDTO> movieContentsFileList() throws Exception;
	
	List<ContentsFileDTO> fMovieContentsFileList() throws Exception;
	
	List<ContentsFileDTO> kMovieContentsFileList() throws Exception;
	
	List<ContentsFileDTO> tAniContentsFileList() throws Exception;
	
	List<ContentsFileDTO> dramaContentsFileList() throws Exception;
	
	List<ContentsFileDTO> fDramaContentsFileList() throws Exception;
	
	List<ContentsFileDTO> kDramaContentsFileList() throws Exception;
	
	List<ContentsFileDTO> aniContentsFileList() throws Exception;
	
	ContentsFileDTO contentsFileInformation(@Param("contentsCode") String contentsCode) throws Exception;
	
	void updateContent(ContentsDTO contents) throws Exception;
	
	void deleteContent(String contentsCode) throws Exception;
	
	ContentsDTO contentDetail(String contentsCode) throws Exception;
}
