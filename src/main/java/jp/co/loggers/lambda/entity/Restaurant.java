package jp.co.loggers.lambda.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import jp.co.loggers.lambda.common.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Restaurant
 * 
 * @author wakita
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Restaurant extends AbstractEntity {

	private String name;

	private String zipcode;

	private String prefecturesCode;

	private String address1;

	private String address2;

	private String address3;

	private String latitude;

	private String longitude;

	private String tel;

	private String businessHours;

	private String regularHoliday;

	private String averageAmountSpent;

	private String acceptedCreditCards;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private Set<Menu> menus;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurantId")
	private Set<Coupon> coupons;

}
