package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.network.AbstractC8434z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8272f {

    /* JADX INFO: renamed from: a */
    public AdSession f18442a;

    /* JADX INFO: renamed from: b */
    public AdEvents f18443b;

    /* JADX INFO: renamed from: c */
    public MediaEvents f18444c;

    /* JADX INFO: renamed from: d */
    public boolean f18445d = false;

    /* JADX INFO: renamed from: e */
    public boolean f18446e = false;

    /* JADX INFO: renamed from: f */
    public C8219t0 f18447f;

    /* JADX INFO: renamed from: a */
    public final ArrayList m20674a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8274h c8274h = (C8274h) it.next();
            VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = null;
            try {
                if (c8274h.f18450a != null) {
                    verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = (TextUtils.isEmpty(c8274h.f18454e) || TextUtils.isEmpty(c8274h.f18453d)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(c8274h.f18450a) : VerificationScriptResource.createVerificationScriptResourceWithParameters(c8274h.f18454e, c8274h.f18450a, c8274h.f18453d);
                }
            } catch (Throwable th) {
                m20675a(th);
            }
            if (verificationScriptResourceCreateVerificationScriptResourceWithoutParameters != null) {
                arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithoutParameters);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m20675a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th.getMessage();
        C8219t0 c8219t0 = this.f18447f;
        AbstractC8434z.m20811a(simpleName, str, c8219t0 != null ? c8219t0.f18373a : null, c8219t0 != null ? c8219t0.f18374b : null);
    }
}
