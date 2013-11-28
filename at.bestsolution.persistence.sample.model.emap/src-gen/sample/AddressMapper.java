package sample;

public interface AddressMapper extends at.bestsolution.persistence.ObjectMapper<sample.Address> {
	public sample.Address selectById(long id);
	public java.util.List<sample.Address> selectAllForPerson(long personId);
}
