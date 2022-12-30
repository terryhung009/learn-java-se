package com.danny.demo1.controller;

import com.danny.demo1.AjaxResponse;
import com.danny.demo1.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleController {

//    @RequestMapping(value = "/articles/{id}" , method = RequestMethod.GET)
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id){
        Article article = Article.builder()
                .id(1L)
                .author("danny")
                .content("spring boot 從青銅到王者")
                .createTime(new Date())
                .title("t1")
                .build();

        log.info("article: " + article);

        return AjaxResponse.success(article);

    }

    /**
     * 新增文章
     * @param article
     * @return
     */
//    @RequestMapping(value = "/articles" , method = RequestMethod.POST)
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestBody Article article,
                                    @RequestHeader String aaa){

        log.info("saveArticle: " + article);

        return AjaxResponse.success();

    }

    /** 使用 @RequestParam 傳遞資料
     *
     * @param author
     * @param title
     * @param content
     * @param createTime
     * @return
     */
//    @PostMapping("/articles")
//    public AjaxResponse saveArticle(
//            @RequestParam String author,
//            @RequestParam String title,
//            @RequestParam String content,
//            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//            @RequestParam Date createTime){
//
//        log.info("saveArticle: " + createTime);
//
//        return AjaxResponse.success();

//    }

    /**
     * 更新文章
     * @param article
     * @return
     */
//    @RequestMapping(value = "/articles" , method = RequestMethod.PUT)
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article){
        if(article.getId() == null){
            //TODO 拋出自訂的異常
        }
        log.info("updateArticle: " + article);

        return AjaxResponse.success();

    }

//    @RequestMapping(value = "/articles/{id}" , method = RequestMethod.DELETE)
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id){

        log.info("deleteArticle:  " + id);

        return AjaxResponse.success();

    }


}
