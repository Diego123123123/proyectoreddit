package com.ucbcba.logindemo.repositories;

import com.ucbcba.logindemo.entities.FavoritePost;
import com.ucbcba.logindemo.entities.SharedPost;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface SharedPostRepository extends CrudRepository<SharedPost, Integer> {
    @Query("SELECT u FROM SharedPost u WHERE u.user = :user and u.post = :post")
    SharedPost findUserByStatusAndNameNamedParams(
            @Param("post") Integer post,
            @Param("user") Integer user);
}
