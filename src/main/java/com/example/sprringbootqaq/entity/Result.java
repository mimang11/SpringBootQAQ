package com.example.sprringbootqaq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author he
 * @Date 2022/11/10 7:42
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer status;
    private List message;
}
