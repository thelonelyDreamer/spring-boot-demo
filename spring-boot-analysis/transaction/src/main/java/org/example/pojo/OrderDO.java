package org.example.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * in order to learn java!
 * created at 2022/6/5 15:11
 *
 * @author felixwc
 */
@Entity
@Table(name = "good_order")
@Data
@SQLDelete(sql ="update good_order set existing = 0 where id=?")
@Where(clause = "existing=1")
@Accessors(chain = true)
public class OrderDO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long customerId;
    private String goodName;
    private Integer goodCount;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatingTime;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
    private Boolean existing;
}
