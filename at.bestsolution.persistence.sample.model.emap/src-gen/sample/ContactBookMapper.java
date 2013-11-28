package sample;

public interface ContactBookMapper extends at.bestsolution.persistence.ObjectMapper<sample.ContactBook> {
	public sample.ContactBook selectById(long id);
}
