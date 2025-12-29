package crud.prepared.statements;

import java.sql.SQLException;

public class TestMarksheet {
	public static void main(String[] args) throws Exception, SQLException {
		//testAdd();
	    //testUpdate();
	    //testDelete();
		testfindByRollno();
	}
	
	public static void testAdd() throws ClassNotFoundException, SQLException {
		MarksheetModel model=new MarksheetModel();
		MarksheetBean bean=new MarksheetBean();
		
		bean.setId(3);
		bean.setRollno(103);
		bean.setName("adhiraj");
		bean.setPhy(23);
		bean.setChem(34);
		bean.setMaths(0);
		
		model.add(bean);
			
	}
	public static void testUpdate() throws ClassNotFoundException, SQLException {
		MarksheetModel model=new MarksheetModel();
		MarksheetBean bean=new MarksheetBean();
		
		
		bean.setRollno(104);
		bean.setName("adiraj");
		bean.setPhy(34);
		bean.setChem(45);
		bean.setMaths(67);
		bean.setId(3);
		
		model.update(bean);	
	}
	public static void testDelete() throws ClassNotFoundException, SQLException {
		MarksheetModel model=new MarksheetModel();
		MarksheetBean bean=new MarksheetBean();
		
		bean.setId(2);
		model.delete(bean);
		
	}
	public static void testfindByRollno() throws ClassNotFoundException, SQLException {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = new MarksheetBean();

		bean=model.findByRollNo(1);

		if (bean == null) {
			System.out.println("user not found");
		} else {
			System.out.println(bean.getId());
			System.out.println(bean.getRollno());
			System.out.println(bean.getName());
			System.out.println(bean.getPhy());
			System.out.println(bean.getChem());
			System.out.println(bean.getMaths());
			
			
			
		}
	}

}
