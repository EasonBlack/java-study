package com.eason.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.eason.entity.Keyword;
import com.eason.repository.KeywordRepository;
import java.util.*;

@Service
public class KeywordService {

    @Autowired 
    private KeywordRepository keywordRepository;

    public Iterable<Keyword> getAllKeywords() {
        return keywordRepository.findAll();
    }

    public Keyword getKeywordById(Long id) {
        return keywordRepository.findOne(id);
    }


}