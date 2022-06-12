package org.example.pojo;

import lombok.Data;

import javax.persistence.*;

/**
 * in order to learn java!
 * created at 2022/6/5 15:41
 *
 * @author felixwc
 */
@Data
@Table(name = "good_repository")
@Entity
public class GoodRepositoryDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long goodId;
    private Integer goodStore;

}
