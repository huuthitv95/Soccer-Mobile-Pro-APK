package com.bytedance.sdk.component.p160lr.p161ri;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class jbs {

    /* JADX INFO: renamed from: lr */
    private String f7545lr;

    /* JADX INFO: renamed from: ri */
    private String f7546ri;

    private jbs(String str) {
        this.f7546ri = str;
    }

    /* JADX INFO: renamed from: ri */
    public static jbs m9914ri(String str) {
        return new jbs(str);
    }

    /* JADX INFO: renamed from: ri */
    public String m9915ri() {
        return this.f7546ri;
    }

    /* JADX INFO: renamed from: ri */
    public Charset m9916ri(Charset charset) {
        try {
            String str = this.f7545lr;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
