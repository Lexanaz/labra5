package net.codejava.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MorderService {
    @Autowired MorderRepository repo2;

    public List<Morder> listAll() {
        return (List<Morder>) repo2.findAll();
    }





}
