package com.bytedance.sdk.component.p145fi.p146lr.p147ik;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p145fi.InterfaceC2590aw;
import com.bytedance.sdk.component.p145fi.InterfaceC2595ik;
import com.bytedance.sdk.component.p145fi.InterfaceC2623nr;
import com.bytedance.sdk.component.p145fi.InterfaceC2624qt;
import com.bytedance.sdk.component.p145fi.InterfaceC2631vr;
import com.bytedance.sdk.component.utils.slm;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2602lr implements InterfaceC2631vr {

    /* JADX INFO: renamed from: ri */
    private volatile C2598di f7332ri;

    private C2602lr() {
    }

    /* JADX INFO: renamed from: lr */
    private void m9678lr(Context context, InterfaceC2590aw interfaceC2590aw) {
        if (this.f7332ri != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (interfaceC2590aw == null) {
            interfaceC2590aw = C2599fi.m9595ri(context);
        }
        this.f7332ri = new C2598di(context, interfaceC2590aw);
    }

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2631vr m9679ri(Context context, InterfaceC2590aw interfaceC2590aw) {
        C2602lr c2602lr = new C2602lr();
        c2602lr.m9678lr(context, interfaceC2590aw);
        return c2602lr;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2631vr
    /* JADX INFO: renamed from: ri */
    public InterfaceC2624qt mo9680ri(String str) {
        return new C2600ik.lr(this.f7332ri).m9653ik(str);
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2631vr
    /* JADX INFO: renamed from: ri */
    public InputStream mo9681ri(String str, String str2) {
        byte[] bArrRi;
        if (this.f7332ri != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = slm.m10282ri(str);
            }
            InterfaceC2623nr interfaceC2623nrM9586ik = this.f7332ri.m9586ik();
            if (interfaceC2623nrM9586ik != null && (bArrRi = interfaceC2623nrM9586ik.mo9704ri(str2)) != null) {
                return new ByteArrayInputStream(bArrRi);
            }
            Collection<InterfaceC2595ik> collectionM9587ka = this.f7332ri.m9587ka();
            if (collectionM9587ka != null) {
                Iterator<InterfaceC2595ik> it = collectionM9587ka.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamMo9568ri = it.next().mo9568ri(str2);
                    if (inputStreamMo9568ri != null) {
                        return inputStreamMo9568ri;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p145fi.InterfaceC2631vr
    /* JADX INFO: renamed from: ri */
    public boolean mo9682ri(String str, String str2, String str3) {
        if (this.f7332ri == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = slm.m10282ri(str);
        }
        InterfaceC2595ik interfaceC2595ikM9593ri = this.f7332ri.m9593ri(str3);
        if (interfaceC2595ikM9593ri != null) {
            return interfaceC2595ikM9593ri.mo9703lr(str2);
        }
        return false;
    }
}
