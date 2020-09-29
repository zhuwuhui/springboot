package com.zhuwuhui.entity;

import lombok.Data;

/**
 * @author  zhuwuhui
 */
@Data
public class Book {

    private Integer id;

    private String cover;

    private String title;

    private String author;

    private String date;

    private String press;

    private String abs;

    private Integer cId;
}
