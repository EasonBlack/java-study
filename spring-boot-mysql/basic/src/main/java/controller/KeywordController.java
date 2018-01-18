package com.eason.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import javax.servlet.http.HttpSession;
import java.util.*;

import com.eason.service.KeywordService;
import com.eason.entity.Keyword;

@RestController
public class KeywordController {
    @Autowired 
    private KeywordService keywordService;

    @RequestMapping(value={"/keyword"})
    public @ResponseBody Iterable<Keyword> getAllKeyword() { 
        return keywordService.getAllKeywords();
    }

    @RequestMapping(value={"/keyword/{id}"})
    public @ResponseBody Keyword getKeywordById(@PathVariable Long id) { 
        return keywordService.getKeywordById(id);
    }

}


