package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.HD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC5335HD {
    public static final InterfaceC5335HD A00 = new InterfaceC5335HD() { // from class: com.facebook.ads.redexgen.X.mq
        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final InterfaceC5331H9[] A5N() {
            return AbstractC5334HC.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC5335HD
        public final /* synthetic */ InterfaceC5331H9[] A5O(Uri uri, Map map) {
            return AbstractC5334HC.A01(this, uri, map);
        }
    };

    InterfaceC5331H9[] A5N();

    InterfaceC5331H9[] A5O(Uri uri, Map<String, List<String>> map);
}
