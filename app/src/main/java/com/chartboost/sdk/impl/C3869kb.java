package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.kb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3869kb {

    /* JADX INFO: renamed from: a */
    public static final C3869kb f15059a = new C3869kb();

    /* JADX INFO: renamed from: a */
    public final C3846jb m18395a(Element element) {
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "apiFramework");
        String strM18694b2 = c3925ml.m18694b(element, "browserOptional");
        String str = null;
        Boolean boolValueOf = strM18694b2 != null ? Boolean.valueOf(Boolean.parseBoolean(strM18694b2)) : null;
        String textContent = element.getTextContent();
        if (textContent != null && (string = StringsKt.trim((CharSequence) textContent).toString()) != null && string.length() > 0) {
            str = string;
        }
        return new C3846jb(strM18694b, boolValueOf, str);
    }
}
