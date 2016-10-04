package co.edu.eam.ingesoftdesarrrollo.universidad.test;

import org.caferrer.testdata.junit.TestDataUtil;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.eam.ingesoft.desarrollo.logica.bo.BOCurso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoftdesarrollo.universidad.persistencia.modelo.entidades.Profesor;
import junit.framework.Assert;

public class BOCursoTest {
	
	@BeforeClass
	public static void beforeClass(){
		TestDataUtil.ejecutarSQL("sqltest/prueba-add.sql");
	}
	
	private BOCurso boCurso;
	
	@Before
	public void setUp(){
		boCurso = new BOCurso();
	}
	
	@Test
	public void testCrearCurso (){
		
		Curso c = new Curso();
		c.setCodigo("789");
		Asignatura asi = new Asignatura();
		asi.setCodigo("090");
		c.setAsignatura(asi);
		Profesor pro = new Profesor();
		pro.setCedula("080");
		c.setProfesor(pro);
		
		try {
			
			boCurso.crearCurso(c);
			
			Curso cur = boCurso.buscarCurso("789");
			Assert.assertNotNull(cur);
			Assert.assertEquals("090", cur.getAsignatura().getCodigo());
			
		} catch (Exception e) {
			Assert.fail();
		}
		
	}
	
	
	@AfterClass
	public static void AfterClass(){
		TestDataUtil.ejecutarSQL("sqltest/prueba-del.sql");
	}

} 
