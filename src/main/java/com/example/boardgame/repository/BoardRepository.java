package com.example.boardgame.repository;

import com.example.boardgame.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BoardRepository extends JpaRepository <Board, Long> {
    List<Board> findAllByName(String name);
}
