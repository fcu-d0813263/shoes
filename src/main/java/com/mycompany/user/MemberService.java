package com.mycompany.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository repo;

    public List<Member> memberAll(){
        return (List<Member>) repo.findAll();
    }

    public void save(Member member) {
        repo.save(member);
    }

    public Member get(Integer id) throws UserNotFoundException {
        Optional<Member> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new UserNotFoundException("Could not find any users with ID" + id);
    }

    /*
    Implement for the delete handling
     */

    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if (count == null || count == 0) {
            throw new UserNotFoundException("Could not find any users with ID" + id);
        }
        repo.deleteById(id);
    }
}
