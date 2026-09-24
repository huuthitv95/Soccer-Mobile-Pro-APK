package com.mbridge.msdk.dycreator.subjectfactory;

import com.mbridge.msdk.dycreator.viewobserver.AbstractC12988a;
import com.mbridge.msdk.dycreator.viewobserver.C12990c;
import com.mbridge.msdk.dycreator.viewobserver.C12991d;
import com.mbridge.msdk.dycreator.viewobserver.C12993f;
import com.mbridge.msdk.dycreator.viewobserver.C12995h;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a */
/* JADX INFO: compiled from: SubjectFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class C12977a {

    /* JADX INFO: renamed from: a */
    private static volatile C12977a f35369a;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a$a */
    /* JADX INFO: compiled from: SubjectFactory.java */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35370a;

        static {
            int[] iArr = new int[b.values().length];
            f35370a = iArr;
            try {
                iArr[b.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35370a[b.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35370a[b.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35370a[b.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a$b */
    /* JADX INFO: compiled from: SubjectFactory.java */
    public enum b {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private C12977a() {
    }

    /* JADX INFO: renamed from: a */
    public static C12977a m36380a() {
        if (f35369a == null) {
            synchronized (C12977a.class) {
                if (f35369a == null) {
                    f35369a = new C12977a();
                }
            }
        }
        return f35369a;
    }

    /* JADX INFO: renamed from: a */
    public <T extends AbstractC12988a> T m36381a(b bVar) {
        int i = a.f35370a[bVar.ordinal()];
        if (i == 1) {
            return new C12991d();
        }
        if (i == 2) {
            return new C12990c();
        }
        if (i == 3) {
            return new C12993f();
        }
        if (i != 4) {
            return null;
        }
        return new C12995h();
    }
}
