package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3818i6 {

    /* JADX INFO: renamed from: d */
    public static final a f14559d = new a(null);

    /* JADX INFO: renamed from: e */
    public static volatile C3795h6 f14560e;

    /* JADX INFO: renamed from: a */
    public final Context f14561a;

    /* JADX INFO: renamed from: b */
    public final C4021r6 f14562b;

    /* JADX INFO: renamed from: c */
    public final C3864k6 f14563c;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.i6$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3795h6 m17963a() {
            return C3818i6.f14560e;
        }
    }

    public C3818i6(Context context, C4021r6 displayMeasurement, C3864k6 deviceFieldsWrapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        Intrinsics.checkNotNullParameter(deviceFieldsWrapper, "deviceFieldsWrapper");
        this.f14561a = context;
        this.f14562b = displayMeasurement;
        this.f14563c = deviceFieldsWrapper;
    }

    /* JADX INFO: renamed from: b */
    public final C3795h6 m17962b() {
        try {
            C4043s6 c4043s6M19302a = this.f14562b.m19302a();
            C4043s6 c4043s6M19306d = this.f14562b.m19306d();
            String packageName = this.f14561a.getPackageName();
            int iM19388b = c4043s6M19302a.m19388b();
            int iM19387a = c4043s6M19302a.m19387a();
            int iM19388b2 = c4043s6M19306d.m19388b();
            int iM19387a2 = c4043s6M19306d.m19387a();
            float fM19304b = this.f14562b.m19304b();
            String strValueOf = String.valueOf(this.f14562b.m19305c());
            int iM18352a = this.f14563c.m18352a();
            String strM18353b = this.f14563c.m18353b();
            PackageManager packageManager = this.f14561a.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            Intrinsics.checkNotNull(packageName);
            C3795h6 c3795h6 = new C3795h6(iM19388b, iM19387a, iM19388b2, iM19387a2, fM19304b, strValueOf, iM18352a, strM18353b, packageName, AbstractC3912m8.getPackageVersionName(packageManager, packageName), this.f14563c.m18354c());
            f14560e = c3795h6;
            return c3795h6;
        } catch (Exception e) {
            C4048sb.m19410b("Cannot create device body", e);
            return new C3795h6(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
        }
    }
}
