package com.ironsource;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.Tf */
/* JADX INFO: loaded from: classes6.dex */
public class C11688Tf {

    /* JADX INFO: renamed from: a */
    private final C11426F0 f25821a;

    public C11688Tf(C11426F0 c11426f0) {
        this.f25821a = c11426f0;
    }

    /* JADX INFO: renamed from: a */
    public void m27538a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f25821a.m25748a(EnumC11372C0.COLLECT_TOKENS_COMPLETED, map);
    }

    /* JADX INFO: renamed from: b */
    public void m27543b(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25821a.m25748a(EnumC11372C0.INSTANCE_COLLECT_TOKEN_TIMED_OUT, map2);
    }

    /* JADX INFO: renamed from: a */
    public void m27539a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f25821a.m25748a(EnumC11372C0.COLLECT_TOKENS_FAILED, map);
    }

    /* JADX INFO: renamed from: a */
    public void m27537a() {
        this.f25821a.m25748a(EnumC11372C0.COLLECT_TOKEN, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public void m27540a(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25821a.m25748a(EnumC11372C0.INSTANCE_COLLECT_TOKEN, map2);
    }

    /* JADX INFO: renamed from: a */
    public void m27541a(Map<String, Object> map, long j) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25821a.m25748a(EnumC11372C0.INSTANCE_COLLECT_TOKEN_SUCCESS, map2);
    }

    /* JADX INFO: renamed from: a */
    public void m27542a(Map<String, Object> map, long j, String str) {
        HashMap map2 = new HashMap();
        map2.put("duration", Long.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            map2.put("reason", str);
        }
        if (map != null && !map.isEmpty()) {
            map2.putAll(map);
        }
        this.f25821a.m25748a(EnumC11372C0.INSTANCE_COLLECT_TOKEN_FAILED, map2);
    }
}
