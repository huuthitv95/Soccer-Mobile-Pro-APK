package com.facebook.ads.redexgen.core;

import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3v */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C45323v extends AbstractC5130Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", CmcdConfiguration.KEY_DEADLINE, "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C5123Dm A00;

    public C45323v(C5123Dm c5123Dm) {
        this.A00 = c5123Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC6143UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C5131Du c5131Du) {
        if (this.A00.A01 != null && !this.A00.A05 && c5131Du.A00().getAction() == 0) {
            C5123Dm c5123Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            c5123Dm.A07.removeCallbacksAndMessages(null);
            if (this.A00.A0G(EnumC6815fJ.A04)) {
                this.A00.A03();
                C5123Dm c5123Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c5123Dm2.A06(true, false);
                } else {
                    c5123Dm2.A06(true, false);
                }
            }
            if (this.A00.A04) {
                this.A00.A07.postDelayed(new C5124Dn(this), this.A00.A00);
            }
        }
    }
}
