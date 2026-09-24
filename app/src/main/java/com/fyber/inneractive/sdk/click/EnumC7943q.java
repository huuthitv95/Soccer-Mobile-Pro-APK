package com.fyber.inneractive.sdk.click;

import com.ironsource.C11744X3;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.click.q */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7943q {
    FAILED(C11744X3.i.f26392t),
    OPEN_GOOGLE_STORE(C11744X3.i.f26349U),
    OPENED_IN_INTERNAL_BROWSER("internal browser"),
    OPENED_IN_EXTERNAL_BROWSER("external browser"),
    INTERNAL_REDIRECT("internal redirect"),
    OPEN_IN_EXTERNAL_APPLICATION("external app"),
    DEEP_LINK("deep link"),
    OPENED_USING_CHROME_NAVIGATE("chrome navigate"),
    OPEN_INTERNAL_STORE("internal store");

    public String simpleName;

    EnumC7943q(String str) {
        this.simpleName = str;
    }
}
