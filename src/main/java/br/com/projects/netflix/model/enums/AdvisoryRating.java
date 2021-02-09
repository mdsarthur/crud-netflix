package br.com.projects.netflix.model.enums;

import br.com.projects.netflix.model.Title;

/**
 * This enum defines all the six (6) possible values for advisory rating based on the official Brazilian Advisory Rating System standard.
 * Those values can be used in the class {@link Title}.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.projects.netflix.model.Title
 */
public enum AdvisoryRating
{
	GREEN_GENERAL_AUDIENCE, BLUE_TEN, YELLOW_TWELVE, ORANGE_FOURTEEN, RED_SIXTEEN, BLACK_EIGHTEEN;
}