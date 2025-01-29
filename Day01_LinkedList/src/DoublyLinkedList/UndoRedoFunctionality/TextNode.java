package DoublyLinkedList.UndoRedoFunctionality;

public class TextNode {
    String content;
    TextNode prev, next;

    public TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
