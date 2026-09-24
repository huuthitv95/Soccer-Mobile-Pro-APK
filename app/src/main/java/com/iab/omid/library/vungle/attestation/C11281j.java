package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.iab.omid.library.vungle.utils.C11313d;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.attestation.j */
/* JADX INFO: loaded from: classes6.dex */
public class C11281j implements InterfaceC11282k {

    /* JADX INFO: renamed from: d */
    private static volatile C11281j f23638d;

    /* JADX INFO: renamed from: a */
    private volatile Boolean f23639a;

    /* JADX INFO: renamed from: b */
    private volatile Boolean f23640b;

    /* JADX INFO: renamed from: c */
    private final Context f23641c;

    private C11281j(Context context) {
        this.f23641c = context;
        m24967c();
    }

    /* JADX INFO: renamed from: a */
    public static C11281j m24964a(Context context) {
        if (f23638d == null) {
            synchronized (C11281j.class) {
                if (f23638d == null) {
                    f23638d = new C11281j(context);
                }
            }
        }
        return f23638d;
    }

    @Override // com.iab.omid.library.vungle.attestation.InterfaceC11282k
    /* JADX INFO: renamed from: a */
    public boolean mo24965a() {
        return m24967c();
    }

    /* JADX INFO: renamed from: b */
    public boolean m24966b() {
        boolean zHasSystemFeature;
        if (this.f23640b != null) {
            return this.f23640b.booleanValue();
        }
        synchronized (this) {
            if (this.f23640b == null) {
                if (m24967c()) {
                    try {
                        PackageManager packageManager = this.f23641c.getPackageManager();
                        if (packageManager == null) {
                            C11313d.m25148b("PackageManager is null when checking attestation capability");
                            this.f23640b = Boolean.FALSE;
                        } else {
                            zHasSystemFeature = packageManager.hasSystemFeature("com.amazon.privacypass");
                            Boolean boolValueOf = Boolean.valueOf(zHasSystemFeature);
                            this.f23640b = boolValueOf;
                            boolValueOf.getClass();
                        }
                    } catch (SecurityException e) {
                        C11313d.m25147a("Security exception when checking attestation capability", e);
                        this.f23640b = Boolean.FALSE;
                        return false;
                    } catch (Exception e2) {
                        C11313d.m25147a("Unexpected error when checking attestation capability", e2);
                        this.f23640b = Boolean.FALSE;
                        return false;
                    }
                } else {
                    this.f23640b = Boolean.FALSE;
                }
                return false;
            }
            zHasSystemFeature = this.f23640b.booleanValue();
            return zHasSystemFeature;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m24967c() {
        boolean zBooleanValue;
        int i;
        if (this.f23639a != null) {
            return this.f23639a.booleanValue();
        }
        synchronized (this) {
            if (this.f23639a != null) {
                zBooleanValue = this.f23639a.booleanValue();
            } else {
                zBooleanValue = this.f23641c != null && Build.MANUFACTURER.equalsIgnoreCase("Amazon") && Build.MODEL.toLowerCase().startsWith("aft") && (i = Build.VERSION.SDK_INT) >= 25 && i <= 30;
                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                this.f23639a = boolValueOf;
                boolValueOf.getClass();
            }
        }
        return zBooleanValue;
    }
}
