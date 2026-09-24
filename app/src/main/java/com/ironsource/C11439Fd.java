package com.ironsource;

import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.Fd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11439Fd {

    /* JADX INFO: renamed from: a */
    private final C12461rb f24316a;

    /* JADX INFO: renamed from: b */
    private final Map<String, C12538u.d> f24317b;

    /* JADX INFO: renamed from: c */
    private final Map<String, C12538u.d> f24318c;

    public C11439Fd(C12461rb tools, Map<String, C12538u.d> map, Map<String, C12538u.d> map2) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        this.f24316a = tools;
        this.f24317b = map;
        this.f24318c = map2;
    }

    /* JADX INFO: renamed from: b */
    private final void m25793b(InterfaceC11559M7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objM25791a = m25791a(str2, num);
        if (Result.m44953isSuccessimpl(objM25791a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.mo25733a(str, str2, num.intValue());
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM25791a);
        if (thM44949exceptionOrNullimpl != null) {
            this.f24316a.m33243b(str, 3004, thM44949exceptionOrNullimpl.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25794a(InterfaceC11559M7.a rewardService) {
        Intrinsics.checkNotNullParameter(rewardService, "rewardService");
        Map<String, C12538u.d> map = this.f24318c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C12538u.d> entry : map.entrySet()) {
                String key = entry.getKey();
                C11403Dd c11403DdM33838f = entry.getValue().m33838f();
                if (c11403DdM33838f != null) {
                    m25793b(rewardService, key, c11403DdM33838f.m25627b(), c11403DdM33838f.m25626a());
                }
            }
        }
        Map<String, C12538u.d> map2 = this.f24317b;
        if (map2 == null || (r0 = map2.entrySet().iterator()) == null) {
            return;
        }
        for (Map.Entry<String, C12538u.d> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            C11403Dd c11403DdM33833a = entry2.getValue().m33833a();
            if (c11403DdM33833a != null) {
                m25792a(rewardService, key2, c11403DdM33833a.m25627b(), c11403DdM33833a.m25626a());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m25792a(InterfaceC11559M7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objM25791a = m25791a(str2, num);
        if (Result.m44953isSuccessimpl(objM25791a)) {
            Intrinsics.checkNotNull(str2);
            Intrinsics.checkNotNull(num);
            aVar.mo25735b(str, str2, num.intValue());
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM25791a);
        if (thM44949exceptionOrNullimpl != null) {
            this.f24316a.m33243b(str, 3004, thM44949exceptionOrNullimpl.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private final Object m25791a(String str, Integer num) {
        if (str != null && num != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(Unit.INSTANCE);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid")));
    }
}
