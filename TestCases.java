package cs576;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class TestCases {
	ContactModel model = new ContactModel();

	@Test
	public void testNumber() {
	    model.setSearchData("2759");
	    model.setSearchType("number");
	    try {
			model.openAndSearchDatabase();
			assertEquals(model.getResult(), "oguzhsan");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  //to be added
}
  

