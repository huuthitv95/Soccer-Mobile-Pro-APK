package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.C8001m;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.C8359b;
import com.fyber.inneractive.sdk.network.C8376g;
import com.fyber.inneractive.sdk.network.C8390k1;
import com.fyber.inneractive.sdk.network.C8427v0;
import com.fyber.inneractive.sdk.network.EnumC8384i1;
import com.fyber.inneractive.sdk.network.InterfaceC8374f0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7948b0 implements InterfaceC8374f0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAConfigManager f17698a;

    public C7948b0(IAConfigManager iAConfigManager) {
        this.f17698a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8374f0
    /* JADX INFO: renamed from: a */
    public final void mo20331a(Object obj, Exception exc, boolean z) {
        int i;
        C8008h0 c8008h0 = (C8008h0) obj;
        if (c8008h0 != null) {
            if (z) {
                IAConfigManager iAConfigManager = this.f17698a;
                IAConfigManager iAConfigManager2 = IAConfigManager.f17654M;
                iAConfigManager.getClass();
                iAConfigManager.f17673e = c8008h0.f17781c;
                iAConfigManager.f17672d = c8008h0.f17780b;
                iAConfigManager.f17669a = c8008h0.f17782d;
                iAConfigManager.f17670b = c8008h0.f17783e;
            } else {
                IAConfigManager.f17655N = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.f17698a;
                iAConfigManager3.getClass();
                IAlog.m21945a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.f17673e = c8008h0.f17781c;
                iAConfigManager3.f17672d = c8008h0.f17780b;
                iAConfigManager3.f17669a = c8008h0.f17782d;
                iAConfigManager3.f17670b = c8008h0.f17783e;
            }
        } else if (exc instanceof C8376g) {
            IAConfigManager.f17655N = System.currentTimeMillis();
        }
        if (z) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.f17698a;
        IAConfigManager iAConfigManager5 = IAConfigManager.f17654M;
        if (iAConfigManager5.f17673e != null) {
            iAConfigManager4.m20381a(null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof C8390k1) ? !TextUtils.isEmpty(iAConfigManager4.f17671c.trim()) : (i = ((C8390k1) exc).f18665a) < 400 || i >= 500)) {
                iAConfigManager4.m20381a(new InvalidAppIdException());
            } else if (exc instanceof C8359b) {
                iAConfigManager4.m20381a(exc);
            } else {
                iAConfigManager4.m20381a(new C8010i0());
            }
        }
        if (iAConfigManager5.f17673e != null) {
            IAConfigManager iAConfigManager6 = this.f17698a;
            if (iAConfigManager6.f17658B == null) {
                iAConfigManager6.f17658B = new C8427v0(new C7962e0(iAConfigManager6), iAConfigManager6.f17674f, new C8001m());
            }
            EnumC8384i1 enumC8384i1 = iAConfigManager6.f17658B.f18716f;
            if (enumC8384i1 == EnumC8384i1.RUNNING || enumC8384i1 == EnumC8384i1.QUEUED) {
                return;
            }
            iAConfigManager5.f17686r.m20768a(iAConfigManager6.f17658B);
        }
    }
}
