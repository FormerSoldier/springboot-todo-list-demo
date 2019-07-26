package me.yangteng.todolist.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
//@Data
public class TodoItem {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String id;

    @NotNull
    @Column
    private String value;
/*
    @Column
    @CreationTimestamp
    private Instant createTime;

    @Column
    @UpdateTimestamp
    private Instant updateTime;

    @NotNull
    @Column(columnDefinition = "BOOLEAN DEFAULT FALSE")
    private boolean finished;
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TodoItem(@NotNull String value) {
        this.value = value;
    }
}
