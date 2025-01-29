package DoublyLinkedList.UndoRedoFunctionality;

public class TextEditor {
    private TextNode current;
    private int historyLimit = 10;
    private int historySize = 0;

    public void addState(String content) {
        TextNode newNode = new TextNode(content);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        historySize++;
        trimHistory();
    }

    private void trimHistory() {
        while (historySize > historyLimit) {
            TextNode temp = current;
            while (temp.prev != null) {
                temp = temp.prev;
            }
            temp.next.prev = null;
            historySize--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current State: " + current.content);
        } else {
            System.out.println("No text available.");
        }
    }
}
