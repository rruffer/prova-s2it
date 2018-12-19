package questao9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testando os métodos da arvore binária")
public class BinaryTest {

	@Test
	public void binaryTreeNullMustReturnNullPointerException() {

		assertThrows(NullPointerException.class, () -> {
			BinaryTree binaryTree = null;
			Binary algebra = new Binary(binaryTree);
		});

	}

	@Test
	public void sumOfARootMustReturnCorrectValue() {

		int expected = 2;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(expected);
		Binary algebra = new Binary(binaryTree);
		assertEquals(expected, algebra.soma());

	}

	@Test
	public void sumBalancedBinaryTreeMustReturnCorrectValue() {

		int expected = 6;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(2);
		BinaryTree binaryTree1 = new BinaryTree();
		binaryTree1.setValor(2);
		BinaryTree binaryTree2 = new BinaryTree();
		binaryTree2.setValor(2);
		binaryTree.setLeft(binaryTree1);
		binaryTree.setRight(binaryTree2);
		Binary algebra = new Binary(binaryTree);
		assertEquals(expected, algebra.soma());

	}

	@Test
	public void sumUnBalancedBinaryTreeMustReturnCorrectValue() {

		int expected = 34;
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.setValor(15);
		BinaryTree binaryTree1 = new BinaryTree();
		binaryTree1.setValor(18);
		BinaryTree binaryTree2 = new BinaryTree();
		binaryTree2.setValor(1);
		binaryTree.setLeft(binaryTree1);
		binaryTree1.setLeft(binaryTree2);
		Binary algebra = new Binary(binaryTree);
		assertEquals(expected, algebra.soma());

	}

}
