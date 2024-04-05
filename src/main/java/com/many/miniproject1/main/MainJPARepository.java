package com.many.miniproject1.main;

import com.many.miniproject1.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainJPARepository extends JpaRepository<Post, Integer> {

}
