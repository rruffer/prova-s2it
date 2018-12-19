package questao9;

import java.util.Objects;

public class Binary {

    private BinaryTree binaryTree;

    public Binary(BinaryTree binaryTree) {
        Objects.requireNonNull(binaryTree, "não pode ser nulo!!!");
        this.binaryTree = binaryTree;
    }

    public int soma() {
        return soma(binaryTree);
    }

    private int soma(BinaryTree binaryTree) {

        if (binaryTree == null) {
            return 0;
        }

        return binaryTree.getValor() + soma(binaryTree.getLeft()) + soma(binaryTree.getRight());
    }
}
