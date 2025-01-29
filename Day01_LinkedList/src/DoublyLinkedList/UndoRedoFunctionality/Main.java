package DoublyLinkedList.UndoRedoFunctionality;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello, World!");
        editor.addState("Hello, World! This is a text editor.");

        editor.displayCurrentState();
        System.out.println("Undoing...");
        editor.undo();
        editor.displayCurrentState();

        System.out.println("Redoing...");
        editor.redo();
        editor.displayCurrentState();
    }
}
