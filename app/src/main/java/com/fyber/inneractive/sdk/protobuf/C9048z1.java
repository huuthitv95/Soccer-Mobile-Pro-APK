package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.z1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9048z1 {
    /* JADX INFO: renamed from: a */
    public static C9043y1 m21850a(Object obj, Object obj2) {
        C9043y1 c9043y1 = (C9043y1) obj;
        C9043y1 c9043y2 = (C9043y1) obj2;
        if (c9043y2.isEmpty()) {
            return c9043y1;
        }
        if (!c9043y1.f21182a) {
            c9043y1 = c9043y1.isEmpty() ? new C9043y1() : new C9043y1(c9043y1);
        }
        if (!c9043y1.f21182a) {
            throw new UnsupportedOperationException();
        }
        if (!c9043y2.isEmpty()) {
            c9043y1.putAll(c9043y2);
        }
        return c9043y1;
    }
}
