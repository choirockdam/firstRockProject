package com.jojoldu.book.firstRockdamProject.domain;

import org.springframework.data.jpa.repository.JpaRepository;


//JpaRepository<Entity 클래스,PK타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성됩니다.
//엔티티클래스와 기본 Entity repository 는 함께 위치해야합니다.
public interface PostsRepository extends JpaRepository<Posts,Long> {

}
