package jp.co.loggers.lambda.entity;

import java.util.Date;

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
public class Coupon extends AbstractEntity {

	private String name;

	private Long restaurantId;

	private String presentationConditions;

	private String conditionsOfUse;

	private Date expiresOn;

}
