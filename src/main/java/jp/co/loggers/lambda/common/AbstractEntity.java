package jp.co.loggers.lambda.common;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * AbstractEntity
 *
 * @author Daisuke Wakita
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@MappedSuperclass
@JsonIgnoreProperties({ "hibernateLazyInitializer" })
public abstract class AbstractEntity extends PanacheEntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(insertable = false, updatable = false)
	private LocalDateTime createdAt;

	@JsonIgnore
	@Column(insertable = false, updatable = false)
	private LocalDateTime updatedAt;

	@JsonIgnore
	@Column(insertable = false)
	private Boolean deleted;

}
