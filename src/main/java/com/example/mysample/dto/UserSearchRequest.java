package com.example.mysample.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class UserSearchRequest implements Serializable {
    /**
     * ユーザID
     */
    private Integer id;
    /**
     * ユーザー名
     */
    private String name;
}
