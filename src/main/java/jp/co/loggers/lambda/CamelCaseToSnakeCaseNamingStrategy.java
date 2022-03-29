package jp.co.loggers.lambda;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import com.google.common.base.CaseFormat;

/**
 * CamelCaseToSnakeCaseNamingStrategy
 *
 * @author Daisuke Wakita
 */
@SuppressWarnings("serial")
public class CamelCaseToSnakeCaseNamingStrategy extends PhysicalNamingStrategyStandardImpl {

	@Override
	public Identifier toPhysicalColumnName(final Identifier identifier, final JdbcEnvironment jdbcEnv) {
		return Identifier.toIdentifier(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, identifier.getText()));
	}

}
