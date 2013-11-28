package sample;

public interface PersonMapper extends at.bestsolution.persistence.ObjectMapper<sample.Person> {
	public sample.Person selectById(long id);
	public java.util.List<sample.Person> selectAllForContactBook(long contactBookId);
	public java.util.List<sample.Person> selectAll();
}
