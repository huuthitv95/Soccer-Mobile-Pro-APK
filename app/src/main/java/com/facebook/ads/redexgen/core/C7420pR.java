package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7420pR implements InterfaceC442224 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C7422pT> A01;
    public static final C7420pR A03 = new C7420pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = AbstractC46115C.A0h(0);
    public static final String A05 = AbstractC46115C.A0h(1);
    public static final InterfaceC442123<C7420pR> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7420pR.A00(bundle);
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C7420pR(List<C7422pT> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C7422pT[]) list.toArray(new C7422pT[0]));
        this.A00 = j;
    }

    public static final C7420pR A00(Bundle bundle) {
        List listA01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = C454144.A01(C7422pT.A0I, cues);
        }
        return new C7420pR(listA01, bundle.getLong(A05));
    }
}
