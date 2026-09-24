package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.vb */
/* JADX INFO: loaded from: classes6.dex */
public class C12568vb {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f32608a;

    public C12568vb(C11426F0 c11426f0) {
        this.f32608a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m33953a(boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f32608a.m25748a(EnumC11372C0.LOAD_AD, map);
    }

    /* JADX INFO: renamed from: b */
    public void m33955b(int i) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i));
        this.f32608a.m25748a(EnumC11372C0.SKIP_RELOAD_AD, map);
    }

    /* JADX INFO: renamed from: b */
    public void m33956b(long j, int i) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        this.f32608a.m25748a(EnumC11372C0.RELOAD_AD_NO_FILL, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33944a() {
        this.f32608a.m25748a(EnumC11372C0.RELOAD_AD, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m33945a(int i) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i));
        this.f32608a.m25748a(EnumC11372C0.DESTROY_AD, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33951a(long j, boolean z) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f32608a.m25748a(EnumC11372C0.LOAD_AD_SUCCESS, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33946a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f32608a.m25748a(EnumC11372C0.RELOAD_AD_SUCCESS, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33950a(long j, int i, boolean z) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f32608a.m25748a(EnumC11372C0.LOAD_AD_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33949a(long j, int i, String str, boolean z) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f32608a.m25748a(EnumC11372C0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33948a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f32608a.m25748a(EnumC11372C0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33954a(boolean z, long j, boolean z2) {
        EnumC11372C0 enumC11372C0;
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        if (z2) {
            map.put("errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        C11426F0 c11426f0 = this.f32608a;
        if (z) {
            enumC11372C0 = EnumC11372C0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            enumC11372C0 = EnumC11372C0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        c11426f0.m25748a(enumC11372C0, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33947a(long j, int i) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i));
        this.f32608a.m25748a(EnumC11372C0.LOAD_AD_NO_FILL, map);
    }

    /* JADX INFO: renamed from: a */
    public void m33952a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f32608a.m25748a(bool.booleanValue() ? EnumC11372C0.AD_READY_TRUE : EnumC11372C0.AD_READY_FALSE, map);
    }
}
