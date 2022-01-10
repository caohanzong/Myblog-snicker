package com.chz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author snicker
 * @date 2021/12/29 20:26
 * @Describe
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
