package com.mycompany.user;

import org.springframework.data.repository.CrudRepository;


public interface MemberRepository extends CrudRepository<Member, Integer> {
    public Long countById(Integer id);
}
