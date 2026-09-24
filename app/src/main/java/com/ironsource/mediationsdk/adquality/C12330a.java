package com.ironsource.mediationsdk.adquality;

import com.ironsource.C11540L6;
import com.ironsource.C12131c9;
import com.ironsource.EnumC12234he;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C12330a {

    /* JADX INFO: renamed from: a */
    public static final b f30989a = new b(null);

    /* JADX INFO: renamed from: b */
    private static a f30990b = a.DONT_INITIALIZE;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a */
    public enum a {
        DONT_INITIALIZE(0),
        LEVELPLAY_ONLY(1),
        ALL_MEDIATIONS(2),
        OTHER_ONLY(3);


        /* JADX INFO: renamed from: b */
        public static final C15542a f30991b = new C15542a(null);

        /* JADX INFO: renamed from: a */
        private final int f30997a;

        /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$a$a, reason: collision with other inner class name */
        public static final class C15542a {
            public /* synthetic */ C15542a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0017  */
            /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
            /* JADX INFO: renamed from: a */
            public final a m32256a(int i) {
                for (a aVar : a.values()) {
                    if (aVar.m32255b() == i) {
                        if (aVar == null) {
                            return a.DONT_INITIALIZE;
                        }
                        return aVar;
                    }
                }
                aVar = null;
                if (aVar == null) {
                    return a.DONT_INITIALIZE;
                }
                return aVar;
            }

            private C15542a() {
            }
        }

        a(int i) {
            this.f30997a = i;
        }

        /* JADX INFO: renamed from: b */
        public final int m32255b() {
            return this.f30997a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final a m32257a() {
            return C12330a.f30990b;
        }

        private b() {
        }

        /* JADX INFO: renamed from: a */
        public final void m32258a(a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "<set-?>");
            C12330a.f30990b = aVar;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.adquality.a$c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30998a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.LEVELPLAY_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ALL_MEDIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.OTHER_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30998a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m32253b() throws JSONException {
        EnumC12234he enumC12234he;
        JSONArray jSONArrayOptJSONArray = new C12131c9().m31267a().optJSONArray(C11540L6.f24975g0);
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            int i2 = jSONArrayOptJSONArray.getInt(i);
            EnumC12234he[] enumC12234heArrValues = EnumC12234he.values();
            int length2 = enumC12234heArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length2) {
                    enumC12234he = null;
                    break;
                }
                enumC12234he = enumC12234heArrValues[i3];
                if (enumC12234he.m31646b() == i2) {
                    break;
                }
                i3++;
            }
            if (enumC12234he != null) {
                linkedHashSet.add(enumC12234he);
            }
        }
        int i4 = c.f30998a[f30990b.ordinal()];
        if (i4 == 1) {
            return linkedHashSet.contains(EnumC12234he.LEVEL_PLAY_INIT);
        }
        if (i4 != 2) {
            if (i4 == 3) {
                return linkedHashSet.contains(EnumC12234he.EXTERNAL_MEDIATION_INIT);
            }
        } else if (linkedHashSet.contains(EnumC12234he.LEVEL_PLAY_INIT) || linkedHashSet.contains(EnumC12234he.EXTERNAL_MEDIATION_INIT)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m32252a(int i) {
        f30990b = a.f30991b.m32256a(i);
    }
}
