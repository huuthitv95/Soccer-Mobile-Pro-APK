package com.fyber.inneractive.sdk.config.global.features;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.features.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C7974b extends AbstractC7981i {

    /* JADX INFO: renamed from: e */
    public static final EnumC7973a f17755e = EnumC7973a.OPEN;

    public C7974b() {
        super("ad_identifier");
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.AbstractC7981i
    /* JADX INFO: renamed from: b */
    public final AbstractC7981i mo20413b() {
        C7974b c7974b = new C7974b();
        m20418a(c7974b);
        return c7974b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC7973a m20414c() {
        String strMo20417a = mo20417a("identifier_click_action", f17755e.mKey);
        for (EnumC7973a enumC7973a : EnumC7973a.values()) {
            if (strMo20417a.equalsIgnoreCase(enumC7973a.mKey)) {
                return enumC7973a;
            }
        }
        return EnumC7973a.NONE;
    }
}
