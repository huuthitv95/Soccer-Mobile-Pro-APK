package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.od */
/* JADX INFO: loaded from: classes6.dex */
public final class C12409od {

    /* JADX INFO: renamed from: b */
    public static final a f31633b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final String f31634c = "type";

    /* JADX INFO: renamed from: d */
    public static final String f31635d = "single";

    /* JADX INFO: renamed from: e */
    public static final String f31636e = "onShowSuccess";

    /* JADX INFO: renamed from: f */
    public static final String f31637f = "onLoadSuccess";

    /* JADX INFO: renamed from: a */
    private final InterfaceC12527t6.c f31638a;

    /* JADX INFO: renamed from: com.ironsource.od$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public C12409od(JSONObject features) {
        InterfaceC12527t6.c cVar;
        Intrinsics.checkNotNullParameter(features, "features");
        String strOptString = features.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(f31635d)) {
                        cVar = InterfaceC12527t6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(f31636e)) {
                    cVar = InterfaceC12527t6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f31637f)) {
                cVar = InterfaceC12527t6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.f31638a = cVar;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC12527t6.c m32970a() {
        return this.f31638a;
    }
}
