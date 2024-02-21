package com.example.mysample.entity;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Data
public class Login implements Serializable {
    /**
     * ユーザID
     */
    private String userId;
    /**
     * 名前
     */
    private String name;
    /**
     * パスワード
     */
    private String password;
    /**
     * 更新日時
     */
    private Date updateDate;
    /**
     * 登録日時
     */
    private Date createDate;
    /**
     * 削除日時
     */
    private Date deleteDate;
    
}