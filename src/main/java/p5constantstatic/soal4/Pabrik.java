package p5constantstatic.soal4;

class HpPabrik {
    private static int abjadCodeCounter = 0;
    private static int numberCodeCounter = 1;

    public static final String NAKIO = "Nakio";
    public static final String SUMSANG = "Sumsang";
    public static final String XAIOMI = "Xaiomi";
    public static final String SYNO = "Syno";

    private final String[] ABJAD_CODE = {"A", "B", "C", "D", "E"};

    private final String name;
    private final String code;

    public HpPabrik (String name) {
        this.name = name;
        code = numberCodeCounter + ABJAD_CODE[abjadCodeCounter];
        numberCodeCounter += 2;
        if (ABJAD_CODE[abjadCodeCounter].equalsIgnoreCase("E")) {
            abjadCodeCounter = 0;
        } else {
            abjadCodeCounter++;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

}