package com.many.miniproject1.skill;

import com.many.miniproject1.post.Post;
import com.many.miniproject1.resume.Resume;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@NoArgsConstructor
@Table(name = "skill_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Skill {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;
    private String skill;

    @JoinColumn(name = "resume_id", nullable = true)
    @ManyToOne(fetch =  FetchType.LAZY)
    private Resume resume; //null

    @JoinColumn(name = "post_id", nullable = true)
    @ManyToOne(fetch = FetchType.LAZY)
    private Post post; // null 허용 되어야 한다

    @CreationTimestamp
    private Timestamp createdAt;

    @Builder
    public Skill(Integer id, String skill, Resume resume, Post post, Timestamp createdAt) {
        this.id = id;
        this.skill = skill;
        this.resume = resume;
        this.post = post;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skill='" + skill + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}