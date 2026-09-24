package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C7994v extends AbstractC7981i {

    /* JADX INFO: renamed from: e */
    public static final EnumC7993u f17761e = EnumC7993u.NONE;

    public C7994v() {
        super("video_player");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7994v c7994v = new C7994v();
        m20418a(c7994v);
        return c7994v;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC7993u m20427c() {
        String strMo20417a = mo20417a("click_action", f17761e.mKey);
        for (EnumC7993u enumC7993u : EnumC7993u.values()) {
            if (strMo20417a.equalsIgnoreCase(enumC7993u.mKey)) {
                return enumC7993u;
            }
        }
        return EnumC7993u.NONE;
    }
}
