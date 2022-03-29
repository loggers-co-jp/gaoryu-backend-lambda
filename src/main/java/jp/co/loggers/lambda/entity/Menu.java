package jp.co.loggers.lambda.entity;

import javax.persistence.Entity;

import jp.co.loggers.lambda.common.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Menu
 * 
 * @author wakita
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Menu extends AbstractEntity {

	private String name;

	private Long restaurantId;

}
