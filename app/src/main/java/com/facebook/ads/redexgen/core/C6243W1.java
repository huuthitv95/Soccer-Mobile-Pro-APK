package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.W1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6243W1 extends AbstractC6846fo {
    public static String[] A01 = {"hExgTQdw1kv5p4SGmSicbF82985LCpum", "OSM8v", "iL8QA6bjiVhv7y8TzYON6pF30CxXc7Eu", "LpLF7ms2E8gIcrW5L7jBJg3HcpVfC8m9", "nyKyIbOxza05szDl5mK4c2SMRynlWefb", "BGGrZQbo3jXV4aVW1zlLDKwbTLCVQORY", "wI7v5HbNskmPwObzpny5FWr5GhKQDnFZ", "gz5SetHbJQqiE2gsx67H3auEs"};
    public final /* synthetic */ C6241Vz A00;

    public C6243W1(C6241Vz c6241Vz) {
        this.A00 = c6241Vz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A00() {
        if (this.A00.A07 == null) {
            return;
        }
        C6241Vz c6241Vz = this.A00;
        if (A01[4].charAt(24) != 'R') {
            throw new RuntimeException();
        }
        A01[0] = "oRBMgw8vkLwlbJMhgBKrYszA0eyE8H4t";
        c6241Vz.A07.A0X();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    @Override // com.facebook.ads.redexgen.core.AbstractC6846fo
    public final void A03() {
        if (this.A00.A07 != null) {
            if (!this.A00.A0E) {
                if (this.A00.A0D) {
                    this.A00.A0R(EnumC6789et.A02);
                } else {
                    C6241Vz c6241Vz = this.A00;
                    if (A01[4].charAt(24) != 'R') {
                        throw new RuntimeException();
                    }
                    A01[5] = "C0qKRDQoQScpUymuNxw7FdDIXXvcdKLa";
                    if (c6241Vz.A0T()) {
                        this.A00.A0R(EnumC6789et.A02);
                    }
                }
            }
            this.A00.A0D = false;
            this.A00.A0E = false;
        }
    }
}
