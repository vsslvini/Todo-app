package io.github.vsslvini.todo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.vsslvini.todo.Model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
