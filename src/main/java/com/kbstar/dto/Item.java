package com.kbstar.dto;


import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Item {
    private int id;
    private String name;
    private int price;
    private String imgname;
    private Date regdate;
}
