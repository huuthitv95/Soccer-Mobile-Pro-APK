package com.google.android.play.core.assetpacks;

import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.es */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC10075es {
    AbstractC10075es() {
    }

    /* JADX INFO: renamed from: a */
    abstract int mo22591a();

    /* JADX INFO: renamed from: b */
    abstract long mo22592b();

    /* JADX INFO: renamed from: c */
    abstract String mo22593c();

    /* JADX INFO: renamed from: d */
    abstract boolean mo22594d();

    /* JADX INFO: renamed from: e */
    abstract boolean mo22595e();

    /* JADX INFO: renamed from: f */
    abstract byte[] mo22596f();

    /* JADX INFO: renamed from: g */
    final boolean m22698g() {
        if (mo22593c() == null) {
            return false;
        }
        return mo22593c().endsWith(RemoteSettings.FORWARD_SLASH_STRING);
    }

    /* JADX INFO: renamed from: h */
    final boolean m22699h() {
        return mo22591a() == 0;
    }
}
