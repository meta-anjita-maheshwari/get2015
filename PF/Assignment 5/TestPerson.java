package Assignments;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestPerson {


@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@AfterClass
public static void tearDownAfterClass() throws Exception {
}

@Before
public void setUp() throws Exception {
}

@After
public void tearDown() throws Exception {
}

@Test
public void testForToString() {
int uid=16;
String name="Anjita";
int studentId=659;
String subject[]={"English","Maths"};
Student std=new Student(uid,name,studentId,subject);
String nameagain;
nameagain="Name :-"+name+"\nuid :-"+uid+"\nStudent ID :-"+studentId;
assertEquals(nameagain,std.toString());
}

@Test
public void testForToCourses()
{	
int uid=16;
String name="Anjita";
int studentid=659;
String subject[]={"English","Maths"};
Student std=new Student(uid,name,studentid,subject);
std.setCourses(subject);
assertArrayEquals(subject,std.getCourses());
}

}