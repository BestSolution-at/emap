package sample;

public interface CountryMapper extends at.bestsolution.persistence.ObjectMapper<sample.Country> {
	public sample.Country selectById(long id);
}
