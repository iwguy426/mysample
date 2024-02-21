package com.example.mysample.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class LoginRequest implements Serializable {
    /**
     * ユーザーID
     */
    private String userId;
    /**
     * パスワード
     */
    private String password;
}