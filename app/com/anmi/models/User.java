package com.anmi.models;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;
@Entity
@Table(name="cas_user")
public class User {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 6, max = 100)
    @Column(name = "login", unique = true, nullable = false)
    @Email
    private String username;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "account_expires_At", nullable = false)
    private Calendar accountExpiresAt;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "PASSWORD_EXPIRES_AT", nullable = false)
    private Calendar passwordExpiresAt;

    @NotNull
    @Type(type = "yes_no")
    @Column(name = "self_locked", nullable = false)
    private boolean selfLocked;

    @NotNull
    @Type(type = "yes_no")
    @Column(name = "admin_locked", nullable = false)
    private boolean adminLocked;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password", nullable = false)
    private String password;

    @NotNull
    @Type(type = "yes_no")
    @Column(name = "enabled", nullable = false)
    private boolean enabled = true;

    @Column(name = "attempt_count")
    private Integer attemptCount = 0;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_login")
    private Calendar lastLogin;


    @Size(max = 4000)
    @Column(name = "extra_info_json", nullable = true)
    private String extraInfoJson;


}
