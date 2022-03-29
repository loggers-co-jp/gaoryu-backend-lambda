package jp.co.loggers.lambda;

import javax.transaction.Transactional;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import jp.co.loggers.lambda.entity.Restaurant;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TopLambda implements RequestHandler<Long, Restaurant> {

	@Override
	@Transactional
	public Restaurant handleRequest(Long restaurantId, Context context) {

		Restaurant restaurant = Restaurant.findById(restaurantId);

		log.info("[restaurant]{}", restaurant);

		return restaurant;
	}
}
