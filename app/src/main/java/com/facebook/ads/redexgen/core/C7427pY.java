package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.Tracks;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7427pY implements InterfaceC442224 {

    @MetaExoPlayerCustomization("Remove Immutable List for Oculus")
    public final List<C7428pZ> A00;
    public static String[] A01 = {"0eRTZm", "wsJdmo7HTY", "VHUY43wJh5fnSZ3wEvYR5lxV3yQqNNMU", "k8", "kUjTCgoRRteoZ0", "6rJamNQt6U89KJOuF", "xAstRHAahUkfHwQSYEnj0qzfqp", "GuXFY9846UfmIsqOXXuGkg4YoPfa8R1b"};
    public static final C7427pY A03 = new C7427pY(new ArrayList());
    public static final String A04 = AbstractC46115C.A0h(0);
    public static final InterfaceC442123<C7427pY> A02 = new InterfaceC442123() { // from class: com.facebook.ads.redexgen.X.pb
        @Override // com.facebook.ads.redexgen.core.InterfaceC442123
        public final InterfaceC442224 A6f(Bundle bundle) {
            return C7427pY.A00(bundle);
        }
    };

    public C7427pY(List<C7428pZ> list) {
        this.A00 = MetaExoPlayerCustomizedCollections.A03((C7428pZ[]) list.toArray(new C7428pZ[0]));
    }

    public static /* synthetic */ C7427pY A00(Bundle bundle) {
        List<Tracks.Group> groups;
        List<Tracks.Group> groups2 = bundle.getParcelableArrayList(A04);
        if (groups2 == null) {
            groups = Collections.emptyList();
        } else {
            groups = C454144.A01(C7428pZ.A05, groups2);
        }
        return new C7427pY(groups);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.A00.equals(((C7427pY) obj).A00);
        }
        String[] strArr = A01;
        if (strArr[2].charAt(26) == strArr[7].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "oFMxQz";
        strArr2[3] = "4E";
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
