public enum TipoCafe {
    NOT_FOUND(0),
    ESPRESSO(1),
    LATTE(2),
    CAPPUCINO(3);

    private final int tipoCafe;

    TipoCafe(int tipo) {
        tipoCafe = tipo;
    }

    public static TipoCafe encontrarPorId(int tipoIngresado) {
        for (TipoCafe tipo : values()) {
            if (tipoIngresado == tipo.tipoCafe) {
                return tipo;
            }
        }
        return TipoCafe.NOT_FOUND;
    }
};
