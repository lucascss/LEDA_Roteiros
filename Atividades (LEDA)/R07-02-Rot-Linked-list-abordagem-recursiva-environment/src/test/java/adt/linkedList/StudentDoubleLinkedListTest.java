package adt.linkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentDoubleLinkedListTest extends StudentLinkedListTest {

	private DoubleLinkedList<Integer> lista1;
	private DoubleLinkedList<Integer> lista2;
	private DoubleLinkedList<Integer> lista3;
	
	@Before
	public void setUp() throws Exception {

		getImplementations();

		// Lista com 3 elementos.
		lista1.insert(3);
		lista1.insert(2);
		lista1.insert(1);

	}

	private void getImplementations() {
		// TODO O aluno deve ajustar aqui para instanciar sua implementação
		lista1 = new RecursiveDoubleLinkedListImpl<>();
		lista2 = new RecursiveDoubleLinkedListImpl<>();
	}

	@Test
	public void testIsEmpty() {
		Assert.assertFalse(lista1.isEmpty());
		Assert.assertTrue(lista2.isEmpty());
	}

	@Test
	public void testSize() {
		Assert.assertEquals(3, lista1.size());
		Assert.assertEquals(0, lista2.size());
	}

	@Test
	public void testSearch() {
		Assert.assertTrue(2 == lista1.search(2));
		Assert.assertNull(lista1.search(4));
		Assert.assertFalse(3 == lista1.search(2));
	}

	@Test
	public void testInsert() {
		Assert.assertEquals(3, lista1.size());
		lista1.insert(5);
		lista1.insert(7);
		Assert.assertEquals(5, lista1.size());

		Assert.assertEquals(0, lista2.size());
		lista2.insert(4);
		lista2.insert(7);
		Assert.assertEquals(2, lista2.size());
	}
	
	@Test
	public void testInsertFirst() {
		Assert.assertEquals(3, lista1.size());
		lista1.insertFirst(5);
		lista1.insertFirst(7);
		Assert.assertEquals(5, lista1.size());

		Assert.assertEquals(0, lista2.size());
		lista2.insertFirst(4);
		lista2.insertFirst(7);

		Assert.assertEquals(2, lista2.size());
	}

	@Test
	public void testRemove() {
		Assert.assertEquals(3, lista1.size());
		lista1.remove(2);
		lista1.remove(1);
		Assert.assertEquals(1, lista1.size());

	}
	
	@Test
	public void testRemoveLast() {
		Assert.assertEquals(3, lista1.size());
		lista1.removeLast();
		Assert.assertEquals(2, lista1.size());
	}

	@Test
	public void testToArray() {
		Assert.assertArrayEquals(new Integer[] {}, lista2.toArray());
		Assert.assertArrayEquals(new Integer[] { 3, 2, 1 }, lista1.toArray());
	}
}