package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kT */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7128kT implements InterfaceC46335Y {
    public static String[] A08 = {"FmqEYLEjOBovlIuvu7xTusZ6GIuR3pge", "QeU0DUuOAkxor0HSqOzEAO6P6r4bp110", "WNDsEfwHyCZVTn6rYNycLV5FNYvDeUGR", "", "9kl6sBOZXnbWpCxdvxnR8wYz13jzyZGc", "QdIGCZBZzwjOBdbigrYBFiKU6cV", "ZYM92CzuhlmQLmzBChoRToTytAMTrYW0", "W1yocJmlBB3ILJesLtmFt5l7ilHzoTT3"};
    public int A00;
    public int A01;
    public InterfaceC46305V A02;
    public InterfaceC46335Y A04;
    public InterfaceC5656MP A05;
    public boolean A07;
    public InterfaceC46335Y A03 = new C7404pB();
    public InterfaceC5665MY A06 = InterfaceC5665MY.A00;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC46335Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C47968B A5I() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00, this.A01);
    }

    private C47968B A01(InterfaceC7408pF interfaceC7408pF, int i, int i2) {
        C7129kU c7129kUA5H;
        InterfaceC5656MP interfaceC5656MP = (InterfaceC5656MP) AbstractC45353y.A01(this.A05);
        if (this.A07 || interfaceC7408pF == null) {
            c7129kUA5H = null;
        } else if (this.A02 != null) {
            InterfaceC46305V interfaceC46305V = this.A02;
            String[] strArr = A08;
            if (strArr[6].charAt(29) == strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "BsDku37cs2h0edzjFuAGMntAOCTwp5qB";
            strArr2[1] = "0s0KxP1bBIf3QxkhX8XEl0TpXhOFUtvY";
            c7129kUA5H = interfaceC46305V.A5H();
        } else {
            c7129kUA5H = new C7130kV().A00(interfaceC5656MP).A5H();
        }
        return new C47968B(interfaceC5656MP, interfaceC7408pF, this.A03.A5I(), c7129kUA5H, this.A06, i, null, i2, null);
    }

    public final AbstractC45153d A02() {
        return null;
    }

    public final C7128kT A03(int i) {
        this.A00 = i;
        return this;
    }

    public final C7128kT A04(InterfaceC46335Y interfaceC46335Y) {
        this.A03 = interfaceC46335Y;
        return this;
    }

    public final C7128kT A05(InterfaceC46335Y interfaceC46335Y) {
        this.A04 = interfaceC46335Y;
        return this;
    }

    public final C7128kT A06(InterfaceC5656MP interfaceC5656MP) {
        this.A05 = interfaceC5656MP;
        return this;
    }

    public final C47968B A07() {
        return A01(this.A04 != null ? this.A04.A5I() : null, this.A00 | 1, -1000);
    }
}
