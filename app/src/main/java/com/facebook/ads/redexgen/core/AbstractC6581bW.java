package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bW */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6581bW {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.1I] */
    public static C43741I A00(final C6618c7 c6618c7, final C6140UK c6140uk, final String str, final C46946X c46946x) {
        final boolean z = true;
        return new C46836M(c6618c7, c6140uk, z, str, c46946x) { // from class: com.facebook.ads.redexgen.X.1I
            public ViewOnClickListenerC5560Kr A00;
            public C6740e5 A01;
            public final InterfaceC6192VA A02 = this.A0I.A06().A02().A0A();
            public final C6140UK A03;
            public final C46946X A04;
            public final String A05;
            public static String[] A06 = {CampaignEx.JSON_KEY_AD_Q, "A73Xi2G3GXsP7eqOYxzIEC2a49UqAHwv", "tzkKnItTrh", "5yGem34VUXIU78ICazF0QaKYuuceWMlm", "d26mhKEOwDnFCjn", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "vFFUszWLQFPwstqQ2PhnuKwIvdRc", "cQLhl1S6XoLnT945hQssVDVRJiee0FVC"};
            public static final int A08 = (int) (AbstractC6334XX.A02 * (-4.0f));
            public static final int A07 = (int) (AbstractC6334XX.A02 * 6.0f);

            {
                this.A03 = c6140uk;
                this.A05 = str;
                this.A04 = c46946x;
                this.A03.A1Q(this);
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC5487Jg
            public void setupNativeCtaExtension(C6740e5 c6740e5) {
                C5734Ng c5734NgA2A;
                this.A01 = c6740e5;
                int iA0Q = C6171Up.A0Q(this.A0I.A06());
                C5728Na c5728NaA01 = this.A03.A13().A28().A01();
                C6902gi c6902giA06 = this.A0I.A06();
                String strA0w = this.A03.A13().A0w();
                InterfaceC6192VA interfaceC6192VA = this.A02;
                InterfaceC6406Yh dummyListener = C6545aw.getDummyListener();
                C6847fp c6847fpA0b = this.A04.A0b();
                C6365Y2 c6365y2A1E = this.A03.A1E();
                if (this.A03.A13() == null) {
                    c5734NgA2A = null;
                } else {
                    c5734NgA2A = this.A03.A13().A2A();
                }
                this.A00 = new ViewOnClickListenerC5560Kr(c6902giA06, strA0w, c5728NaA01, interfaceC6192VA, dummyListener, c6847fpA0b, c6365y2A1E, c5734NgA2A);
                this.A00.setCta(c6740e5.A03().A0J(), this.A05, new HashMap());
                this.A03.A1Q(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (iA0Q == 1) {
                    layoutParams.addRule(12);
                    String[] strArr = A06;
                    String str2 = strArr[5];
                    String str3 = strArr[0];
                    int length = str2.length();
                    int extensionVariant = str3.length();
                    if (length != extensionVariant) {
                        throw new RuntimeException();
                    }
                    A06[4] = "cEnNLXyXCc05OsZ";
                    AbstractC6374YB.A0R(this.A00, A07, 5, c5728NaA01.A0A(false));
                    ((C46836M) this).A06.addView(this.A00, layoutParams);
                    return;
                }
                if (iA0Q == 2) {
                    layoutParams.addRule(3, ((C46836M) this).A06.getId());
                    int extensionVariant2 = A08;
                    layoutParams.setMargins(0, extensionVariant2, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C46836M) this).A06.bringToFront();
                }
            }
        };
    }
}
