package com.ispoet.blog.utils;

import com.ispoet.blog.support.web.MarkdownService;
import com.ispoet.blog.support.web.impl.PegDownMarkdownService;

/**
 * A Markdown processing util class
 *
 * @author Raysmond
 */
public class Markdown {

    private static final MarkdownService MARKDOWN_SERVICE = new PegDownMarkdownService();

    public static String markdownToHtml(String content) {
        return MARKDOWN_SERVICE.renderToHtml(content);
    }
}
