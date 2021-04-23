package net.codejava.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InfoService {
    @Autowired InfoRepository repo1;

    public List<Info> listAll() {
        return (List<Info>) repo1.findAll();
    }

}
