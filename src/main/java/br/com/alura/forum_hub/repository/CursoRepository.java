package br.com.alura.forum_hub.repository;

import br.com.alura.forum_hub.domain.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}