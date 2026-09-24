package com.ironsource;

import com.ironsource.mediationsdk.metadata.C12364a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.xf */
/* JADX INFO: loaded from: classes6.dex */
public final class C12608xf {

    /* JADX INFO: renamed from: a */
    public static final C12608xf f33185a = new C12608xf();

    private C12608xf() {
    }

    /* JADX INFO: renamed from: a */
    public final void m34182a(int i) {
        m34180a(EnumC12598x5.TEST_SUITE_FAILED_TO_OPEN, Integer.valueOf(i), null);
    }

    /* JADX INFO: renamed from: b */
    public final void m34184b() {
        m34181a(this, EnumC12598x5.TEST_SUITE_LAUNCH_TS, null, null, 6, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m34185c() {
        m34181a(this, EnumC12598x5.TEST_SUITE_OPENED_SUCCESSFULLY, null, null, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m34186d() throws JSONException {
        m34181a(this, EnumC12598x5.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY, null, null, 6, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m34183a(String errorReason) throws JSONException {
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        m34180a(EnumC12598x5.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD, Integer.valueOf(IronSourceConstants.errorCode_TEST_SUITE_WEB_CONTROLLER_NOT_LOADED), errorReason);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m34181a(C12608xf c12608xf, EnumC12598x5 enumC12598x5, Integer num, String str, int i, Object obj) throws JSONException {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c12608xf.m34180a(enumC12598x5, num, str);
    }

    /* JADX INFO: renamed from: a */
    private final void m34180a(EnumC12598x5 enumC12598x5, Integer num, String str) throws JSONException {
        C11459Gf c11459Gf = C11459Gf.f24392a;
        JSONObject jSONObjectM25937a = c11459Gf.m25937a(false);
        if (num != null) {
            jSONObjectM25937a.put("errorCode", num.intValue());
            JSONArray jSONArrayM34179a = m34179a();
            if (jSONArrayM34179a != null) {
                jSONObjectM25937a.put(C12364a.f31320f, jSONArrayM34179a);
            }
        }
        if (str != null) {
            jSONObjectM25937a.put("reason", str);
        }
        c11459Gf.m25940a(enumC12598x5, jSONObjectM25937a);
    }

    /* JADX INFO: renamed from: a */
    private final JSONArray m34179a() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapM25949d = C11459Gf.f24392a.m25949d();
        if (concurrentHashMapM25949d.containsKey(C12364a.f31320f)) {
            return new JSONArray((Collection) concurrentHashMapM25949d.get(C12364a.f31320f));
        }
        return null;
    }
}
