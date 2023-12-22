public enum ColorText {
    BLACK,
    RED,
    GREEN,
    YELLOW,
    BLUE,
    PURPLE,
    CYAN,
    WHITE;

    ColorText() {

    }

    public void ColorSwitch(String text, ColorText chosenColor) {
        switch (chosenColor) {
            case BLACK:
                System.out.println("\u001B[30m" + text + "\u001B[0m");
                break;
            case RED:
                System.out.println("\u001B[31m" + text + "\u001B[0m");
                break;
            case GREEN:
                System.out.println("\u001B[32m" + text + "\u001B[0m");
                break;
            case YELLOW:
                System.out.println("\u001B[33m" + text + "\u001B[0m");
                break;
            case BLUE:
                System.out.println("\u001B[34m" + text + "\u001B[0m");
                break;
            case PURPLE:
                System.out.println("\u001B[35m" + text + "\u001B[0m");
                break;
            case CYAN:
                System.out.println("\u001B[36m" + text + "\u001B[0m");
                break;
            case WHITE:
                System.out.println("\u001B[37m" + text + "\u001B[0m");
                break;
        }
    }
}
