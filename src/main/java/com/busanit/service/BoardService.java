package com.busanit.service;

import com.busanit.entity.Board;
import com.busanit.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor // Repository 주입
public class BoardService {
    private BoardRepository boardRepository;

    public Page<Board> getBoardList(String keyword, Pageable pageable){
        return boardRepository.findAll(pageable);
    }

    public Page<Board> searchByTitle(String keyword, Pageable pageable){
        return boardRepository.findByTitleContaining(keyword, pageable);
    }

    public Page<Board> searchByContent(String keyword, Pageable pageable){
        return boardRepository.findByContentContaining(keyword, pageable);
    }
}
