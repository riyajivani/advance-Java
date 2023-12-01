package riya;

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.addNewShape("Circle", "DisplayFriendly");
        canvas.addNewShape("Square", "DisplayFriendly");
        canvas.addNewShape("Circle", "PrinterFriendly");
        canvas.addNewShape("Square", "PrinterFriendly");
        canvas.redraw();
    }
}
