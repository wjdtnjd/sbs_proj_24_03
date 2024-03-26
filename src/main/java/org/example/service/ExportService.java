package org.example.service;

import org.example.container.Container;
import org.example.dto.Article;
import org.example.util.Util;

import java.util.List;

public class ExportService {
    ArticleService articleService;
    MemberService memberService;

    public ExportService() {
        articleService = Container.articleService;
        memberService = Container.memberService;
    }

    public void makeHtml() {
        List<Article> articles = articleService.getForPrintArticles();

        for ( Article article : articles ) {
            String writerName = memberService.getMemberNameById(article.memberId);

            String fileName = article.id + ".html";
            String html = "<meta charset=\"UTF-8\">";
            html += "<dib>번호 : " + article.id + "</div>";
            html += "<dib>날짜 : " + article.regDate + "</div>";
            html += "<dib>작성자 : " + writerName + "</div>";
            html += "<dib>제목 : " + article.title + "</div>";
            html += "<dib>내용 : " + article.body + "</div>";
            if ( article.id > 1 ) {
                html += "<dib><a href=\"" + (article.id -1 ) + ".html\">이전글</a></div>";
            }
            html += "<dib><a href=\"" + (article.id +1 ) + ".html\">다음글</a></div>";
            Util.writeFileContents("exportHtml/" + fileName, html);
        }
    }
}
