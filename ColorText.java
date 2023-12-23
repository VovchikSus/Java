public enum ColorText {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");


    private final String value;

    ColorText(String value) {
        this.value = value;

    }

    public void ColoredTexting(String text) {
        System.out.println(value + text);
    }
}

